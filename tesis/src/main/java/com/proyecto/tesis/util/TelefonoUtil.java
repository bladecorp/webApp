package com.proyecto.tesis.util;

public class TelefonoUtil {
	
	public static final String convertirTelefono(String telefono){
		if(telefono != null){
			String telefonoLimpio = "";
			char[] caracteres = telefono.toCharArray();
			for(char caracter : caracteres){
				if(Character.isDigit(caracter)){
					telefonoLimpio += String.valueOf(caracter);
				}
			}
			return telefonoLimpio;
		}
		return null;
	}

}
