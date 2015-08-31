package com.proyecto.tesis.views;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.proyecto.tesis.service.UsuarioService;
import com.proyecto.tesis.util.MensajeGrowl;
import com.proyecto.tesis.util.TelefonoUtil;
import com.proyecto.tesisws.interfaces.Usuarios;


@ManagedBean
@ViewScoped
public class LoginView implements Serializable{

	private static final long serialVersionUID = 1L;

//	@ManagedProperty("#{marcasService}")
//	private MarcasService marcasService;
	@ManagedProperty("#{usuarioService}")
	private UsuarioService usuarioService;
	
	private String usuario;
	private String password;
	private String passwordConfirm;
	private Usuarios usuarioRegistro;
	private String telefono;

	
	@PostConstruct
	public void init(){
		usuarioRegistro = new Usuarios();
		System.out.println("Entró al Managed Bean de LoginView");
	//	user.setNombre("Mou");user.setaPaterno("Lin");user.setaMaterno("Rui");
	}
	
	public void registrarUsuario(){
		try{
			boolean exito = usuarioService.registrarUsuario(usuarioRegistro, TelefonoUtil.convertirTelefono(telefono));
			if(exito){
				new MensajeGrowl(FacesContext.getCurrentInstance(), "El usuario se registró exitosamente", 
																						FacesMessage.SEVERITY_INFO);
				RequestContext.getCurrentInstance().addCallbackParam("guardado", true);
				usuarioRegistro = new Usuarios();
			}
			else{
				new MensajeGrowl(FacesContext.getCurrentInstance(), "El nombre de usuario ya está registrado", 
						FacesMessage.SEVERITY_ERROR);
				RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
			}
		}catch(Exception ex){
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Error al registrar al usuario: "+ex.getMessage(), 
						FacesMessage.SEVERITY_FATAL);
			RequestContext.getCurrentInstance().addCallbackParam("guardado", false);
			usuarioRegistro = new Usuarios();
		}
		
	}
	
	
	public String login(){
		try{
			usuarioRegistro = usuarioService.obtenerUsuario(usuario);
			if(usuarioRegistro!=null){
				if(usuarioRegistro.getPassword().contentEquals(password)){
					new MensajeGrowl(FacesContext.getCurrentInstance(), "Bienvenido!"+usuarioRegistro.getNombre()+" "+
																	usuarioRegistro.getAPaterno(), FacesMessage.SEVERITY_INFO);
					
					ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
				    Map<String, Object> sessionMap = externalContext.getSessionMap();
				    sessionMap.put("User",usuarioRegistro);
				    return "inicio.xhtml?faces-redirect=true";
				}else{
					new MensajeGrowl(FacesContext.getCurrentInstance(), "La constraseña es incorrecta", FacesMessage.SEVERITY_ERROR);
					RequestContext.getCurrentInstance().execute("PF('statusDialog').hide();");
				}
			}else{
				new MensajeGrowl(FacesContext.getCurrentInstance(), "El nombre de usuario no está registrado", FacesMessage.SEVERITY_ERROR);
				RequestContext.getCurrentInstance().execute("PF('statusDialog').hide();");
			}
			return "";
		}catch(Exception ex){
			RequestContext.getCurrentInstance().execute("PF('statusDialog').hide();");
			new MensajeGrowl(FacesContext.getCurrentInstance(), "Ocurrió un error: "+ex.getMessage(), FacesMessage.SEVERITY_FATAL);
			return "";
		}
	}
	
	public void limpiarUsuario(ActionEvent event){
		usuarioRegistro = new Usuarios();
		usuario = "";
		password = "";
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuarios getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(Usuarios usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}
