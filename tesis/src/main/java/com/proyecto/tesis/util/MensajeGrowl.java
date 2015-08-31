package com.proyecto.tesis.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class MensajeGrowl {

	public MensajeGrowl(FacesContext context, String mensaje, Severity severity){
		context.addMessage(null, new FacesMessage(severity, mensaje, ""));
	}
	
}
