package th.co.ipassion.testtool.dto.dm;

public class DownplanDetail  implements java.io.Serializable {


     private String policyno;
     private String certno;
     private String ridertype;
     private String oldsum;
     private String newsum;
     private String oldpremium;
     private String newpremium;

    public DownplanDetail() {
    }

    public DownplanDetail(String policyno, String certno, String ridertype, String oldsum, String newsum, String oldpremium, String newpremium) {
       this.policyno = policyno;
       this.certno = certno;
       this.ridertype = ridertype;
       this.oldsum = oldsum;
       this.newsum = newsum;
       this.oldpremium = oldpremium;
       this.newpremium = newpremium;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DownplanDetail) ) return false;
		 DownplanDetail castOther = ( DownplanDetail ) other; 
         
		 return ( (this.getPolicyno()==castOther.getPolicyno()) || ( this.getPolicyno()!=null && castOther.getPolicyno()!=null && this.getPolicyno().equals(castOther.getPolicyno()) ) )
 && ( (this.getCertno()==castOther.getCertno()) || ( this.getCertno()!=null && castOther.getCertno()!=null && this.getCertno().equals(castOther.getCertno()) ) )
 && ( (this.getRidertype()==castOther.getRidertype()) || ( this.getRidertype()!=null && castOther.getRidertype()!=null && this.getRidertype().equals(castOther.getRidertype()) ) )
 && ( (this.getOldsum()==castOther.getOldsum()) || ( this.getOldsum()!=null && castOther.getOldsum()!=null && this.getOldsum().equals(castOther.getOldsum()) ) )
 && ( (this.getNewsum()==castOther.getNewsum()) || ( this.getNewsum()!=null && castOther.getNewsum()!=null && this.getNewsum().equals(castOther.getNewsum()) ) )
 && ( (this.getOldpremium()==castOther.getOldpremium()) || ( this.getOldpremium()!=null && castOther.getOldpremium()!=null && this.getOldpremium().equals(castOther.getOldpremium()) ) )
 && ( (this.getNewpremium()==castOther.getNewpremium()) || ( this.getNewpremium()!=null && castOther.getNewpremium()!=null && this.getNewpremium().equals(castOther.getNewpremium()) ) );
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

public String getRidertype() {
	return ridertype;
}

public void setRidertype(String ridertype) {
	this.ridertype = ridertype;
}

public String getOldsum() {
	return oldsum;
}

public void setOldsum(String oldsum) {
	this.oldsum = oldsum;
}

public String getNewsum() {
	return newsum;
}

public void setNewsum(String newsum) {
	this.newsum = newsum;
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
   



}


