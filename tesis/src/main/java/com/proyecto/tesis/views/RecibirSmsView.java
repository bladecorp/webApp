package com.proyecto.tesis.views;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ComponentSystemEvent;

import org.apache.log4j.Logger;

import com.proyecto.tesis.service.MensajesService;

@ManagedBean
@ViewScoped
public class RecibirSmsView implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Logger logger = Logger.getLogger(RecibirSmsView.class);

	@ManagedProperty("#{mensajesService}")
	private MensajesService mensajesService;
	
	private String de;
	private String para;
	private String mensaje;
	
	public void recibirMensaje(ComponentSystemEvent cse){
		logger.debug("Entró a RecibirMensaje en View");
		if(de != null && para != null && mensaje != null){
			mensajesService.contestarMensaje(de, para, mensaje);
		}
	}

	public MensajesService getMensajesService() {
		return mensajesService;
	}

	public void setMensajesService(MensajesService mensajesService) {
		this.mensajesService = mensajesService;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
