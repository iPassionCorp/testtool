package th.co.ipassion.testtool.dto.dm;

public class BillingPost  implements java.io.Serializable {


     private String partnercode;
     private String billingtype;
     private String policyno;
     private String cert;
     private String policytype;
     private String paystatus;
     private String duedate;
     private String payperiod;
     private String postdate;
     private String billingdate;
     private String paymentdate;
     private String premium;
     private String mode;
     private String status;
     private String statusdate;
     private String attemp;
     private String attempdate;

    public BillingPost() {
    }

    public BillingPost(String partnercode, String billingtype, String policyno, String cert, String policytype, String paystatus, String duedate, String payperiod, String postdate, String billingdate, String paymentdate, String premium, String mode, String status, String statusdate, String attemp, String attenpdate) {
       this.partnercode = partnercode;
       this.billingtype = billingtype;
       this.policyno = policyno;
       this.cert = cert;
       this.policytype = policytype;
       this.paystatus = paystatus;
       this.duedate = duedate;
       this.payperiod = payperiod;
       this.postdate = postdate;
       this.billingdate = billingdate;
       this.paymentdate = paymentdate;
       this.premium = premium;
       this.mode = mode;
       this.status = status;
       this.statusdate = statusdate;
       this.attemp = attemp;
       this.attempdate = attenpdate;
    }

    public String getPartnercode() {
        return this.partnercode;
    }
    
    public void setPartnercode(String partnercode) {
        this.partnercode = partnercode;
    }

    public String getBillingtype() {
        return this.billingtype;
    }
    
    public void setBillingtype(String billingtype) {
        this.billingtype = billingtype;
    }

    public String getPolicyno() {
        return this.policyno;
    }
    
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getCert() {
        return this.cert;
    }
    
    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getPolicytype() {
        return this.policytype;
    }
    
    public void setPolicytype(String policytype) {
        this.policytype = policytype;
    }

    public String getPaystatus() {
        return this.paystatus;
    }
    
    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public String getDuedate() {
        return this.duedate;
    }
    
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getPayperiod() {
        return this.payperiod;
    }
    
    public void setPayperiod(String payperiod) {
        this.payperiod = payperiod;
    }

    public String getPostdate() {
        return this.postdate;
    }
    
    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getBillingdate() {
        return this.billingdate;
    }
    
    public void setBillingdate(String billingdate) {
        this.billingdate = billingdate;
    }

    public String getPaymentdate() {
        return this.paymentdate;
    }
    
    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getPremium() {
        return this.premium;
    }
    
    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getMode() {
        return this.mode;
    }
    
    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusdate() {
        return this.statusdate;
    }
    
    public void setStatusdate(String statusdate) {
        this.statusdate = statusdate;
    }

    public String getAttemp() {
        return this.attemp;
    }
    
    public void setAttemp(String attemp) {
        this.attemp = attemp;
    }

   public String getAttempdate() {
		return attempdate;
	}

	public void setAttempdate(String attempdate) {
		this.attempdate = attempdate;
	}

public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BillingPost) ) return false;
		 BillingPost castOther = ( BillingPost ) other; 
         
		 return ( (this.getPartnercode()==castOther.getPartnercode()) || ( this.getPartnercode()!=null && castOther.getPartnercode()!=null && this.getPartnercode().equals(castOther.getPartnercode()) ) )
 && ( (this.getBillingtype()==castOther.getBillingtype()) || ( this.getBillingtype()!=null && castOther.getBillingtype()!=null && this.getBillingtype().equals(castOther.getBillingtype()) ) )
 && ( (this.getPolicyno()==castOther.getPolicyno()) || ( this.getPolicyno()!=null && castOther.getPolicyno()!=null && this.getPolicyno().equals(castOther.getPolicyno()) ) )
 && ( (this.getCert()==castOther.getCert()) || ( this.getCert()!=null && castOther.getCert()!=null && this.getCert().equals(castOther.getCert()) ) )
 && ( (this.getPolicytype()==castOther.getPolicytype()) || ( this.getPolicytype()!=null && castOther.getPolicytype()!=null && this.getPolicytype().equals(castOther.getPolicytype()) ) )
 && ( (this.getPaystatus()==castOther.getPaystatus()) || ( this.getPaystatus()!=null && castOther.getPaystatus()!=null && this.getPaystatus().equals(castOther.getPaystatus()) ) )
 && ( (this.getDuedate()==castOther.getDuedate()) || ( this.getDuedate()!=null && castOther.getDuedate()!=null && this.getDuedate().equals(castOther.getDuedate()) ) )
 && ( (this.getPayperiod()==castOther.getPayperiod()) || ( this.getPayperiod()!=null && castOther.getPayperiod()!=null && this.getPayperiod().equals(castOther.getPayperiod()) ) )
 && ( (this.getPostdate()==castOther.getPostdate()) || ( this.getPostdate()!=null && castOther.getPostdate()!=null && this.getPostdate().equals(castOther.getPostdate()) ) )
 && ( (this.getBillingdate()==castOther.getBillingdate()) || ( this.getBillingdate()!=null && castOther.getBillingdate()!=null && this.getBillingdate().equals(castOther.getBillingdate()) ) )
 && ( (this.getPaymentdate()==castOther.getPaymentdate()) || ( this.getPaymentdate()!=null && castOther.getPaymentdate()!=null && this.getPaymentdate().equals(castOther.getPaymentdate()) ) )
 && ( (this.getPremium()==castOther.getPremium()) || ( this.getPremium()!=null && castOther.getPremium()!=null && this.getPremium().equals(castOther.getPremium()) ) )
 && ( (this.getMode()==castOther.getMode()) || ( this.getMode()!=null && castOther.getMode()!=null && this.getMode().equals(castOther.getMode()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getStatusdate()==castOther.getStatusdate()) || ( this.getStatusdate()!=null && castOther.getStatusdate()!=null && this.getStatusdate().equals(castOther.getStatusdate()) ) )
 && ( (this.getAttemp()==castOther.getAttemp()) || ( this.getAttemp()!=null && castOther.getAttemp()!=null && this.getAttemp().equals(castOther.getAttemp()) ) )
 && ( (this.getAttempdate()==castOther.getAttempdate()) || ( this.getAttempdate()!=null && castOther.getAttempdate()!=null && this.getAttempdate().equals(castOther.getAttempdate()) ) );
   }
   

}


