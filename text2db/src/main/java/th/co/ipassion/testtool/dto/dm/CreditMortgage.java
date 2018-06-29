package th.co.ipassion.testtool.dto.dm;

public class CreditMortgage  implements java.io.Serializable {


     private String partnercode;
     private String billingtype;
     private String policyno;
     private String cert;
     private String policytype;
     private String cardname;
     private String cardtype;
     private String merchantcode;
     private String creditno;
     private String relationtype;
     private String ownername;
     private String expiredate;
     private String entrydate;
     private String entrytime;
     private String status;
     private String statusdate;
     private String userid;

    public CreditMortgage() {
    }

    public CreditMortgage(String partnercode, String billingtype, String policyno, String cert, String policytype, String cardname, String cardtype, String merchantcode, String creditno, String relationtype, String ownername, String expiredate, String entrydate, String entrytime, String status, String statusdate, String userid) {
       this.partnercode = partnercode;
       this.billingtype = billingtype;
       this.policyno = policyno;
       this.cert = cert;
       this.policytype = policytype;
       this.cardname = cardname;
       this.cardtype = cardtype;
       this.merchantcode = merchantcode;
       this.creditno = creditno;
       this.relationtype = relationtype;
       this.ownername = ownername;
       this.expiredate = expiredate;
       this.entrydate = entrydate;
       this.entrytime = entrytime;
       this.status = status;
       this.statusdate = statusdate;
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

    public String getCardname() {
        return this.cardname;
    }
    
    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getCardtype() {
        return this.cardtype;
    }
    
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getMerchantcode() {
        return this.merchantcode;
    }
    
    public void setMerchantcode(String merchantcode) {
        this.merchantcode = merchantcode;
    }

    public String getCreditno() {
        return this.creditno;
    }
    
    public void setCreditno(String creditno) {
        this.creditno = creditno;
    }

    public String getRelationtype() {
        return this.relationtype;
    }
    
    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype;
    }

    public String getOwnername() {
        return this.ownername;
    }
    
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getExpiredate() {
        return this.expiredate;
    }
    
    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    public String getEntrydate() {
        return this.entrydate;
    }
    
    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntrytime() {
        return this.entrytime;
    }
    
    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
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

    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CreditMortgage) ) return false;
		 CreditMortgage castOther = ( CreditMortgage ) other; 
         
		 return ( (this.getPartnercode()==castOther.getPartnercode()) || ( this.getPartnercode()!=null && castOther.getPartnercode()!=null && this.getPartnercode().equals(castOther.getPartnercode()) ) )
 && ( (this.getBillingtype()==castOther.getBillingtype()) || ( this.getBillingtype()!=null && castOther.getBillingtype()!=null && this.getBillingtype().equals(castOther.getBillingtype()) ) )
 && ( (this.getPolicyno()==castOther.getPolicyno()) || ( this.getPolicyno()!=null && castOther.getPolicyno()!=null && this.getPolicyno().equals(castOther.getPolicyno()) ) )
 && ( (this.getCert()==castOther.getCert()) || ( this.getCert()!=null && castOther.getCert()!=null && this.getCert().equals(castOther.getCert()) ) )
 && ( (this.getPolicytype()==castOther.getPolicytype()) || ( this.getPolicytype()!=null && castOther.getPolicytype()!=null && this.getPolicytype().equals(castOther.getPolicytype()) ) )
 && ( (this.getCardname()==castOther.getCardname()) || ( this.getCardname()!=null && castOther.getCardname()!=null && this.getCardname().equals(castOther.getCardname()) ) )
 && ( (this.getCardtype()==castOther.getCardtype()) || ( this.getCardtype()!=null && castOther.getCardtype()!=null && this.getCardtype().equals(castOther.getCardtype()) ) )
 && ( (this.getMerchantcode()==castOther.getMerchantcode()) || ( this.getMerchantcode()!=null && castOther.getMerchantcode()!=null && this.getMerchantcode().equals(castOther.getMerchantcode()) ) )
 && ( (this.getCreditno()==castOther.getCreditno()) || ( this.getCreditno()!=null && castOther.getCreditno()!=null && this.getCreditno().equals(castOther.getCreditno()) ) )
 && ( (this.getRelationtype()==castOther.getRelationtype()) || ( this.getRelationtype()!=null && castOther.getRelationtype()!=null && this.getRelationtype().equals(castOther.getRelationtype()) ) )
 && ( (this.getOwnername()==castOther.getOwnername()) || ( this.getOwnername()!=null && castOther.getOwnername()!=null && this.getOwnername().equals(castOther.getOwnername()) ) )
 && ( (this.getExpiredate()==castOther.getExpiredate()) || ( this.getExpiredate()!=null && castOther.getExpiredate()!=null && this.getExpiredate().equals(castOther.getExpiredate()) ) )
 && ( (this.getEntrydate()==castOther.getEntrydate()) || ( this.getEntrydate()!=null && castOther.getEntrydate()!=null && this.getEntrydate().equals(castOther.getEntrydate()) ) )
 && ( (this.getEntrytime()==castOther.getEntrytime()) || ( this.getEntrytime()!=null && castOther.getEntrytime()!=null && this.getEntrytime().equals(castOther.getEntrytime()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getStatusdate()==castOther.getStatusdate()) || ( this.getStatusdate()!=null && castOther.getStatusdate()!=null && this.getStatusdate().equals(castOther.getStatusdate()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) );
   }

}


