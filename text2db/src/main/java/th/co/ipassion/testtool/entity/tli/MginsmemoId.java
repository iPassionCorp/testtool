package th.co.ipassion.testtool.entity.tli;
// Generated Dec 29, 2017 9:15:36 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MginsmemoId generated by hbm2java
 */
@Embeddable
public class MginsmemoId  implements java.io.Serializable {


     private String certno;
     private String accidentdate;
     private String receivedate;
     private String memocode;

    public MginsmemoId() {
    }

    public MginsmemoId(String certno, String accidentdate, String receivedate, String memocode) {
       this.certno = certno;
       this.accidentdate = accidentdate;
       this.receivedate = receivedate;
       this.memocode = memocode;
    }
   

    @Column(name="certno", nullable=false, length=8)
    public String getCertno() {
        return this.certno;
    }
    
    public void setCertno(String certno) {
        this.certno = certno;
    }

    @Column(name="accidentdate", nullable=false, length=8)
    public String getAccidentdate() {
        return this.accidentdate;
    }
    
    public void setAccidentdate(String accidentdate) {
        this.accidentdate = accidentdate;
    }

    @Column(name="receivedate", nullable=false, length=8)
    public String getReceivedate() {
        return this.receivedate;
    }
    
    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    @Column(name="memocode", nullable=false, length=3)
    public String getMemocode() {
        return this.memocode;
    }
    
    public void setMemocode(String memocode) {
        this.memocode = memocode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MginsmemoId) ) return false;
		 MginsmemoId castOther = ( MginsmemoId ) other; 
         
		 return ( (this.getCertno()==castOther.getCertno()) || ( this.getCertno()!=null && castOther.getCertno()!=null && this.getCertno().equals(castOther.getCertno()) ) )
 && ( (this.getAccidentdate()==castOther.getAccidentdate()) || ( this.getAccidentdate()!=null && castOther.getAccidentdate()!=null && this.getAccidentdate().equals(castOther.getAccidentdate()) ) )
 && ( (this.getReceivedate()==castOther.getReceivedate()) || ( this.getReceivedate()!=null && castOther.getReceivedate()!=null && this.getReceivedate().equals(castOther.getReceivedate()) ) )
 && ( (this.getMemocode()==castOther.getMemocode()) || ( this.getMemocode()!=null && castOther.getMemocode()!=null && this.getMemocode().equals(castOther.getMemocode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCertno() == null ? 0 : this.getCertno().hashCode() );
         result = 37 * result + ( getAccidentdate() == null ? 0 : this.getAccidentdate().hashCode() );
         result = 37 * result + ( getReceivedate() == null ? 0 : this.getReceivedate().hashCode() );
         result = 37 * result + ( getMemocode() == null ? 0 : this.getMemocode().hashCode() );
         return result;
   }   


}


