package th.co.ipassion.testtool.dto.dm;

public class PartnerBilling  implements java.io.Serializable {


     private String partnercode;
     private String partnerabb;
     private String billingtype;
     private String billingdue;
     private String billingdate;
     private String startduedate;
     private String lastduedate;
     private String status;
     private String transactiondate;
     private String type;
     private String userid;

    public PartnerBilling() {
    }

    public PartnerBilling(String partnercode, String partnerabb, String billingtype, String billingdue, String billingdate, String startduedate, String lastduedate, String status, String transactiondate, String type, String userid) {
       this.partnercode = partnercode;
       this.partnerabb = partnerabb;
       this.billingtype = billingtype;
       this.billingdue = billingdue;
       this.billingdate = billingdate;
       this.startduedate = startduedate;
       this.lastduedate = lastduedate;
       this.status = status;
       this.transactiondate = transactiondate;
       this.type = type;
       this.userid = userid;
    }
   
    public String getPartnercode() {
        return this.partnercode;
    }
    
    public void setPartnercode(String partnercode) {
        this.partnercode = partnercode;
    }

    public String getPartnerabb() {
        return this.partnerabb;
    }
    
    public void setPartnerabb(String partnerabb) {
        this.partnerabb = partnerabb;
    }

    public String getBillingtype() {
        return this.billingtype;
    }
    
    public void setBillingtype(String billingtype) {
        this.billingtype = billingtype;
    }

    public String getBillingdue() {
        return this.billingdue;
    }
    
    public void setBillingdue(String billingdue) {
        this.billingdue = billingdue;
    }

    public String getBillingdate() {
        return this.billingdate;
    }
    
    public void setBillingdate(String billingdate) {
        this.billingdate = billingdate;
    }

    public String getStartduedate() {
        return this.startduedate;
    }
    
    public void setStartduedate(String startduedate) {
        this.startduedate = startduedate;
    }

    public String getLastduedate() {
        return this.lastduedate;
    }
    
    public void setLastduedate(String lastduedate) {
        this.lastduedate = lastduedate;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactiondate() {
        return this.transactiondate;
    }
    
    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PartnerBilling) ) return false;
		 PartnerBilling castOther = ( PartnerBilling ) other; 
         
		 return ( (this.getPartnercode()==castOther.getPartnercode()) || ( this.getPartnercode()!=null && castOther.getPartnercode()!=null && this.getPartnercode().equals(castOther.getPartnercode()) ) )
 && ( (this.getPartnerabb()==castOther.getPartnerabb()) || ( this.getPartnerabb()!=null && castOther.getPartnerabb()!=null && this.getPartnerabb().equals(castOther.getPartnerabb()) ) )
 && ( (this.getBillingtype()==castOther.getBillingtype()) || ( this.getBillingtype()!=null && castOther.getBillingtype()!=null && this.getBillingtype().equals(castOther.getBillingtype()) ) )
 && ( (this.getBillingdue()==castOther.getBillingdue()) || ( this.getBillingdue()!=null && castOther.getBillingdue()!=null && this.getBillingdue().equals(castOther.getBillingdue()) ) )
 && ( (this.getBillingdate()==castOther.getBillingdate()) || ( this.getBillingdate()!=null && castOther.getBillingdate()!=null && this.getBillingdate().equals(castOther.getBillingdate()) ) )
 && ( (this.getStartduedate()==castOther.getStartduedate()) || ( this.getStartduedate()!=null && castOther.getStartduedate()!=null && this.getStartduedate().equals(castOther.getStartduedate()) ) )
 && ( (this.getLastduedate()==castOther.getLastduedate()) || ( this.getLastduedate()!=null && castOther.getLastduedate()!=null && this.getLastduedate().equals(castOther.getLastduedate()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getTransactiondate()==castOther.getTransactiondate()) || ( this.getTransactiondate()!=null && castOther.getTransactiondate()!=null && this.getTransactiondate().equals(castOther.getTransactiondate()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) );
   } 


}


