package com.proyecto.tesis.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.proyecto.tesisws.interfaces.Telefonos;

@FacesConverter("telConverter")
public class TelefonoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		String telefono = "";
		if(component.getClientId().contentEquals("form:somTel")){
			Telefonos tel = (Telefonos) value;
			telefono = tel.getTelefono();
		}else{
			telefono = (String) value;
		}
		StringBuilder str = new StringBuilder(telefono);
		str.insert(0, "(");
		str.insert(3, ") ");
		str.insert(9, "-");
		return str.toString();
	}
	
	

}
