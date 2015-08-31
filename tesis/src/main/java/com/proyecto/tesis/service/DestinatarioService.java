package com.proyecto.tesis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.tesisws.interfaces.Destinatarios;
import com.proyecto.tesisws.interfaces.WSInterface;
import com.proyecto.tesisws.interfaces.WSInterfaceService;

@Service
public class DestinatarioService {
	
	public List<Destinatarios> obtenerDestinatariosPorIdVehiculo(Integer idVehiculo)throws Exception{
		List<Destinatarios> destinatarios = new ArrayList<Destinatarios>();
		if(idVehiculo != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			destinatarios = service.obtenerDestinatariosPorIdVehiculo(idVehiculo);
		}
		return destinatarios;
	}
	
	public boolean insertarDestinatario(Destinatarios destinatario)throws Exception{
		if(destinatario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			int exito = service.insertarDestinatario(destinatario);
			return exito > 0?true:false;
		}
		return false;
	}

	public boolean actualizarDestinatario(Destinatarios destinatario)throws Exception {
		if(destinatario!=null && destinatario.getId()!=null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.actualizarDestinatario(destinatario);
		}
		return false;
	}

	public boolean eliminarDestinatario(Integer idDestinatario) throws Exception{
		if(idDestinatario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.eliminarDestinatario(idDestinatario);
		}
		return false;
	}
	
	public boolean enviarInvitacion(Integer idVehiculo, Integer idDestinatario){
		if(idVehiculo != null && idDestinatario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.enviarInvitacion(idVehiculo, idDestinatario);
		}
		return false;
	}
	

}// fin service
