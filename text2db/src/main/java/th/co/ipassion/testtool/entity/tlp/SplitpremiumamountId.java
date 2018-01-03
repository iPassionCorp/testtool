package th.co.ipassion.testtool.entity.tlp;
// Generated Dec 18, 2017 12:26:51 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SplitpremiumamountId generated by hbm2java
 */
@Embeddable
public class SplitpremiumamountId  implements java.io.Serializable {


     private String productid;
     private String grouppolicyno;
     private String customercode;
     private String totpremium;
     private String lifepremium;
     private String deathpremium;
     private String tpdpremium;
     private String ttdpremium;
     private String tdpremium;
     private String papremium;
     private String adbpremium;
     private String addpremium;
     private String rccpremium;
     private String mapremium;
     private String mcpremium;
     private String mepremium;
     private String hbpremium;
     private String hapremium;
     private String hspremium;
     private String ddpremium;
     private String lifetpdpremium;

    public SplitpremiumamountId() {
    }

    public SplitpremiumamountId(String productid, String grouppolicyno, String customercode, String totpremium, String lifepremium, String deathpremium, String tpdpremium, String ttdpremium, String tdpremium, String papremium, String adbpremium, String addpremium, String rccpremium, String mapremium, String mcpremium, String mepremium, String hbpremium, String hapremium, String hspremium, String ddpremium, String lifetpdpremium) {
       this.productid = productid;
       this.grouppolicyno = grouppolicyno;
       this.customercode = customercode;
       this.totpremium = totpremium;
       this.lifepremium = lifepremium;
       this.deathpremium = deathpremium;
       this.tpdpremium = tpdpremium;
       this.ttdpremium = ttdpremium;
       this.tdpremium = tdpremium;
       this.papremium = papremium;
       this.adbpremium = adbpremium;
       this.addpremium = addpremium;
       this.rccpremium = rccpremium;
       this.mapremium = mapremium;
       this.mcpremium = mcpremium;
       this.mepremium = mepremium;
       this.hbpremium = hbpremium;
       this.hapremium = hapremium;
       this.hspremium = hspremium;
       this.ddpremium = ddpremium;
       this.lifetpdpremium = lifetpdpremium;
    }
   

    @Column(name="productid")
    public String getProductid() {
        return this.productid;
    }
    
    public void setProductid(String productid) {
        this.productid = productid;
    }

    @Column(name="grouppolicyno")
    public String getGrouppolicyno() {
        return this.grouppolicyno;
    }
    
    public void setGrouppolicyno(String grouppolicyno) {
        this.grouppolicyno = grouppolicyno;
    }

    @Column(name="customercode")
    public String getCustomercode() {
        return this.customercode;
    }
    
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    @Column(name="totpremium")
    public String getTotpremium() {
        return this.totpremium;
    }
    
    public void setTotpremium(String totpremium) {
        this.totpremium = totpremium;
    }

    @Column(name="lifepremium")
    public String getLifepremium() {
        return this.lifepremium;
    }
    
    public void setLifepremium(String lifepremium) {
        this.lifepremium = lifepremium;
    }

    @Column(name="deathpremium")
    public String getDeathpremium() {
        return this.deathpremium;
    }
    
    public void setDeathpremium(String deathpremium) {
        this.deathpremium = deathpremium;
    }

    @Column(name="tpdpremium")
    public String getTpdpremium() {
        return this.tpdpremium;
    }
    
    public void setTpdpremium(String tpdpremium) {
        this.tpdpremium = tpdpremium;
    }

    @Column(name="ttdpremium")
    public String getTtdpremium() {
        return this.ttdpremium;
    }
    
    public void setTtdpremium(String ttdpremium) {
        this.ttdpremium = ttdpremium;
    }

    @Column(name="tdpremium")
    public String getTdpremium() {
        return this.tdpremium;
    }
    
    public void setTdpremium(String tdpremium) {
        this.tdpremium = tdpremium;
    }

    @Column(name="papremium")
    public String getPapremium() {
        return this.papremium;
    }
    
    public void setPapremium(String papremium) {
        this.papremium = papremium;
    }

    @Column(name="adbpremium")
    public String getAdbpremium() {
        return this.adbpremium;
    }
    
    public void setAdbpremium(String adbpremium) {
        this.adbpremium = adbpremium;
    }

    @Column(name="addpremium")
    public String getAddpremium() {
        return this.addpremium;
    }
    
    public void setAddpremium(String addpremium) {
        this.addpremium = addpremium;
    }

    @Column(name="rccpremium")
    public String getRccpremium() {
        return this.rccpremium;
    }
    
    public void setRccpremium(String rccpremium) {
        this.rccpremium = rccpremium;
    }

    @Column(name="mapremium")
    public String getMapremium() {
        return this.mapremium;
    }
    
    public void setMapremium(String mapremium) {
        this.mapremium = mapremium;
    }

    @Column(name="mcpremium")
    public String getMcpremium() {
        return this.mcpremium;
    }
    
    public void setMcpremium(String mcpremium) {
        this.mcpremium = mcpremium;
    }

    @Column(name="mepremium")
    public String getMepremium() {
        return this.mepremium;
    }
    
    public void setMepremium(String mepremium) {
        this.mepremium = mepremium;
    }

    @Column(name="hbpremium")
    public String getHbpremium() {
        return this.hbpremium;
    }
    
    public void setHbpremium(String hbpremium) {
        this.hbpremium = hbpremium;
    }

    @Column(name="hapremium")
    public String getHapremium() {
        return this.hapremium;
    }
    
    public void setHapremium(String hapremium) {
        this.hapremium = hapremium;
    }

    @Column(name="hspremium")
    public String getHspremium() {
        return this.hspremium;
    }
    
    public void setHspremium(String hspremium) {
        this.hspremium = hspremium;
    }

    @Column(name="ddpremium")
    public String getDdpremium() {
        return this.ddpremium;
    }
    
    public void setDdpremium(String ddpremium) {
        this.ddpremium = ddpremium;
    }

    @Column(name="lifetpdpremium")
    public String getLifetpdpremium() {
        return this.lifetpdpremium;
    }
    
    public void setLifetpdpremium(String lifetpdpremium) {
        this.lifetpdpremium = lifetpdpremium;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SplitpremiumamountId) ) return false;
		 SplitpremiumamountId castOther = ( SplitpremiumamountId ) other; 
         
		 return ( (this.getProductid()==castOther.getProductid()) || ( this.getProductid()!=null && castOther.getProductid()!=null && this.getProductid().equals(castOther.getProductid()) ) )
 && ( (this.getGrouppolicyno()==castOther.getGrouppolicyno()) || ( this.getGrouppolicyno()!=null && castOther.getGrouppolicyno()!=null && this.getGrouppolicyno().equals(castOther.getGrouppolicyno()) ) )
 && ( (this.getCustomercode()==castOther.getCustomercode()) || ( this.getCustomercode()!=null && castOther.getCustomercode()!=null && this.getCustomercode().equals(castOther.getCustomercode()) ) )
 && ( (this.getTotpremium()==castOther.getTotpremium()) || ( this.getTotpremium()!=null && castOther.getTotpremium()!=null && this.getTotpremium().equals(castOther.getTotpremium()) ) )
 && ( (this.getLifepremium()==castOther.getLifepremium()) || ( this.getLifepremium()!=null && castOther.getLifepremium()!=null && this.getLifepremium().equals(castOther.getLifepremium()) ) )
 && ( (this.getDeathpremium()==castOther.getDeathpremium()) || ( this.getDeathpremium()!=null && castOther.getDeathpremium()!=null && this.getDeathpremium().equals(castOther.getDeathpremium()) ) )
 && ( (this.getTpdpremium()==castOther.getTpdpremium()) || ( this.getTpdpremium()!=null && castOther.getTpdpremium()!=null && this.getTpdpremium().equals(castOther.getTpdpremium()) ) )
 && ( (this.getTtdpremium()==castOther.getTtdpremium()) || ( this.getTtdpremium()!=null && castOther.getTtdpremium()!=null && this.getTtdpremium().equals(castOther.getTtdpremium()) ) )
 && ( (this.getTdpremium()==castOther.getTdpremium()) || ( this.getTdpremium()!=null && castOther.getTdpremium()!=null && this.getTdpremium().equals(castOther.getTdpremium()) ) )
 && ( (this.getPapremium()==castOther.getPapremium()) || ( this.getPapremium()!=null && castOther.getPapremium()!=null && this.getPapremium().equals(castOther.getPapremium()) ) )
 && ( (this.getAdbpremium()==castOther.getAdbpremium()) || ( this.getAdbpremium()!=null && castOther.getAdbpremium()!=null && this.getAdbpremium().equals(castOther.getAdbpremium()) ) )
 && ( (this.getAddpremium()==castOther.getAddpremium()) || ( this.getAddpremium()!=null && castOther.getAddpremium()!=null && this.getAddpremium().equals(castOther.getAddpremium()) ) )
 && ( (this.getRccpremium()==castOther.getRccpremium()) || ( this.getRccpremium()!=null && castOther.getRccpremium()!=null && this.getRccpremium().equals(castOther.getRccpremium()) ) )
 && ( (this.getMapremium()==castOther.getMapremium()) || ( this.getMapremium()!=null && castOther.getMapremium()!=null && this.getMapremium().equals(castOther.getMapremium()) ) )
 && ( (this.getMcpremium()==castOther.getMcpremium()) || ( this.getMcpremium()!=null && castOther.getMcpremium()!=null && this.getMcpremium().equals(castOther.getMcpremium()) ) )
 && ( (this.getMepremium()==castOther.getMepremium()) || ( this.getMepremium()!=null && castOther.getMepremium()!=null && this.getMepremium().equals(castOther.getMepremium()) ) )
 && ( (this.getHbpremium()==castOther.getHbpremium()) || ( this.getHbpremium()!=null && castOther.getHbpremium()!=null && this.getHbpremium().equals(castOther.getHbpremium()) ) )
 && ( (this.getHapremium()==castOther.getHapremium()) || ( this.getHapremium()!=null && castOther.getHapremium()!=null && this.getHapremium().equals(castOther.getHapremium()) ) )
 && ( (this.getHspremium()==castOther.getHspremium()) || ( this.getHspremium()!=null && castOther.getHspremium()!=null && this.getHspremium().equals(castOther.getHspremium()) ) )
 && ( (this.getDdpremium()==castOther.getDdpremium()) || ( this.getDdpremium()!=null && castOther.getDdpremium()!=null && this.getDdpremium().equals(castOther.getDdpremium()) ) )
 && ( (this.getLifetpdpremium()==castOther.getLifetpdpremium()) || ( this.getLifetpdpremium()!=null && castOther.getLifetpdpremium()!=null && this.getLifetpdpremium().equals(castOther.getLifetpdpremium()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProductid() == null ? 0 : this.getProductid().hashCode() );
         result = 37 * result + ( getGrouppolicyno() == null ? 0 : this.getGrouppolicyno().hashCode() );
         result = 37 * result + ( getCustomercode() == null ? 0 : this.getCustomercode().hashCode() );
         result = 37 * result + ( getTotpremium() == null ? 0 : this.getTotpremium().hashCode() );
         result = 37 * result + ( getLifepremium() == null ? 0 : this.getLifepremium().hashCode() );
         result = 37 * result + ( getDeathpremium() == null ? 0 : this.getDeathpremium().hashCode() );
         result = 37 * result + ( getTpdpremium() == null ? 0 : this.getTpdpremium().hashCode() );
         result = 37 * result + ( getTtdpremium() == null ? 0 : this.getTtdpremium().hashCode() );
         result = 37 * result + ( getTdpremium() == null ? 0 : this.getTdpremium().hashCode() );
         result = 37 * result + ( getPapremium() == null ? 0 : this.getPapremium().hashCode() );
         result = 37 * result + ( getAdbpremium() == null ? 0 : this.getAdbpremium().hashCode() );
         result = 37 * result + ( getAddpremium() == null ? 0 : this.getAddpremium().hashCode() );
         result = 37 * result + ( getRccpremium() == null ? 0 : this.getRccpremium().hashCode() );
         result = 37 * result + ( getMapremium() == null ? 0 : this.getMapremium().hashCode() );
         result = 37 * result + ( getMcpremium() == null ? 0 : this.getMcpremium().hashCode() );
         result = 37 * result + ( getMepremium() == null ? 0 : this.getMepremium().hashCode() );
         result = 37 * result + ( getHbpremium() == null ? 0 : this.getHbpremium().hashCode() );
         result = 37 * result + ( getHapremium() == null ? 0 : this.getHapremium().hashCode() );
         result = 37 * result + ( getHspremium() == null ? 0 : this.getHspremium().hashCode() );
         result = 37 * result + ( getDdpremium() == null ? 0 : this.getDdpremium().hashCode() );
         result = 37 * result + ( getLifetpdpremium() == null ? 0 : this.getLifetpdpremium().hashCode() );
         return result;
   }   


}


