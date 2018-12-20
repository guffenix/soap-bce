/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guffenix
 */
@Entity
@Table(name = "ASIGNAR_IFIN_USR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AsignarIfinUsr.findAll", query = "SELECT a FROM AsignarIfinUsr a")
    , @NamedQuery(name = "AsignarIfinUsr.findByIfinusrId", query = "SELECT a FROM AsignarIfinUsr a WHERE a.ifinusrId = :ifinusrId")
    , @NamedQuery(name = "AsignarIfinUsr.findByIfinusrNumerocuenta", query = "SELECT a FROM AsignarIfinUsr a WHERE a.ifinusrNumerocuenta = :ifinusrNumerocuenta")
    , @NamedQuery(name = "AsignarIfinUsr.findByIfinusrEstado", query = "SELECT a FROM AsignarIfinUsr a WHERE a.ifinusrEstado = :ifinusrEstado")})
public class AsignarIfinUsr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IFINUSR_ID")
    private Integer ifinusrId;
    @Size(max = 32)
    @Column(name = "IFINUSR_NUMEROCUENTA")
    private String ifinusrNumerocuenta;
    @Column(name = "IFINUSR_ESTADO")
    private Boolean ifinusrEstado;
    @JoinColumn(name = "CTA_ID", referencedColumnName = "CTA_ID")
    @ManyToOne
    private TipoCuenta ctaId;
    @JoinColumn(name = "INSFIN_IDENTIFICACION", referencedColumnName = "INSFIN_IDENTIFICACION")
    @ManyToOne
    private InstitucionFinanciera insfinIdentificacion;
    @JoinColumn(name = "USR_IDENTIFICACION", referencedColumnName = "USR_IDENTIFICACION")
    @ManyToOne
    private Usuario usrIdentificacion;

    public AsignarIfinUsr() {
    }

    public AsignarIfinUsr(Integer ifinusrId) {
        this.ifinusrId = ifinusrId;
    }

    public Integer getIfinusrId() {
        return ifinusrId;
    }

    public void setIfinusrId(Integer ifinusrId) {
        this.ifinusrId = ifinusrId;
    }

    public String getIfinusrNumerocuenta() {
        return ifinusrNumerocuenta;
    }

    public void setIfinusrNumerocuenta(String ifinusrNumerocuenta) {
        this.ifinusrNumerocuenta = ifinusrNumerocuenta;
    }

    public Boolean getIfinusrEstado() {
        return ifinusrEstado;
    }

    public void setIfinusrEstado(Boolean ifinusrEstado) {
        this.ifinusrEstado = ifinusrEstado;
    }

    public TipoCuenta getCtaId() {
        return ctaId;
    }

    public void setCtaId(TipoCuenta ctaId) {
        this.ctaId = ctaId;
    }

    public InstitucionFinanciera getInsfinIdentificacion() {
        return insfinIdentificacion;
    }

    public void setInsfinIdentificacion(InstitucionFinanciera insfinIdentificacion) {
        this.insfinIdentificacion = insfinIdentificacion;
    }

    public Usuario getUsrIdentificacion() {
        return usrIdentificacion;
    }

    public void setUsrIdentificacion(Usuario usrIdentificacion) {
        this.usrIdentificacion = usrIdentificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ifinusrId != null ? ifinusrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignarIfinUsr)) {
            return false;
        }
        AsignarIfinUsr other = (AsignarIfinUsr) object;
        if ((this.ifinusrId == null && other.ifinusrId != null) || (this.ifinusrId != null && !this.ifinusrId.equals(other.ifinusrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arqui.modelos.AsignarIfinUsr[ ifinusrId=" + ifinusrId + " ]";
    }
    
}
