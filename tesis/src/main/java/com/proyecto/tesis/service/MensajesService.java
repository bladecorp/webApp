package com.proyecto.tesis.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class MensajesService {
	
	Logger logger = Logger.getLogger(MensajesService.class);

	public String contestarMensaje(String de, String para, String mensaje){
		logger.debug("Entró a CONTESTAR MENSAJE en SERVICE");
		logger.debug("De: "+de+", Para: "+para);
		logger.debug("Mensaje recibido: "+mensaje);
		return "Mensaje recibido, gracias.";
	}
	
	
}
