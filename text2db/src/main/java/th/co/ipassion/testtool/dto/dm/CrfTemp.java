package th.co.ipassion.testtool.dto.dm;

public class CrfTemp  implements java.io.Serializable {


     private String type;
     private String policyno;
     private String certno;
     private String transactiondate;
     private String crfdate;
     private String creditno;
     private String partialrefund;
     private String partialrefunddate;
     private String cancelcode;
     private String payperiod;
     private String refundpremium;
     private String status;
     private String statusdate;
     private String ownerbranch;
     private String submitbranch;
     private String userid;
     private String remark;
     private String contacttelno;

    public CrfTemp() {
    }

    public CrfTemp(String type, String policyno, String certno, String transactiondate, String crfdate, String creditno, String partialrefund, String partialrefunddate, String cancelcode, String payperiod, String refundpremium, String status, String statusdate, String ownerbranch, String submitbranch, String userid, String remark, String contacttelno) {
       this.type = type;
       this.policyno = policyno;
       this.certno = certno;
       this.transactiondate = transactiondate;
       this.crfdate = crfdate;
       this.creditno = creditno;
       this.partialrefund = partialrefund;
       this.partialrefunddate = partialrefunddate;
       this.cancelcode = cancelcode;
       this.payperiod = payperiod;
       this.refundpremium = refundpremium;
       this.status = status;
       this.statusdate = statusdate;
       this.ownerbranch = ownerbranch;
       this.submitbranch = submitbranch;
       this.userid = userid;
       this.remark = remark;
       this.contacttelno = contacttelno;
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CrfTemp) ) return false;
		 CrfTemp castOther = ( CrfTemp ) other; 
         
		 return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getPolicyno()==castOther.getPolicyno()) || ( this.getPolicyno()!=null && castOther.getPolicyno()!=null && this.getPolicyno().equals(castOther.getPolicyno()) ) )
 && ( (this.getCertno()==castOther.getCertno()) || ( this.getCertno()!=null && castOther.getCertno()!=null && this.getCertno().equals(castOther.getCertno()) ) )
 && ( (this.getTransactiondate()==castOther.getTransactiondate()) || ( this.getTransactiondate()!=null && castOther.getTransactiondate()!=null && this.getTransactiondate().equals(castOther.getTransactiondate()) ) )
 && ( (this.getCrfdate()==castOther.getCrfdate()) || ( this.getCrfdate()!=null && castOther.getCrfdate()!=null && this.getCrfdate().equals(castOther.getCrfdate()) ) )
 && ( (this.getCreditno()==castOther.getCreditno()) || ( this.getCreditno()!=null && castOther.getCreditno()!=null && this.getCreditno().equals(castOther.getCreditno()) ) )
 && ( (this.getPartialrefund()==castOther.getPartialrefund()) || ( this.getPartialrefund()!=null && castOther.getPartialrefund()!=null && this.getPartialrefund().equals(castOther.getPartialrefund()) ) )
 && ( (this.getPartialrefunddate()==castOther.getPartialrefunddate()) || ( this.getPartialrefunddate()!=null && castOther.getPartialrefunddate()!=null && this.getPartialrefunddate().equals(castOther.getPartialrefunddate()) ) )
 && ( (this.getCancelcode()==castOther.getCancelcode()) || ( this.getCancelcode()!=null && castOther.getCancelcode()!=null && this.getCancelcode().equals(castOther.getCancelcode()) ) )
 && ( (this.getPayperiod()==castOther.getPayperiod()) || ( this.getPayperiod()!=null && castOther.getPayperiod()!=null && this.getPayperiod().equals(castOther.getPayperiod()) ) )
 && ( (this.getRefundpremium()==castOther.getRefundpremium()) || ( this.getRefundpremium()!=null && castOther.getRefundpremium()!=null && this.getRefundpremium().equals(castOther.getRefundpremium()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getStatusdate()==castOther.getStatusdate()) || ( this.getStatusdate()!=null && castOther.getStatusdate()!=null && this.getStatusdate().equals(castOther.getStatusdate()) ) )
 && ( (this.getOwnerbranch()==castOther.getOwnerbranch()) || ( this.getOwnerbranch()!=null && castOther.getOwnerbranch()!=null && this.getOwnerbranch().equals(castOther.getOwnerbranch()) ) )
 && ( (this.getSubmitbranch()==castOther.getSubmitbranch()) || ( this.getSubmitbranch()!=null && castOther.getSubmitbranch()!=null && this.getSubmitbranch().equals(castOther.getSubmitbranch()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getContacttelno()==castOther.getContacttelno()) || ( this.getContacttelno()!=null && castOther.getContacttelno()!=null && this.getContacttelno().equals(castOther.getContacttelno()) ) );
   }

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPolicyno() {
	return policyno;
}

public void setPolicyno(String policyno) {
	this.policyno = policyno;
}

public String getCertno() {
	return certno;
}

public void setCertno(String certno) {
	this.certno = certno;
}

public String getTransactiondate() {
	return transactiondate;
}

public void setTransactiondate(String transactiondate) {
	this.transactiondate = transactiondate;
}

public String getCrfdate() {
	return crfdate;
}

public void setCrfdate(String crfdate) {
	this.crfdate = crfdate;
}

public String getCreditno() {
	return creditno;
}

public void setCreditno(String creditno) {
	this.creditno = creditno;
}

public String getPartialrefund() {
	return partialrefund;
}

public void setPartialrefund(String partialrefund) {
	this.partialrefund = partialrefund;
}

public String getPartialrefunddate() {
	return partialrefunddate;
}

public void setPartialrefunddate(String partialrefunddate) {
	this.partialrefunddate = partialrefunddate;
}

public String getCancelcode() {
	return cancelcode;
}

public void setCancelcode(String cancelcode) {
	this.cancelcode = cancelcode;
}

public String getPayperiod() {
	return payperiod;
}

public void setPayperiod(String payperiod) {
	this.payperiod = payperiod;
}

public String getRefundpremium() {
	return refundpremium;
}

public void setRefundpremium(String refundpremium) {
	this.refundpremium = refundpremium;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getStatusdate() {
	return statusdate;
}

public void setStatusdate(String statusdate) {
	this.statusdate = statusdate;
}

public String getOwnerbranch() {
	return ownerbranch;
}

public void setOwnerbranch(String ownerbranch) {
	this.ownerbranch = ownerbranch;
}

public String getSubmitbranch() {
	return submitbranch;
}

public void setSubmitbranch(String submitbranch) {
	this.submitbranch = submitbranch;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getRemark() {
	return remark;
}

public void setRemark(String remark) {
	this.remark = remark;
}

public String getContacttelno() {
	return contacttelno;
}

public void setContacttelno(String contacttelno) {
	this.contacttelno = contacttelno;
}
  


}


