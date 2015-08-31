
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerVehiculosPorIdUsuarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerVehiculosPorIdUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaVehiculoDTO" type="{http://interfaces.tesisws.proyecto.com/}VehiculoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerVehiculosPorIdUsuarioResponse", propOrder = {
    "listaVehiculoDTO"
})
public class ObtenerVehiculosPorIdUsuarioResponse {

    protected List<VehiculoDTO> listaVehiculoDTO;

    /**
     * Gets the value of the listaVehiculoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaVehiculoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaVehiculoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiculoDTO }
     * 
     * 
     */
    public List<VehiculoDTO> getListaVehiculoDTO() {
        if (listaVehiculoDTO == null) {
            listaVehiculoDTO = new ArrayList<VehiculoDTO>();
        }
        return this.listaVehiculoDTO;
    }

}
