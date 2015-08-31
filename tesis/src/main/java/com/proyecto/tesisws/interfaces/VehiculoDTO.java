
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VehiculoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VehiculoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://interfaces.tesisws.proyecto.com/}marcas" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://interfaces.tesisws.proyecto.com/}modelos" minOccurs="0"/>
 *         &lt;element name="placas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://interfaces.tesisws.proyecto.com/}tipovehiculo" minOccurs="0"/>
 *         &lt;element name="status" type="{http://interfaces.tesisws.proyecto.com/}tipostatus" minOccurs="0"/>
 *         &lt;element name="llaves" type="{http://interfaces.tesisws.proyecto.com/}llaves" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiculoDTO", propOrder = {
    "id",
    "marca",
    "modelo",
    "placas",
    "telefono",
    "tipo",
    "status",
    "llaves"
})
public class VehiculoDTO {

    protected Integer id;
    protected Marcas marca;
    protected Modelos modelo;
    protected String placas;
    protected String telefono;
    protected Tipovehiculo tipo;
    protected Tipostatus status;
    @XmlElement(nillable = true)
    protected List<Llaves> llaves;
    
    public VehiculoDTO(){
    	marca = new Marcas();
    	modelo = new Modelos();
    	tipo = new Tipovehiculo();
    	status = new Tipostatus();
    	llaves = new ArrayList<Llaves>();
    	llaves.add(new Llaves()); llaves.add(new Llaves());
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link Marcas }
     *     
     */
    public Marcas getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link Marcas }
     *     
     */
    public void setMarca(Marcas value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link Modelos }
     *     
     */
    public Modelos getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Modelos }
     *     
     */
    public void setModelo(Modelos value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad placas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacas() {
        return placas;
    }

    /**
     * Define el valor de la propiedad placas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacas(String value) {
        this.placas = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link Tipovehiculo }
     *     
     */
    public Tipovehiculo getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipovehiculo }
     *     
     */
    public void setTipo(Tipovehiculo value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Tipostatus }
     *     
     */
    public Tipostatus getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipostatus }
     *     
     */
    public void setStatus(Tipostatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the llaves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the llaves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLlaves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Llaves }
     * 
     * 
     */
    public List<Llaves> getLlaves() {
        if (llaves == null) {
            llaves = new ArrayList<Llaves>();
        }
        return this.llaves;
    }

}
