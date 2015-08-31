
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerMarcasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerMarcasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaMarcas" type="{http://interfaces.tesisws.proyecto.com/}marcas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMarcasResponse", propOrder = {
    "listaMarcas"
})
public class ObtenerMarcasResponse {

    protected List<Marcas> listaMarcas;

    /**
     * Gets the value of the listaMarcas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaMarcas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaMarcas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Marcas }
     * 
     * 
     */
    public List<Marcas> getListaMarcas() {
        if (listaMarcas == null) {
            listaMarcas = new ArrayList<Marcas>();
        }
        return this.listaMarcas;
    }

}
