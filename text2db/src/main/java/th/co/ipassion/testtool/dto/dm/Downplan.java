package th.co.ipassion.testtool.dto.dm;

public class Downplan  implements java.io.Serializable {


     private String policyno;
     private String certno;
     private String oldpackage;
     private String newpackage;
     private String payperiod;
     private String oldpremium;
     private String newpremium;
     private String userid;
     private String transactiondate;
     private String status;
     private String statusdate;
     private String endorsedate;
     private String paydate;
     private String requestdate;
     private String duedate;
     private String submitbranch;
     private String remark;

    public Downplan() {
    }

    public Downplan(String policyno, String certno, String oldpackage, String newpackage, String payperiod, String oldpremium, String newpremium, String userid, String transactiondate, String status, String statusdate, String endorsedate, String paydate, String requestdate, String duedate, String submitbranch, String remark) {
       this.policyno = policyno;
       this.certno = certno;
       this.oldpackage = oldpackage;
       this.newpackage = newpackage;
       this.payperiod = payperiod;
       this.oldpremium = oldpremium;
       this.newpremium = newpremium;
       this.userid = userid;
       this.transactiondate = transactiondate;
       this.status = status;
       this.statusdate = statusdate;
       this.endorsedate = endorsedate;
       this.paydate = paydate;
       this.requestdate = requestdate;
       this.duedate = duedate;
       this.submitbranch = submitbranch;
       this.remark = remark;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Downplan) ) return false;
		 Downplan castOther = ( Downplan ) other; 
         
		 return ( (this.getPolicyno()==castOther.getPolicyno()) || ( this.getPolicyno()!=null && castOther.getPolicyno()!=null && this.getPolicyno().equals(castOther.getPolicyno()) ) )
 && ( (this.getCertno()==castOther.getCertno()) || ( this.getCertno()!=null && castOther.getCertno()!=null && this.getCertno().equals(castOther.getCertno()) ) )
 && ( (this.getOldpackage()==castOther.getOldpackage()) || ( this.getOldpackage()!=null && castOther.getOldpackage()!=null && this.getOldpackage().equals(castOther.getOldpackage()) ) )
 && ( (this.getNewpackage()==castOther.getNewpackage()) || ( this.getNewpackage()!=null && castOther.getNewpackage()!=null && this.getNewpackage().equals(castOther.getNewpackage()) ) )
 && ( (this.getPayperiod()==castOther.getPayperiod()) || ( this.getPayperiod()!=null && castOther.getPayperiod()!=null && this.getPayperiod().equals(castOther.getPayperiod()) ) )
 && ( (this.getOldpremium()==castOther.getOldpremium()) || ( this.getOldpremium()!=null && castOther.getOldpremium()!=null && this.getOldpremium().equals(castOther.getOldpremium()) ) )
 && ( (this.getNewpremium()==castOther.getNewpremium()) || ( this.getNewpremium()!=null && castOther.getNewpremium()!=null && this.getNewpremium().equals(castOther.getNewpremium()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) )
 && ( (this.getTransactiondate()==castOther.getTransactiondate()) || ( this.getTransactiondate()!=null && castOther.getTransactiondate()!=null && this.getTransactiondate().equals(castOther.getTransactiondate()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getStatusdate()==castOther.getStatusdate()) || ( this.getStatusdate()!=null && castOther.getStatusdate()!=null && this.getStatusdate().equals(castOther.getStatusdate()) ) )
 && ( (this.getEndorsedate()==castOther.getEndorsedate()) || ( this.getEndorsedate()!=null && castOther.getEndorsedate()!=null && this.getEndorsedate().equals(castOther.getEndorsedate()) ) )
 && ( (this.getPaydate()==castOther.getPaydate()) || ( this.getPaydate()!=null && castOther.getPaydate()!=null && this.getPaydate().equals(castOther.getPaydate()) ) )
 && ( (this.getRequestdate()==castOther.getRequestdate()) || ( this.getRequestdate()!=null && castOther.getRequestdate()!=null && this.getRequestdate().equals(castOther.getRequestdate()) ) )
 && ( (this.getDuedate()==castOther.getDuedate()) || ( this.getDuedate()!=null && castOther.getDuedate()!=null && this.getDuedate().equals(castOther.getDuedate()) ) )
 && ( (this.getSubmitbranch()==castOther.getSubmitbranch()) || ( this.getSubmitbranch()!=null && castOther.getSubmitbranch()!=null && this.getSubmitbranch().equals(castOther.getSubmitbranch()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) );
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

public String getOldpackage() {
	return oldpackage;
}

public void setOldpackage(String oldpackage) {
	this.oldpackage = oldpackage;
}

public String getNewpackage() {
	return newpackage;
}

public void setNewpackage(String newpackage) {
	this.newpackage = newpackage;
}

public String getPayperiod() {
	return payperiod;
}

public void setPayperiod(String payperiod) {
	this.payperiod = payperiod;
}

public String getOldpremium() {
	return oldpremium;
}

public void setOldpremium(String oldpremium) {
	this.oldpremium = oldpremium;
}

public String getNewpremium() {
	return newpremium;
}

public void setNewpremium(String newpremium) {
	this.newpremium = newpremium;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getTransactiondate() {
	return transactiondate;
}

public void setTransactiondate(String transactiondate) {
	this.transactiondate = transactiondate;
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

public String getEndorsedate() {
	return endorsedate;
}

public void setEndorsedate(String endorsedate) {
	this.endorsedate = endorsedate;
}

public String getPaydate() {
	return paydate;
}

public void setPaydate(String paydate) {
	this.paydate = paydate;
}

public String getRequestdate() {
	return requestdate;
}

public void setRequestdate(String requestdate) {
	this.requestdate = requestdate;
}

public String getDuedate() {
	return duedate;
}

public void setDuedate(String duedate) {
	this.duedate = duedate;
}

public String getSubmitbranch() {
	return submitbranch;
}

public void setSubmitbranch(String submitbranch) {
	this.submitbranch = submitbranch;
}

public String getRemark() {
	return remark;
}

public void setRemark(String remark) {
	this.remark = remark;
}
  


}


