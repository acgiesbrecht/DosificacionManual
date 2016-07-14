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
@Table(name = "datosx")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datosx.findAll", query = "SELECT d FROM Datosx d"),
    @NamedQuery(name = "Datosx.findByNroID", query = "SELECT d FROM Datosx d WHERE d.nroID = :nroID"),
    @NamedQuery(name = "Datosx.findByIdf", query = "SELECT d FROM Datosx d WHERE d.idf = :idf"),
    @NamedQuery(name = "Datosx.findByIdp", query = "SELECT d FROM Datosx d WHERE d.idp = :idp"),
    @NamedQuery(name = "Datosx.findBySet", query = "SELECT d FROM Datosx d WHERE d.set = :set"),
    @NamedQuery(name = "Datosx.findByPlata", query = "SELECT d FROM Datosx d WHERE d.plata = :plata"),
    @NamedQuery(name = "Datosx.findByItem", query = "SELECT d FROM Datosx d WHERE d.item = :item"),
    @NamedQuery(name = "Datosx.findByEmax", query = "SELECT d FROM Datosx d WHERE d.emax = :emax"),
    @NamedQuery(name = "Datosx.findByCv", query = "SELECT d FROM Datosx d WHERE d.cv = :cv"),
    @NamedQuery(name = "Datosx.findByVg", query = "SELECT d FROM Datosx d WHERE d.vg = :vg"),
    @NamedQuery(name = "Datosx.findByVf", query = "SELECT d FROM Datosx d WHERE d.vf = :vf")})
public class Datosx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NroID")
    private Integer nroID;
    @Column(name = "IDF")
    private Integer idf;
    @Column(name = "IDP")
    private Integer idp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Set")
    private Double set;
    @Column(name = "Plata")
    private Integer plata;
    @Column(name = "Item")
    private Integer item;
    @Column(name = "Emax")
    private Double emax;
    @Column(name = "CV")
    private Integer cv;
    @Column(name = "VG")
    private Integer vg;
    @Column(name = "VF")
    private Integer vf;

    public Datosx() {
    }

    public Datosx(Integer nroID) {
        this.nroID = nroID;
    }

    public Integer getNroID() {
        return nroID;
    }

    public void setNroID(Integer nroID) {
        this.nroID = nroID;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    public Double getSet() {
        return set;
    }

    public void setSet(Double set) {
        this.set = set;
    }

    public Integer getPlata() {
        return plata;
    }

    public void setPlata(Integer plata) {
        this.plata = plata;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Double getEmax() {
        return emax;
    }

    public void setEmax(Double emax) {
        this.emax = emax;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Integer getVg() {
        return vg;
    }

    public void setVg(Integer vg) {
        this.vg = vg;
    }

    public Integer getVf() {
        return vf;
    }

    public void setVf(Integer vf) {
        this.vf = vf;
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
        if (!(object instanceof Datosx)) {
            return false;
        }
        Datosx other = (Datosx) object;
        if ((this.nroID == null && other.nroID != null) || (this.nroID != null && !this.nroID.equals(other.nroID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.bal.dosificacionManual.domain.Datosx[ nroID=" + nroID + " ]";
    }

}
