package com.proyecto.tesis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.tesisws.interfaces.Telefonos;
import com.proyecto.tesisws.interfaces.WSInterface;
import com.proyecto.tesisws.interfaces.WSInterfaceService;

@Service
public class TelefonosService {

	
	public List<Telefonos> obtenerTelefonosPorIdUsuario(Integer idUsuario)throws Exception{
		List<Telefonos> telefonos = new ArrayList<Telefonos>();
		if(idUsuario!=null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			telefonos = service.obtenerTelefonosPorIdUsuario(idUsuario);
		}
		return telefonos;
	}
	
	public Telefonos obtenerTelefonoPorId(Integer idTelefono)throws Exception{
		if(idTelefono!=null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			Telefonos telefono = service.obtenerTelefonoPorId(idTelefono);
			return telefono.getId()!=null?telefono:null;
		}
		return null;
	}
	
	public List<Telefonos> buscarTelefonoPorTelefono(String telefono)throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		return service.buscarTelefonoPorTelefono(telefono);
	}
	
	
}
