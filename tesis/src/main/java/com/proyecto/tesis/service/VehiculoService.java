package com.proyecto.tesis.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.tesis.dto.HistoricoDTO;
import com.proyecto.tesis.enums.MensajeGeneral;
import com.proyecto.tesis.enums.TipoMensaje;
import com.proyecto.tesisws.interfaces.Historicomensajes;
import com.proyecto.tesisws.interfaces.Llaves;
import com.proyecto.tesisws.interfaces.VehiculoDTO;
import com.proyecto.tesisws.interfaces.WSInterface;
import com.proyecto.tesisws.interfaces.WSInterfaceService;

@Service
public class VehiculoService {
	
	public List<VehiculoDTO> obtenerVehiculosPorIdUsuario(Integer idUsuario)throws Exception{
		List<VehiculoDTO> vehiculosDTO = new ArrayList<VehiculoDTO>();
		if(idUsuario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.obtenerVehiculosPorIdUsuario(idUsuario);
		}
		return vehiculosDTO;
	}
	
	public boolean insertarVehiculo(VehiculoDTO vehiculoDTO, Integer idUsuario)throws Exception{
		if(vehiculoDTO != null && idUsuario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			int exito = service.insertarVehiculo(vehiculoDTO, idUsuario);
			return exito > 0?true:false;
		}
		return false;
	}
	
	public boolean actualizarVehiculo(VehiculoDTO vehiculoDTO, Integer idUsuario)throws Exception{
		if(vehiculoDTO != null && idUsuario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.actualizarVehiculo(vehiculoDTO, idUsuario);
		}
		return false;
	}
	
	public boolean eliminarVehiculoPorId(Integer idVehiculo)throws Exception{
		if(idVehiculo != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.eliminarVehiculoPorId(idVehiculo);
		}
		return false;
	}
	
	
	public List<Llaves> obtenerLlaverPorIdVehiculo(Integer idVehiculo)throws Exception{
		List<Llaves> llaves = new ArrayList<Llaves>();
		if(idVehiculo != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			llaves = service.obtenerLlaverPorIdVehiculo(idVehiculo);
		}
		return llaves;
	}

	public boolean actualizarStatusVehiculo(Integer idVehiculo, Integer tipoStatus)throws Exception {
		if(idVehiculo != null && tipoStatus != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.actualizarStatusVehiculo(idVehiculo, tipoStatus);
		}
		return false;
	}
	
	public boolean revisarSensores(Integer idVehiculo){
		if(idVehiculo != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.enviarMensajeRevisionSensores(idVehiculo);
		}
		return false;
	}
	
	public List<HistoricoDTO> obtenerHistoricoProFecha(Integer mes, Integer anio, Integer idVehiculo){
		List<HistoricoDTO> mensajesDTO = new ArrayList<HistoricoDTO>();
		if(mes!=null && anio!=null && idVehiculo!=null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			List<Historicomensajes> mensajes = service.obtenerHistoricoPorFecha(idVehiculo, mes, anio);
			if(mensajes!=null){
				for(Historicomensajes mensaje : mensajes){
					HistoricoDTO hist = new HistoricoDTO();
					hist.setFecha(convertirFecha(mensaje.getFecha().toString()));
					hist.setMensaje(mensaje.getMensaje());
					hist.setTipoMensaje(mensaje.getIdTipoMensaje()==TipoMensaje.ALARMA.getId()?"Alarma":"General");
					hist.setTipoSubMensaje(convertirSubMensaje(mensaje.getIdSubMensaje()));
					hist.setIdSubMensaje(mensaje.getIdSubMensaje());
					mensajesDTO.add(hist);
				}
			}else{
				return new ArrayList<HistoricoDTO>();
			}
		}
		return mensajesDTO;
	}
	
	private String convertirFecha(String fechaCruda){
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String[] fechaC = fechaCruda.split("T");
		String[] fechaT = fechaC[1].split("-");
		return fechaC[0]+", "+fechaT[0];
	}
	
	private String convertirSubMensaje(Integer subMensaje){
		if(subMensaje == 0){
			return "Alarma";
		}
		if(subMensaje == MensajeGeneral.INFORMATIVO.getId()){
			return "Informativo";
		}
		if(subMensaje == MensajeGeneral.INVITACION.getId()){
			return "Invitación";
		}
		if(subMensaje == MensajeGeneral.REVISAR_SENSORES.getId()){
			return "Revisión Sensores";
		}
		if(subMensaje == MensajeGeneral.SUSPENDER_SERVICIO.getId()){
			return "Suspender Servicio";
		}
		return "Sin Tipo";
	}
	
	
}
