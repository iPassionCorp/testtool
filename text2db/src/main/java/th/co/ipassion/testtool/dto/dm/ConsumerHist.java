package th.co.ipassion.testtool.dto.dm;

public class ConsumerHist  implements java.io.Serializable {


     private String partnercode;
     private String billingtype;
     private String policyno;
     private String cert;
     private String policytype;
     private String seqno;
     private String merchantcode;
     private String paystatus;
     private String duedate;
     private String payperiod;
     private String sysdate;
     private String creditno;
     private String ownername;
     private String expireddate;
     private String approvalcode;
     private String billingdate;
     private String paymentdate;
     private String premium;
     private String mode;
     private String status;
     private String statusdate;
     private String responsecode;
     private String responsedate;
     private String attemp;
     private String rpno;
     private String submitno;
     private String userid;

    public ConsumerHist() {
    }

    public ConsumerHist(String partnercode, String billingtype, String policyno, String cert, String policytype, String seqno, String merchantcode, String paystatus, String duedate, String payperiod, String sysdate, String creditno, String ownername, String expireddate, String approvalcode, String billingdate, String paymentdate, String premium, String mode, String status, String statusdate, String responsecode, String responsedate, String attemp, String rpno, String submitno, String userid) {
       this.partnercode = partnercode;
       this.billingtype = billingtype;
       this.policyno = policyno;
       this.cert = cert;
       this.policytype = policytype;
       this.seqno = seqno;
       this.merchantcode = merchantcode;
       this.paystatus = paystatus;
       this.duedate = duedate;
       this.payperiod = payperiod;
       this.sysdate = sysdate;
       this.creditno = creditno;
       this.ownername = ownername;
       this.expireddate = expireddate;
       this.approvalcode = approvalcode;
       this.billingdate = billingdate;
       this.paymentdate = paymentdate;
       this.premium = premium;
       this.mode = mode;
       this.status = status;
       this.statusdate = statusdate;
       this.responsecode = responsecode;
       this.responsedate = responsedate;
       this.attemp = attemp;
       this.rpno = rpno;
       this.submitno = submitno;
       this.userid = userid;
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

    public String getSeqno() {
        return this.seqno;
    }
    
    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getMerchantcode() {
        return this.merchantcode;
    }
    
    public void setMerchantcode(String merchantcode) {
        this.merchantcode = merchantcode;
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

    public String getSysdate() {
        return this.sysdate;
    }
    
    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

    public String getCreditno() {
        return this.creditno;
    }
    
    public void setCreditno(String creditno) {
        this.creditno = creditno;
    }

    public String getOwnername() {
        return this.ownername;
    }
    
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getExpireddate() {
        return this.expireddate;
    }
    
    public void setExpireddate(String expireddate) {
        this.expireddate = expireddate;
    }

    public String getApprovalcode() {
        return this.approvalcode;
    }
    
    public void setApprovalcode(String approvalcode) {
        this.approvalcode = approvalcode;
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

    public String getResponsecode() {
        return this.responsecode;
    }
    
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    public String getResponsedate() {
        return this.responsedate;
    }
    
    public void setResponsedate(String responsedate) {
        this.responsedate = responsedate;
    }

    public String getAttemp() {
        return this.attemp;
    }
    
    public void setAttemp(String attemp) {
        this.attemp = attemp;
    }

    public String getRpno() {
        return this.rpno;
    }
    
    public void setRpno(String rpno) {
        this.rpno = rpno;
    }

    public String getSubmitno() {
        return this.submitno;
    }
    
    public void setSubmitno(String submitno) {
        this.submitno = submitno;
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
		 if ( !(other instanceof ConsumerHist) ) return false;
		 ConsumerHist castOther = ( ConsumerHist ) other; 
         
		 return ( (this.getPartnercode()==castOther.getPartnercode()) || ( this.getPartnercode()!=null && castOther.getPartnercode()!=null && this.getPartnercode().equals(castOther.getPartnercode()) ) )
 && ( (this.getBillingtype()==castOther.getBillingtype()) || ( this.getBillingtype()!=null && castOther.getBillingtype()!=null && this.getBillingtype().equals(castOther.getBillingtype()) ) )
 && ( (this.getPolicyno()==castOther.getPolicyno()) || ( this.getPolicyno()!=null && castOther.getPolicyno()!=null && this.getPolicyno().equals(castOther.getPolicyno()) ) )
 && ( (this.getCert()==castOther.getCert()) || ( this.getCert()!=null && castOther.getCert()!=null && this.getCert().equals(castOther.getCert()) ) )
 && ( (this.getPolicytype()==castOther.getPolicytype()) || ( this.getPolicytype()!=null && castOther.getPolicytype()!=null && this.getPolicytype().equals(castOther.getPolicytype()) ) )
 && ( (this.getSeqno()==castOther.getSeqno()) || ( this.getSeqno()!=null && castOther.getSeqno()!=null && this.getSeqno().equals(castOther.getSeqno()) ) )
 && ( (this.getMerchantcode()==castOther.getMerchantcode()) || ( this.getMerchantcode()!=null && castOther.getMerchantcode()!=null && this.getMerchantcode().equals(castOther.getMerchantcode()) ) )
 && ( (this.getPaystatus()==castOther.getPaystatus()) || ( this.getPaystatus()!=null && castOther.getPaystatus()!=null && this.getPaystatus().equals(castOther.getPaystatus()) ) )
 && ( (this.getDuedate()==castOther.getDuedate()) || ( this.getDuedate()!=null && castOther.getDuedate()!=null && this.getDuedate().equals(castOther.getDuedate()) ) )
 && ( (this.getPayperiod()==castOther.getPayperiod()) || ( this.getPayperiod()!=null && castOther.getPayperiod()!=null && this.getPayperiod().equals(castOther.getPayperiod()) ) )
 && ( (this.getSysdate()==castOther.getSysdate()) || ( this.getSysdate()!=null && castOther.getSysdate()!=null && this.getSysdate().equals(castOther.getSysdate()) ) )
 && ( (this.getCreditno()==castOther.getCreditno()) || ( this.getCreditno()!=null && castOther.getCreditno()!=null && this.getCreditno().equals(castOther.getCreditno()) ) )
 && ( (this.getOwnername()==castOther.getOwnername()) || ( this.getOwnername()!=null && castOther.getOwnername()!=null && this.getOwnername().equals(castOther.getOwnername()) ) )
 && ( (this.getExpireddate()==castOther.getExpireddate()) || ( this.getExpireddate()!=null && castOther.getExpireddate()!=null && this.getExpireddate().equals(castOther.getExpireddate()) ) )
 && ( (this.getApprovalcode()==castOther.getApprovalcode()) || ( this.getApprovalcode()!=null && castOther.getApprovalcode()!=null && this.getApprovalcode().equals(castOther.getApprovalcode()) ) )
 && ( (this.getBillingdate()==castOther.getBillingdate()) || ( this.getBillingdate()!=null && castOther.getBillingdate()!=null && this.getBillingdate().equals(castOther.getBillingdate()) ) )
 && ( (this.getPaymentdate()==castOther.getPaymentdate()) || ( this.getPaymentdate()!=null && castOther.getPaymentdate()!=null && this.getPaymentdate().equals(castOther.getPaymentdate()) ) )
 && ( (this.getPremium()==castOther.getPremium()) || ( this.getPremium()!=null && castOther.getPremium()!=null && this.getPremium().equals(castOther.getPremium()) ) )
 && ( (this.getMode()==castOther.getMode()) || ( this.getMode()!=null && castOther.getMode()!=null && this.getMode().equals(castOther.getMode()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getStatusdate()==castOther.getStatusdate()) || ( this.getStatusdate()!=null && castOther.getStatusdate()!=null && this.getStatusdate().equals(castOther.getStatusdate()) ) )
 && ( (this.getResponsecode()==castOther.getResponsecode()) || ( this.getResponsecode()!=null && castOther.getResponsecode()!=null && this.getResponsecode().equals(castOther.getResponsecode()) ) )
 && ( (this.getResponsedate()==castOther.getResponsedate()) || ( this.getResponsedate()!=null && castOther.getResponsedate()!=null && this.getResponsedate().equals(castOther.getResponsedate()) ) )
 && ( (this.getAttemp()==castOther.getAttemp()) || ( this.getAttemp()!=null && castOther.getAttemp()!=null && this.getAttemp().equals(castOther.getAttemp()) ) )
 && ( (this.getRpno()==castOther.getRpno()) || ( this.getRpno()!=null && castOther.getRpno()!=null && this.getRpno().equals(castOther.getRpno()) ) )
 && ( (this.getSubmitno()==castOther.getSubmitno()) || ( this.getSubmitno()!=null && castOther.getSubmitno()!=null && this.getSubmitno().equals(castOther.getSubmitno()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) );
   }

}


