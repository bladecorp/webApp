package com.proyecto.tesis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.tesisws.interfaces.Marcas;
import com.proyecto.tesisws.interfaces.Modelos;
import com.proyecto.tesisws.interfaces.Tipollave;
import com.proyecto.tesisws.interfaces.Tipomensaje;
import com.proyecto.tesisws.interfaces.Tipostatus;
import com.proyecto.tesisws.interfaces.Tipovehiculo;
import com.proyecto.tesisws.interfaces.WSInterface;
import com.proyecto.tesisws.interfaces.WSInterfaceService;

@Service
public class CatalogosService {
	
	public List<Marcas> obtenerMarcas()throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		return service.obtenerMarcas();
	}
	
	public Marcas obtenerMarcaPorId(Integer idMarca)throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		Marcas marca = service.obtenerMarcaPorId(idMarca);
		return marca.getId()!=null?marca:null;
		
	}
	
	public List<Modelos> obtenerModelosPorIdMarca(Integer idMarca)throws Exception{
		List<Modelos> modelos = new ArrayList<Modelos>();
		if(idMarca != null){
			WSInterface service = new WSInterfaceService().getWSInterfacePort();
			return service.obtenerModelosPorIdMarca(idMarca);
		}else{
			return modelos;
		}
	}
	
	public Modelos obtenerModeloPorId(Integer idModelo)throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		Modelos modelo = service.obtenerModeloPorId(idModelo);
		return modelo.getId()!=null?modelo:null;
	}
	
	public List<Tipovehiculo> obtenerTiposDeVehiculo()throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		return service.obtenerTiposDeVehiculo();
	}
	
	public List<Tipostatus> obtenerTiposDeStatus()throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		return service.obtenerTiposDeStatus();
	}
	
	public List<Tipollave> obtenerTiposDeLLaves()throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		return service.obtenerTiposDeLLaves();
	}
	
	public List<Tipomensaje> obtenerTiposDeMensaje()throws Exception{
		WSInterface service = new WSInterfaceService().getWSInterfacePort();
		return service.obtenerTiposDeMensaje();
	}
	
}
