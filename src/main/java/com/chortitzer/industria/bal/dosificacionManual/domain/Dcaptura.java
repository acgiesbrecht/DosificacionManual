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
@Table(name = "dcaptura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dcaptura.findAll", query = "SELECT d FROM Dcaptura d"),
    @NamedQuery(name = "Dcaptura.findByNroID", query = "SELECT d FROM Dcaptura d WHERE d.nroID = :nroID"),
    @NamedQuery(name = "Dcaptura.findByIdt", query = "SELECT d FROM Dcaptura d WHERE d.idt = :idt"),
    @NamedQuery(name = "Dcaptura.findByIdp", query = "SELECT d FROM Dcaptura d WHERE d.idp = :idp"),
    @NamedQuery(name = "Dcaptura.findByItem", query = "SELECT d FROM Dcaptura d WHERE d.item = :item"),
    @NamedQuery(name = "Dcaptura.findByPlata", query = "SELECT d FROM Dcaptura d WHERE d.plata = :plata"),
    @NamedQuery(name = "Dcaptura.findByValor", query = "SELECT d FROM Dcaptura d WHERE d.valor = :valor"),
    @NamedQuery(name = "Dcaptura.findByCiclo", query = "SELECT d FROM Dcaptura d WHERE d.ciclo = :ciclo"),
    @NamedQuery(name = "Dcaptura.findByEmax", query = "SELECT d FROM Dcaptura d WHERE d.emax = :emax"),
    @NamedQuery(name = "Dcaptura.findByFrango", query = "SELECT d FROM Dcaptura d WHERE d.frango = :frango"),
    @NamedQuery(name = "Dcaptura.findByIdstock", query = "SELECT d FROM Dcaptura d WHERE d.idstock = :idstock")})
public class Dcaptura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NroID")
    private Integer nroID;
    @Column(name = "IDT")
    private Integer idt;
    @Column(name = "IDP")
    private Integer idp;
    @Column(name = "Item")
    private Integer item;
    @Column(name = "Plata")
    private Integer plata;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "`Set`")
    private Double setT;
    @Column(name = "Valor")
    private Double valor;
    @Column(name = "Ciclo")
    private Integer ciclo;
    @Column(name = "Emax")
    private Double emax;
    @Column(name = "Frango")
    private Integer frango;
    @Column(name = "Idstock")
    private Integer idstock;

    public Dcaptura() {
    }

    public Dcaptura(Integer nroID) {
        this.nroID = nroID;
    }

    public Integer getNroID() {
        return nroID;
    }

    public void setNroID(Integer nroID) {
        this.nroID = nroID;
    }

    public Integer getIdt() {
        return idt;
    }

    public void setIdt(Integer idt) {
        this.idt = idt;
    }

    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getPlata() {
        return plata;
    }

    public void setPlata(Integer plata) {
        this.plata = plata;
    }

    public Double getSetT() {
        return setT;
    }

    public void setSetT(Double setT) {
        this.setT = setT;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Double getEmax() {
        return emax;
    }

    public void setEmax(Double emax) {
        this.emax = emax;
    }

    public Integer getFrango() {
        return frango;
    }

    public void setFrango(Integer frango) {
        this.frango = frango;
    }

    public Integer getIdstock() {
        return idstock;
    }

    public void setIdstock(Integer idstock) {
        this.idstock = idstock;
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
        if (!(object instanceof Dcaptura)) {
            return false;
        }
        Dcaptura other = (Dcaptura) object;
        if ((this.nroID == null && other.nroID != null) || (this.nroID != null && !this.nroID.equals(other.nroID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.bal.dosificacionManual.domain.Dcaptura[ nroID=" + nroID + " ]";
    }

}
