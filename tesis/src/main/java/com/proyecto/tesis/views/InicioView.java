package com.proyecto.tesis.views;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.prefs.BackingStoreException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.model.StreamedContent;

import com.proyecto.tesis.dto.HistoricoDTO;
import com.proyecto.tesis.enums.StatusInvitacion;
import com.proyecto.tesis.service.CatalogosService;
import com.proyecto.tesis.service.DestinatarioService;
import com.proyecto.tesis.service.MensajesService;
import com.proyecto.tesis.service.TelefonosService;
import com.proyecto.tesis.service.UsuarioService;
import com.proyecto.tesis.service.VehiculoService;
import com.proyecto.tesis.util.MensajeGrowl;
import com.proyecto.tesis.util.TelefonoUtil;
import com.proyecto.tesisws.interfaces.Destinatarios;
import com.proyecto.tesisws.interfaces.Marcas;
import com.proyecto.tesisws.interfaces.Modelos;
import com.proyecto.tesisws.interfaces.Telefonos;
import com.proyecto.tesisws.interfaces.Tipomensaje;
import com.proyecto.tesisws.interfaces.Tipovehiculo;
import com.proyecto.tesisws.interfaces.Usuarios;
import com.proyecto.tesisws.interfaces.VehiculoDTO;

@ManagedBean
@ViewScoped
public class InicioView implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{vehiculoService}")
	private VehiculoService vehiculoService;
	@ManagedProperty("#{catalogosService}")
	private CatalogosService catalogosService;
	@ManagedProperty("#{destinatarioService}")
	private DestinatarioService destinatarioService;
	@ManagedProperty("#{telefonosService}")
	private TelefonosService telefonosService;
	@ManagedProperty("#{usuarioService}")
	private UsuarioService usuarioService;
	
	private List<Marcas> marcas;
	private List<Modelos> modelos;
	private List<Tipovehiculo> tiposVehiculos;
	
	private Usuarios usuario;
	private Usuarios usuarioAuxiliar;
	private List<VehiculoDTO> vehiculos;
	private VehiculoDTO vehiculoDTO;
	private StreamedContent imagen;
	private boolean editar;
	private Destinatarios destinatario;
	private List<Destinatarios> destinatarios;
	private boolean editarDest;
	private List<Telefonos> telefonos;
	private List<Telefonos> telefonosAux;
	private Integer mes;
	private Integer anio;
	private Map<Integer, String> anios;
	private List<HistoricoDTO> mensajes;
	private List<HistoricoDTO> mensajesFiltrado;

	@PostConstruct
 	public void init(){
		obtenerUsuarioenSesion();
	    usuario.setId(usuario.getId()==null?1:usuario.getId());
	    obtenerVehiculosPorUsuario();
	    vehiculoDTO = new VehiculoDTO();
	    vehiculoDTO.setMarca(new Marcas());
	    vehiculoDTO.getMarca().setId(1);
	    obtenerInformacionInicial();
	    mes = 1;
	    anios = new LinkedHashMap<Integer, String>();
	    obtenerAnios();
	    destinatario = new Destinatarios();
	    mensajesFiltrado = new ArrayList<HistoricoDTO>();
	}
	
	
	public void guardarVehiculo(){
		if(editar){
			actualizarVehiculo();
		}else{
			agregarVehiculo();
		}
	}
	
	public void agregarVehiculo(){System.out.println("Entró a agregarVehiculo");
		try {
			vehiculoDTO.setTelefono(TelefonoUtil.convertirTelefono(vehiculoDTO.getTelefono()));
			boolean exito = vehiculoService.insertarVehiculo(vehiculoDTO, usuario.getId());
			if(exito){
				new MensajeGrowl(FacesContext.getCurrentInstance(), "El vehículo se registró exitosamente", FacesMessage.SEVERITY_INFO);
				obtenerVehiculosPorUsuario();
				limpiarVehiculo(null);
				RequestContext.getCurrentInstance().addCallbackParam("guardado", true);
			}else{
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Ya existe un registro con el mismo número de placas, teléfono, llave o llave de invitación",
																								FacesMessage.SEVERITY_ERROR);
				RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
			}
			
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al intentar guardar el vehículo: "+e.getMessage(), 
																					FacesMessage.SEVERITY_FATAL);
			RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
		}
	}

	public void actualizarVehiculo(){System.out.println("Entró a actualizarVehiculo");
		try{
			vehiculoDTO.setTelefono(TelefonoUtil.convertirTelefono(vehiculoDTO.getTelefono()));
			boolean exito = vehiculoService.actualizarVehiculo(vehiculoDTO, usuario.getId());
			if(exito){
				new MensajeGrowl(FacesContext.getCurrentInstance(), "El vehículo se actualizó correctamente", FacesMessage.SEVERITY_INFO);
				obtenerVehiculosPorUsuario();
				limpiarVehiculo(null);
				RequestContext.getCurrentInstance().addCallbackParam("guardado", true);
			}else{
				obtenerVehiculosPorUsuario();
				new MensajeGrowl(FacesContext.getCurrentInstance(), "No se pudo actualizar el vehiculo porque ya existe un "
						+ "vehículo con esas placas o llaves", FacesMessage.SEVERITY_ERROR);
			}
		}catch(Exception ex){
			obtenerVehiculosPorUsuario();
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al actualizar el vehículo: "+ex.getMessage(), FacesMessage.SEVERITY_FATAL);
		}
	}
	
	public void eliminarVehiculo() {
		System.out.println("Entró en eliminar vehículo");
		System.out.println("ID de vehiculo: "+vehiculoDTO.getId()+", Marca: "+vehiculoDTO.getMarca().getNombre());
		if(vehiculoDTO.getId()!=null){
			try {
				boolean exito = vehiculoService.eliminarVehiculoPorId(vehiculoDTO.getId());
				if(exito){
					new MensajeGrowl(FacesContext.getCurrentInstance(), "El vehículo se eliminó exitosamente", 
							FacesMessage.SEVERITY_INFO);
				}else{
					new MensajeGrowl(FacesContext.getCurrentInstance(), "No se encontró el registro que se deseaba eliminar", 
							FacesMessage.SEVERITY_ERROR);
				}
			} catch (Exception e) {
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al intentar eliminar el registro: "+e.getMessage(), 
						FacesMessage.SEVERITY_FATAL);
			}
		}
		obtenerVehiculosPorUsuario();
		destinatarios = new ArrayList<Destinatarios>();
		vehiculoDTO = new VehiculoDTO();
	}
	
	public void obtenerVehiculosPorUsuario(){
		try {
			vehiculos = vehiculoService.obtenerVehiculosPorIdUsuario(usuario.getId());
			obtenerImagenMarca();
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al obtener vehículos", FacesMessage.SEVERITY_FATAL);
		}
	}
	
	public void editarVehiculo(){
		try {
			modelos = catalogosService.obtenerModelosPorIdMarca(vehiculoDTO.getMarca().getId());
			editar = true;
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al cargar los modelos: "+e.getMessage(),
					FacesMessage.SEVERITY_FATAL);
		}
		
	}
	
	public void obtenerDestinatariosPorVehiculo(){
		try {
			destinatarios = destinatarioService.obtenerDestinatariosPorIdVehiculo(vehiculoDTO.getId());
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al cargar los destinatarios: "+e.getMessage(),
					FacesMessage.SEVERITY_FATAL);
		}
	}
	
	public void guardarDestinatario(){
		if(editarDest){
			actualizarDestinatario();
		}else{
			agregarDestinatario();
		}
	}
	
	public void agregarDestinatario(){
		if(vehiculoDTO != null && vehiculoDTO.getId() != null){
			try{
				destinatario.setIdVehiculo(vehiculoDTO.getId());
				destinatario.setStatusInvitacion(StatusInvitacion.NO_ENVIADA.getId());
				destinatario.setTelefono(TelefonoUtil.convertirTelefono(destinatario.getTelefono()));
				boolean exito = destinatarioService.insertarDestinatario(destinatario);
				if(exito){
					obtenerDestinatariosPorVehiculo();
					new MensajeGrowl(FacesContext.getCurrentInstance(), "El destinatario se agregó exitosamente", FacesMessage.SEVERITY_INFO);
					RequestContext.getCurrentInstance().addCallbackParam("guardado", true);
				}else{
					new MensajeGrowl(FacesContext.getCurrentInstance(), "No se pudo agregar el destinatario", FacesMessage.SEVERITY_ERROR);
				}
			}catch(Exception ex){
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al agregar el destinatario: "+ex.getMessage(), FacesMessage.SEVERITY_FATAL);
			}
		}else{
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Primero debe seleccionar el vehículo al que se le agregará el destinatario ", FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void actualizarDestinatario(){
		if(destinatario != null && vehiculoDTO != null && destinatario.getId() != null  && vehiculoDTO.getId() != null){
			try {
				destinatario.setTelefono(TelefonoUtil.convertirTelefono(destinatario.getTelefono()));
				boolean exito = destinatarioService.actualizarDestinatario(destinatario);
				if(exito){
					new MensajeGrowl(FacesContext.getCurrentInstance(), "El destinatario se actualizó exitosamente", FacesMessage.SEVERITY_INFO);
					RequestContext.getCurrentInstance().addCallbackParam("guardado", true);
					destinatario = new Destinatarios();
				}else{
					new MensajeGrowl(FacesContext.getCurrentInstance(), "No se encontró el registro que se deseaba actualizar", FacesMessage.SEVERITY_ERROR);
					RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
				}
			} catch (Exception e) {
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al intentar actualizar el registro", FacesMessage.SEVERITY_FATAL);
				RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
			}
		}else{
			new MensajeGrowl(FacesContext.getCurrentInstance(), "La información que desea actualizar es incorrecta", FacesMessage.SEVERITY_ERROR);
			RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
		}
	}
	
	public void actualizarUsuario(){
		try {
			
			boolean exito = usuarioService.actualizarUsuario(usuarioAuxiliar, telefonosAux);
			if(exito){
				usuario = usuarioService.obtenerUsuarioPorId(usuario.getId());
				telefonos = telefonosService.obtenerTelefonosPorIdUsuario(usuario.getId());
				cambiarDatosUsuarioEnSesion();
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Los datos del usuario se actualizaron correctamente", FacesMessage.SEVERITY_INFO);
			}else{
				new MensajeGrowl(FacesContext.getCurrentInstance(), "No se pudieron actualizar los datos del usuario", FacesMessage.SEVERITY_ERROR);
			}
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al intentar actualizar los datos: "+e.getMessage(), FacesMessage.SEVERITY_FATAL);
		}
		
	}
	
	public void eliminarDestinatario(){
		if(destinatario != null && destinatario.getId()!=null){
			try {
				boolean exito = destinatarioService.eliminarDestinatario(destinatario.getId());
				if(exito){
					destinatarios.remove(destinatario);
					new MensajeGrowl(FacesContext.getCurrentInstance(), "El destinatario se eliminó exitosamente", FacesMessage.SEVERITY_INFO);
				}else{
					new MensajeGrowl(FacesContext.getCurrentInstance(), "No se pudo eliminar el destinatario", FacesMessage.SEVERITY_ERROR);
				}
			} catch (Exception e) {
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al intentar eliminar el destinatario", FacesMessage.SEVERITY_ERROR);
			}
		}else{
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Debe seleccionar un destinatario", FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void enviarInvitacion(){
		boolean exito = destinatarioService.enviarInvitacion(vehiculoDTO.getId(), destinatario.getId());
		if(exito){
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Se envió la invitación a "+destinatario.getNombre()
				+" "+destinatario.getAPaterno()	, FacesMessage.SEVERITY_INFO);
			obtenerDestinatariosPorVehiculo();
		}else{
			new MensajeGrowl(FacesContext.getCurrentInstance(), "No se pudo enviar la invitación, intente de nuevo", 
					FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void revisarSensores(){
		boolean exito = vehiculoService.revisarSensores(vehiculoDTO.getId());
		if(exito){
			new MensajeGrowl(FacesContext.getCurrentInstance(), "En breve recibirá el reporte de la revisión de sensores", FacesMessage.SEVERITY_INFO);
			//obtenerDestinatariosPorVehiculo();
		}else{
			new MensajeGrowl(FacesContext.getCurrentInstance(), "No se pudo enviar la solicitud de revisión de "
					+ "sensores, intente de nuevo", FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void obtenerHistoricoPorFecha(){
		if(mes!=null && anio != null){
			mensajes = vehiculoService.obtenerHistoricoProFecha(mes, anio, vehiculoDTO.getId());
		//	mensajesFiltrado = mensajes;
		}
	}
	
	public void cambiarStatus(){System.out.println("Entró a cambiarStatus");
		try {
			boolean exito = vehiculoService.actualizarStatusVehiculo(vehiculoDTO.getId(), vehiculoDTO.getStatus().getId());
			if(exito){
				obtenerVehiculosPorUsuario();
				new MensajeGrowl(FacesContext.getCurrentInstance(), "El status cambió exitosamente", FacesMessage.SEVERITY_INFO);
			}else{
				new MensajeGrowl(FacesContext.getCurrentInstance(), "No se encontró el registro para cambia el status", FacesMessage.SEVERITY_ERROR);
			}
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al intentar cambiar el status", FacesMessage.SEVERITY_FATAL);
		}
	}
	
	public void onCambioMarca(){
		try {
			modelos = catalogosService.obtenerModelosPorIdMarca(vehiculoDTO.getMarca().getId());
			obtenerImagen();
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al cargar los modelos: "+e.getMessage(),
					FacesMessage.SEVERITY_FATAL);
		}
		
	}
	
	public void onCambioModelo(){
	//	System.out.println("Nombre modelo: "+modelos.get(idModelo).getNombre());
	}
	
	public StreamedContent obtenerImagen(){
		FacesContext contexto = FacesContext.getCurrentInstance();
//        try{
//			if(vehiculo.getIdMarca() == MarcasEnum.ACURA.getId()){
//				
//			}else if(vehiculo.getIdMarca() == MarcasEnum.AUDI.getId()){
//				getClass().getResourceAsStream("imagenes/fiat.png");
//				imagen = new DefaultStreamedContent(new FileInputStream(new File("/tesis/src/main/resources/imagenes/fiat.png")), "image/png");
//				imagen = new DefaultStreamedContent(getClass().getResourceAsStream("/imagenes/fiat.png"), "image/png");
//				ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//				InputStream inputStream = (InputStream) contextClassLoader.getResourceAsStream("resources/imagenes/"+"fiat" + ".png");
//				InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/fiat.png");
//				return new DefaultStreamedContent(stream, "image/png");
				   
//			}
//		}catch(Exception ex){
//			new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al cargar la imagen de la marca", 
//																			FacesMessage.SEVERITY_FATAL);
//		}
		return null;
	}
	
	public void limpiarVehiculo(ActionEvent event){
		try {
			vehiculoDTO = new VehiculoDTO();
			vehiculoDTO.getMarca().setId(1);
			modelos = catalogosService.obtenerModelosPorIdMarca(vehiculoDTO.getMarca().getId());
			editar = false;
		} catch (Exception e) {
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al cargar los modelos: "+e.getMessage(),
					FacesMessage.SEVERITY_FATAL);
		}
	}
	
	public void limpiarDestinatario(){
		destinatario = new Destinatarios();
		editar = false;
	}
	
	public void limpiarValidacion(){
		System.out.println("Entrar a limpiarValidacion");
	//	RequestContext.getCurrentInstance().addCallbackParam("validationFailed", false);
	//	RequestContext.getCurrentInstance().reset("itPlacas");
		RequestContext.getCurrentInstance().update("pnlAgregarVeh");
	}
	
	public void prepararUsuarioAuxiliar(ActionEvent event){
		usuarioAuxiliar = new Usuarios();
		usuarioAuxiliar.setId(usuario.getId());
		usuarioAuxiliar.setNombre(usuario.getNombre());
		usuarioAuxiliar.setAPaterno(usuario.getAPaterno());
		usuarioAuxiliar.setAMaterno(usuario.getAMaterno());
		telefonosAux = new ArrayList<Telefonos>();
		for(Telefonos telefono : telefonos){
			telefonosAux.add(telefono);
		}
	}
	
	public void agregarTelefono(){
		Telefonos tel = new Telefonos();
		tel.setTelefono("0");
		telefonosAux.add(tel);
	}
	
	public void eliminarTelefono(Telefonos telefono){
		if(telefonosAux.size() > 1){
			telefonosAux.remove(telefono);
		}else{
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Debe tener al menos un teléfono registrado", 
						FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void obtenerUsuarioenSesion(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
	    Map<String, Object> sessionMap = externalContext.getSessionMap();
	    usuario = (Usuarios) sessionMap.get("User");
	}
	
	public void cambiarDatosUsuarioEnSesion(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
	    Map<String, Object> sessionMap = externalContext.getSessionMap();
	    sessionMap.put("User", usuario);
	}
	
	public void obtenerInformacionInicial(){
			try {
				marcas = catalogosService.obtenerMarcas();
				modelos = catalogosService.obtenerModelosPorIdMarca(vehiculoDTO.getMarca().getId());
				tiposVehiculos = catalogosService.obtenerTiposDeVehiculo();
				telefonos = telefonosService.obtenerTelefonosPorIdUsuario(usuario.getId());
			} catch (Exception e) {
				new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error al cargar los catálogos: "+e.getMessage(), 
						FacesMessage.SEVERITY_FATAL);
			}
	}
	
	public void obtenerImagenMarca(){
		for(VehiculoDTO vehiculo : vehiculos){
//			if(vehiculoDTO.getMarca().getId()==1){
//				
//			}
		//	vehiculo.setNombreImagen("vw.png");
		}
		
	}
	
	private void obtenerAnios(){
		Calendar cal = Calendar.getInstance();
		Integer anio = cal.get(Calendar.YEAR);
		anios.put(anio, anio.toString());
		anios.put(anio-1, String.valueOf(anio-1));
		anios.put(anio-2, String.valueOf(anio-2));
	}
	
	private void backupVehiculo(VehiculoDTO origen, VehiculoDTO destino){
		if(origen != null && destino != null){
			destino.setId(origen.getId());
			destino.setMarca(origen.getMarca());
			destino.setModelo(origen.getModelo());
			destino.setPlacas(origen.getPlacas());
			destino.setStatus(origen.getStatus());
			destino.setTelefono(origen.getTelefono());
			destino.setTipo(origen.getTipo());
		}
	}
	////////   GETTERS Y SETTERS   ///////
	
	public VehiculoService getVehiculoService() {
		return vehiculoService;
	}

	public void setVehiculoService(VehiculoService vehiculoService) {
		this.vehiculoService = vehiculoService;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public List<Marcas> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marcas> marcas) {
		this.marcas = marcas;
	}

	public List<Modelos> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelos> modelos) {
		this.modelos = modelos;
	}

	public StreamedContent getImagen() {
		return imagen;
	}

	public void setImagen(StreamedContent imagen) {
		this.imagen = imagen;
	}

	public List<VehiculoDTO> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<VehiculoDTO> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public VehiculoDTO getVehiculoDTO() {
		return vehiculoDTO;
	}

	public void setVehiculoDTO(VehiculoDTO vehiculoDTO) {
		this.vehiculoDTO = vehiculoDTO;
	}

	public boolean isEditar() {
		return editar;
	}

	public void setEditar(boolean editar) {
		this.editar = editar;
	}

	public DestinatarioService getDestinatarioService() {
		return destinatarioService;
	}

	public void setDestinatarioService(DestinatarioService destinatarioService) {
		this.destinatarioService = destinatarioService;
	}

	public Destinatarios getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatarios destinatario) {
		this.destinatario = destinatario;
	}

	public List<Destinatarios> getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(List<Destinatarios> destinatarios) {
		this.destinatarios = destinatarios;
	}

	public boolean isEditarDest() {
		return editarDest;
	}

	public void setEditarDest(boolean editarDest) {
		this.editarDest = editarDest;
	}

	public CatalogosService getCatalogosService() {
		return catalogosService;
	}

	public void setCatalogosService(CatalogosService catalogosService) {
		this.catalogosService = catalogosService;
	}

	public List<Tipovehiculo> getTiposVehiculos() {
		return tiposVehiculos;
	}

	public void setTiposVehiculos(List<Tipovehiculo> tiposVehiculos) {
		this.tiposVehiculos = tiposVehiculos;
	}

	public TelefonosService getTelefonosService() {
		return telefonosService;
	}

	public void setTelefonosService(TelefonosService telefonosService) {
		this.telefonosService = telefonosService;
	}

	public List<Telefonos> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefonos> telefonos) {
		this.telefonos = telefonos;
	}

	public Usuarios getUsuarioAuxiliar() {
		return usuarioAuxiliar;
	}

	public void setUsuarioAuxiliar(Usuarios usuarioAuxiliar) {
		this.usuarioAuxiliar = usuarioAuxiliar;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public List<Telefonos> getTelefonosAux() {
		return telefonosAux;
	}

	public void setTelefonosAux(List<Telefonos> telefonosAux) {
		this.telefonosAux = telefonosAux;
	}


	public Integer getMes() {
		return mes;
	}


	public void setMes(Integer mes) {
		this.mes = mes;
	}


	public Integer getAnio() {
		return anio;
	}


	public void setAnio(Integer anio) {
		this.anio = anio;
	}


	public Map<Integer, String> getAnios() {
		return anios;
	}


	public void setAnios(Map<Integer, String> anios) {
		this.anios = anios;
	}


	public List<HistoricoDTO> getMensajes() {
		return mensajes;
	}


	public void setMensajes(List<HistoricoDTO> mensajes) {
		this.mensajes = mensajes;
	}


	public List<HistoricoDTO> getMensajesFiltrado() {
		return mensajesFiltrado;
	}


	public void setMensajesFiltrado(List<HistoricoDTO> mensajesFiltrado) {
		this.mensajesFiltrado = mensajesFiltrado;
	}

	
}
