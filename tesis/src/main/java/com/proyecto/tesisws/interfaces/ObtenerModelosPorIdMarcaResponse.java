
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerModelosPorIdMarcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerModelosPorIdMarcaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaModelos" type="{http://interfaces.tesisws.proyecto.com/}modelos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerModelosPorIdMarcaResponse", propOrder = {
    "listaModelos"
})
public class ObtenerModelosPorIdMarcaResponse {

    protected List<Modelos> listaModelos;

    /**
     * Gets the value of the listaModelos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaModelos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaModelos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modelos }
     * 
     * 
     */
    public List<Modelos> getListaModelos() {
        if (listaModelos == null) {
            listaModelos = new ArrayList<Modelos>();
        }
        return this.listaModelos;
    }

}
