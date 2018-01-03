package th.co.ipassion.testtool.entity.tlp;
// Generated Dec 18, 2017 12:26:51 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Customersa generated by hbm2java
 */
@Entity
@Table(name="customersa"
)
public class Customersa  implements java.io.Serializable {


     private CustomersaId id;

    public Customersa() {
    }

    public Customersa(CustomersaId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="customercode", column=@Column(name="customercode") ), 
        @AttributeOverride(name="policyno", column=@Column(name="policyno") ), 
        @AttributeOverride(name="saLifetpd", column=@Column(name="sa_lifetpd") ), 
        @AttributeOverride(name="saLife", column=@Column(name="sa_life") ), 
        @AttributeOverride(name="saTpd", column=@Column(name="sa_tpd") ), 
        @AttributeOverride(name="saTd", column=@Column(name="sa_td") ), 
        @AttributeOverride(name="saAdd", column=@Column(name="sa_add") ), 
        @AttributeOverride(name="saAdb", column=@Column(name="sa_adb") ), 
        @AttributeOverride(name="saHa", column=@Column(name="sa_ha") ), 
        @AttributeOverride(name="saHb", column=@Column(name="sa_hb") ), 
        @AttributeOverride(name="saMe", column=@Column(name="sa_me") ), 
        @AttributeOverride(name="saPa", column=@Column(name="sa_pa") ), 
        @AttributeOverride(name="saPh", column=@Column(name="sa_ph") ), 
        @AttributeOverride(name="saCi", column=@Column(name="sa_ci") ), 
        @AttributeOverride(name="flaglife", column=@Column(name="flaglife") ), 
        @AttributeOverride(name="flaglifetpd", column=@Column(name="flaglifetpd") ), 
        @AttributeOverride(name="ia", column=@Column(name="ia") ), 
        @AttributeOverride(name="sa", column=@Column(name="sa") ), 
        @AttributeOverride(name="transdate", column=@Column(name="transdate") ), 
        @AttributeOverride(name="miAmount", column=@Column(name="mi_amount") ), 
        @AttributeOverride(name="mexpiryLife", column=@Column(name="mexpiry_life") ), 
        @AttributeOverride(name="expiryTpd", column=@Column(name="expiry_tpd") ), 
        @AttributeOverride(name="expiryTd", column=@Column(name="expiry_td") ), 
        @AttributeOverride(name="expiryAdd", column=@Column(name="expiry_add") ), 
        @AttributeOverride(name="expiryAdb", column=@Column(name="expiry_adb") ), 
        @AttributeOverride(name="expiryHa", column=@Column(name="expiry_ha") ), 
        @AttributeOverride(name="expiryHb", column=@Column(name="expiry_hb") ), 
        @AttributeOverride(name="expiryMe", column=@Column(name="expiry_me") ), 
        @AttributeOverride(name="expiryPa", column=@Column(name="expiry_pa") ), 
        @AttributeOverride(name="expiryPh", column=@Column(name="expiry_ph") ), 
        @AttributeOverride(name="expiryCi", column=@Column(name="expiry_ci") ), 
        @AttributeOverride(name="saMa", column=@Column(name="sa_ma") ), 
        @AttributeOverride(name="expiryMa", column=@Column(name="expiry_ma") ), 
        @AttributeOverride(name="saMc", column=@Column(name="sa_mc") ), 
        @AttributeOverride(name="expiryMc", column=@Column(name="expiry_mc") ) } )
    public CustomersaId getId() {
        return this.id;
    }
    
    public void setId(CustomersaId id) {
        this.id = id;
    }




}


