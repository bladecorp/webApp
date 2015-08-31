package com.proyecto.tesis.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.proyecto.tesis.util.TelefonoUtil;
import com.proyecto.tesisws.interfaces.Telefonos;
import com.proyecto.tesisws.interfaces.Usuarios;
import com.proyecto.tesisws.interfaces.WSInterface;
import com.proyecto.tesisws.interfaces.WSInterfaceService;

@Service
public class UsuarioService {
	
	Logger logger = Logger.getLogger(UsuarioService.class);

	public boolean registrarUsuario(Usuarios usuario, String telefonoRegistro)throws Exception{
		if(obtenerUsuario(usuario.getUsuario())==null && telefonoRegistro != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			int exito = service.registrarUsuario(usuario, telefonoRegistro);
			return exito > 0?true:false;
		}
		return false;
	}
	
	public Usuarios obtenerUsuarioPorId(Integer idUsuario)throws Exception{
		if(idUsuario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			Usuarios usuario = service.obtenerUsuarioPorId(idUsuario);
			logger.info("Usuario Obtenido: "+usuario);
			return usuario;
	//		return usuario.getId()!=null?usuario:null;
		}
		return null;
	}
	
	public Usuarios obtenerUsuario(String usuario)throws Exception{
		if(usuario != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			Usuarios usuarios = service.obtenerUsuario(usuario);
			logger.info("Usuario Obtenido: "+usuarios);
			return usuarios;
		}
		return null;
	}
	
	public boolean actualizarUsuario(Usuarios usuario, List<Telefonos> telefonos) throws Exception{
		if(usuario != null && telefonos !=null){
			for(Telefonos tel : telefonos){
				tel.setTelefono(TelefonoUtil.convertirTelefono(tel.getTelefono()));
			}
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.actualizarUsuario(usuario, telefonos);
		}
		return false;
	}
	
	
}// fin service
