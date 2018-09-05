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
@Table(name = "tbl_maquinas_cin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMaquinasCin.findAll", query = "SELECT t FROM TblMaquinasCin t")
    , @NamedQuery(name = "TblMaquinasCin.findByIp", query = "SELECT t FROM TblMaquinasCin t WHERE t.ip = :ip")
    , @NamedQuery(name = "TblMaquinasCin.findByDescripcion", query = "SELECT t FROM TblMaquinasCin t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TblMaquinasCin.findByRoles", query = "SELECT t FROM TblMaquinasCin t WHERE t.roles = :roles")})
public class TblMaquinasCin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "roles")
    private String roles;

    public TblMaquinasCin() {
    }

    public TblMaquinasCin(String ip) {
        this.ip = ip;
    }

    public TblMaquinasCin(String ip, String descripcion, String roles) {
        this.ip = ip;
        this.descripcion = descripcion;
        this.roles = roles;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ip != null ? ip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMaquinasCin)) {
            return false;
        }
        TblMaquinasCin other = (TblMaquinasCin) object;
        if ((this.ip == null && other.ip != null) || (this.ip != null && !this.ip.equals(other.ip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.bal.dosificacionManual.domain.TblMaquinasCin[ ip=" + ip + " ]";
    }

}
