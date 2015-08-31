package com.proyecto.tesis.dto;

public class HistoricoDTO {
	
	private String mensaje;
	private String fecha;
	private String tipoMensaje;
	private String tipoSubMensaje;
	private int idSubMensaje;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipoMensaje() {
		return tipoMensaje;
	}
	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}
	public String getTipoSubMensaje() {
		return tipoSubMensaje;
	}
	public void setTipoSubMensaje(String tipoSubMensaje) {
		this.tipoSubMensaje = tipoSubMensaje;
	}
	public int getIdSubMensaje() {
		return idSubMensaje;
	}
	public void setIdSubMensaje(int idSubMensaje) {
		this.idSubMensaje = idSubMensaje;
	}
	
	

}
