/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.industria.bal.dosificacionManual.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adriang
 */
@Entity
@Table(name = "productox")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productox.findAll", query = "SELECT p FROM Productox p"),
    @NamedQuery(name = "Productox.findByNroID", query = "SELECT p FROM Productox p WHERE p.nroID = :nroID"),
    @NamedQuery(name = "Productox.findByNombre", query = "SELECT p FROM Productox p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Productox.findByDos1", query = "SELECT p FROM Productox p WHERE p.dos1 = :dos1"),
    @NamedQuery(name = "Productox.findByDos2", query = "SELECT p FROM Productox p WHERE p.dos2 = :dos2"),
    @NamedQuery(name = "Productox.findByDos3", query = "SELECT p FROM Productox p WHERE p.dos3 = :dos3"),
    @NamedQuery(name = "Productox.findByDos4", query = "SELECT p FROM Productox p WHERE p.dos4 = :dos4"),
    @NamedQuery(name = "Productox.findByCvel", query = "SELECT p FROM Productox p WHERE p.cvel = :cvel"),
    @NamedQuery(name = "Productox.findByVgrueso", query = "SELECT p FROM Productox p WHERE p.vgrueso = :vgrueso"),
    @NamedQuery(name = "Productox.findByVfino", query = "SELECT p FROM Productox p WHERE p.vfino = :vfino"),
    @NamedQuery(name = "Productox.findByTdos", query = "SELECT p FROM Productox p WHERE p.tdos = :tdos"),
    @NamedQuery(name = "Productox.findByPlata", query = "SELECT p FROM Productox p WHERE p.plata = :plata"),
    @NamedQuery(name = "Productox.findBySetIR", query = "SELECT p FROM Productox p WHERE p.setIR = :setIR"),
    @NamedQuery(name = "Productox.findBySetFR", query = "SELECT p FROM Productox p WHERE p.setFR = :setFR"),
    @NamedQuery(name = "Productox.findByNp", query = "SELECT p FROM Productox p WHERE p.np = :np"),
    @NamedQuery(name = "Productox.findByVisible", query = "SELECT p FROM Productox p WHERE p.visible = :visible"),
    @NamedQuery(name = "Productox.findByCodigo", query = "SELECT p FROM Productox p WHERE p.codigo = :codigo")})
public class Productox implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NroID")
    private Integer nroID;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Dos1")
    private Integer dos1;
    @Column(name = "Dos2")
    private Integer dos2;
    @Column(name = "Dos3")
    private Integer dos3;
    @Column(name = "Dos4")
    private Integer dos4;
    @Column(name = "Cvel")
    private Integer cvel;
    @Column(name = "Vgrueso")
    private Integer vgrueso;
    @Column(name = "Vfino")
    private Integer vfino;
    @Column(name = "Tdos")
    private Integer tdos;
    @Column(name = "Plata")
    private Integer plata;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SetIR")
    private Double setIR;
    @Column(name = "SetFR")
    private Double setFR;
    @Column(name = "Np")
    private String np;
    @Column(name = "Visible")
    private Boolean visible;
    @Column(name = "Codigo")
    private String codigo;

    public Productox() {
    }

    public Productox(Integer nroID) {
        this.nroID = nroID;
    }

    public Integer getNroID() {
        return nroID;
    }

    public void setNroID(Integer nroID) {
        this.nroID = nroID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDos1() {
        return dos1;
    }

    public void setDos1(Integer dos1) {
        this.dos1 = dos1;
    }

    public Integer getDos2() {
        return dos2;
    }

    public void setDos2(Integer dos2) {
        this.dos2 = dos2;
    }

    public Integer getDos3() {
        return dos3;
    }

    public void setDos3(Integer dos3) {
        this.dos3 = dos3;
    }

    public Integer getDos4() {
        return dos4;
    }

    public void setDos4(Integer dos4) {
        this.dos4 = dos4;
    }

    public Integer getCvel() {
        return cvel;
    }

    public void setCvel(Integer cvel) {
        this.cvel = cvel;
    }

    public Integer getVgrueso() {
        return vgrueso;
    }

    public void setVgrueso(Integer vgrueso) {
        this.vgrueso = vgrueso;
    }

    public Integer getVfino() {
        return vfino;
    }

    public void setVfino(Integer vfino) {
        this.vfino = vfino;
    }

    public Integer getTdos() {
        return tdos;
    }

    public void setTdos(Integer tdos) {
        this.tdos = tdos;
    }

    public Integer getPlata() {
        return plata;
    }

    public void setPlata(Integer plata) {
        this.plata = plata;
    }

    public Double getSetIR() {
        return setIR;
    }

    public void setSetIR(Double setIR) {
        this.setIR = setIR;
    }

    public Double getSetFR() {
        return setFR;
    }

    public void setSetFR(Double setFR) {
        this.setFR = setFR;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroID != null ? nroID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productox)) {
            return false;
        }
        Productox other = (Productox) object;
        if ((this.nroID == null && other.nroID != null) || (this.nroID != null && !this.nroID.equals(other.nroID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.bal.dosificacionManual.domain.Productox[ nroID=" + nroID + " ]";
    }

}
