/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.industria.bal.dosificacionManual.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adriang
 */
@Entity
@Table(name = "tareaseje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tareaseje.findAll", query = "SELECT t FROM Tareaseje t"),
    @NamedQuery(name = "Tareaseje.findByNroID", query = "SELECT t FROM Tareaseje t WHERE t.nroID = :nroID"),
    @NamedQuery(name = "Tareaseje.findByFecha", query = "SELECT t FROM Tareaseje t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Tareaseje.findByHora", query = "SELECT t FROM Tareaseje t WHERE t.hora = :hora"),
    @NamedQuery(name = "Tareaseje.findByIdf", query = "SELECT t FROM Tareaseje t WHERE t.idf = :idf"),
    @NamedQuery(name = "Tareaseje.findByCiclos", query = "SELECT t FROM Tareaseje t WHERE t.ciclos = :ciclos"),
    @NamedQuery(name = "Tareaseje.findByIdop", query = "SELECT t FROM Tareaseje t WHERE t.idop = :idop"),
    @NamedQuery(name = "Tareaseje.findByTurno", query = "SELECT t FROM Tareaseje t WHERE t.turno = :turno"),
    @NamedQuery(name = "Tareaseje.findByEje", query = "SELECT t FROM Tareaseje t WHERE t.eje = :eje"),
    @NamedQuery(name = "Tareaseje.findByIdd", query = "SELECT t FROM Tareaseje t WHERE t.idd = :idd"),
    @NamedQuery(name = "Tareaseje.findByLote", query = "SELECT t FROM Tareaseje t WHERE t.lote = :lote"),
    @NamedQuery(name = "Tareaseje.findByDestino", query = "SELECT t FROM Tareaseje t WHERE t.destino = :destino"),
    @NamedQuery(name = "Tareaseje.findByTiempo", query = "SELECT t FROM Tareaseje t WHERE t.tiempo = :tiempo"),
    @NamedQuery(name = "Tareaseje.findByKva", query = "SELECT t FROM Tareaseje t WHERE t.kva = :kva"),
    @NamedQuery(name = "Tareaseje.findByCicloE", query = "SELECT t FROM Tareaseje t WHERE t.cicloE = :cicloE"),
    @NamedQuery(name = "Tareaseje.findBySetE", query = "SELECT t FROM Tareaseje t WHERE t.setE = :setE")})
public class Tareaseje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NroID")
    private Integer nroID;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "IDF")
    private Integer idf;
    @Column(name = "Ciclos")
    private Integer ciclos;
    @Column(name = "IDOP")
    private Integer idop;
    @Column(name = "Turno")
    private Integer turno;
    @Column(name = "Eje")
    private Integer eje;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "`Set`")
    private Double setT;
    @Column(name = "IDD")
    private Integer idd;
    @Column(name = "Lote")
    private Integer lote;
    @Column(name = "Destino")
    private String destino;
    @Column(name = "Tiempo")
    @Temporal(TemporalType.TIME)
    private Date tiempo;
    @Column(name = "KVA")
    private Double kva;
    @Column(name = "CicloE")
    private Integer cicloE;
    @Column(name = "SetE")
    private Double setE;

    public Tareaseje() {
    }

    public Tareaseje(Integer nroID) {
        this.nroID = nroID;
    }

    public Integer getNroID() {
        return nroID;
    }

    public void setNroID(Integer nroID) {
        this.nroID = nroID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Integer getCiclos() {
        return ciclos;
    }

    public void setCiclos(Integer ciclos) {
        this.ciclos = ciclos;
    }

    public Integer getIdop() {
        return idop;
    }

    public void setIdop(Integer idop) {
        this.idop = idop;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Integer getEje() {
        return eje;
    }

    public void setEje(Integer eje) {
        this.eje = eje;
    }

    public Double getSetT() {
        return setT;
    }

    public void setSetT(Double setT) {
        this.setT = setT;
    }

    public Integer getIdd() {
        return idd;
    }

    public void setIdd(Integer idd) {
        this.idd = idd;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public Double getKva() {
        return kva;
    }

    public void setKva(Double kva) {
        this.kva = kva;
    }

    public Integer getCicloE() {
        return cicloE;
    }

    public void setCicloE(Integer cicloE) {
        this.cicloE = cicloE;
    }

    public Double getSetE() {
        return setE;
    }

    public void setSetE(Double setE) {
        this.setE = setE;
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
        if (!(object instanceof Tareaseje)) {
            return false;
        }
        Tareaseje other = (Tareaseje) object;
        if ((this.nroID == null && other.nroID != null) || (this.nroID != null && !this.nroID.equals(other.nroID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.bal.dosificacionManual.domain.Tareaseje[ nroID=" + nroID + " ]";
    }

}
