package th.co.ipassion.testtool.entity.tlitext;
// Generated Dec 29, 2017 9:15:09 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MgreceiverId generated by hbm2java
 */
@Embeddable
public class MgreceiverId  implements java.io.Serializable {


     private String certno;
     private String accidentdate;
     private String receivedate;
     private String seqno;
     private String prename;
     private String firstname;
     private String lastname;
     private String type;
     private String payamount;
     private String address;
     private String tumbon;
     private String zipcode;
     private String mobilephone;
     private String citizenid;
     private String paytype;
     private String banktype;
     private String bankcode;
     private String bankbranch;
     private String bankaccount;
     private String guardianbeneficiary;
     private String ispay;
     private String haveindicia;
     private String countrycode;
     private String claimpaydate;
     private String bookstatus;
     private String chqdate;
     private String chqno;
     private String docno;
     private String isbeneficiarykilled;
     private String birthdate;

    public MgreceiverId() {
    }

    public MgreceiverId(String certno, String accidentdate, String receivedate, String seqno, String prename, String firstname, String lastname, String type, String payamount, String address, String tumbon, String zipcode, String mobilephone, String citizenid, String paytype, String banktype, String bankcode, String bankbranch, String bankaccount, String guardianbeneficiary, String ispay, String haveindicia, String countrycode, String claimpaydate, String bookstatus, String chqdate, String chqno, String docno, String isbeneficiarykilled, String birthdate) {
       this.certno = certno;
       this.accidentdate = accidentdate;
       this.receivedate = receivedate;
       this.seqno = seqno;
       this.prename = prename;
       this.firstname = firstname;
       this.lastname = lastname;
       this.type = type;
       this.payamount = payamount;
       this.address = address;
       this.tumbon = tumbon;
       this.zipcode = zipcode;
       this.mobilephone = mobilephone;
       this.citizenid = citizenid;
       this.paytype = paytype;
       this.banktype = banktype;
       this.bankcode = bankcode;
       this.bankbranch = bankbranch;
       this.bankaccount = bankaccount;
       this.guardianbeneficiary = guardianbeneficiary;
       this.ispay = ispay;
       this.haveindicia = haveindicia;
       this.countrycode = countrycode;
       this.claimpaydate = claimpaydate;
       this.bookstatus = bookstatus;
       this.chqdate = chqdate;
       this.chqno = chqno;
       this.docno = docno;
       this.isbeneficiarykilled = isbeneficiarykilled;
       this.birthdate = birthdate;
    }
   

    @Column(name="certno")
    public String getCertno() {
        return this.certno;
    }
    
    public void setCertno(String certno) {
        this.certno = certno;
    }

    @Column(name="accidentdate")
    public String getAccidentdate() {
        return this.accidentdate;
    }
    
    public void setAccidentdate(String accidentdate) {
        this.accidentdate = accidentdate;
    }

    @Column(name="receivedate")
    public String getReceivedate() {
        return this.receivedate;
    }
    
    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    @Column(name="seqno")
    public String getSeqno() {
        return this.seqno;
    }
    
    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    @Column(name="prename")
    public String getPrename() {
        return this.prename;
    }
    
    public void setPrename(String prename) {
        this.prename = prename;
    }

    @Column(name="firstname")
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name="lastname")
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name="type")
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    @Column(name="payamount")
    public String getPayamount() {
        return this.payamount;
    }
    
    public void setPayamount(String payamount) {
        this.payamount = payamount;
    }

    @Column(name="address")
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name="tumbon")
    public String getTumbon() {
        return this.tumbon;
    }
    
    public void setTumbon(String tumbon) {
        this.tumbon = tumbon;
    }

    @Column(name="zipcode")
    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Column(name="mobilephone")
    public String getMobilephone() {
        return this.mobilephone;
    }
    
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    @Column(name="citizenid")
    public String getCitizenid() {
        return this.citizenid;
    }
    
    public void setCitizenid(String citizenid) {
        this.citizenid = citizenid;
    }

    @Column(name="paytype")
    public String getPaytype() {
        return this.paytype;
    }
    
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    @Column(name="banktype")
    public String getBanktype() {
        return this.banktype;
    }
    
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    @Column(name="bankcode")
    public String getBankcode() {
        return this.bankcode;
    }
    
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name="bankbranch")
    public String getBankbranch() {
        return this.bankbranch;
    }
    
    public void setBankbranch(String bankbranch) {
        this.bankbranch = bankbranch;
    }

    @Column(name="bankaccount")
    public String getBankaccount() {
        return this.bankaccount;
    }
    
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Column(name="guardianbeneficiary")
    public String getGuardianbeneficiary() {
        return this.guardianbeneficiary;
    }
    
    public void setGuardianbeneficiary(String guardianbeneficiary) {
        this.guardianbeneficiary = guardianbeneficiary;
    }

    @Column(name="ispay")
    public String getIspay() {
        return this.ispay;
    }
    
    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    @Column(name="haveindicia")
    public String getHaveindicia() {
        return this.haveindicia;
    }
    
    public void setHaveindicia(String haveindicia) {
        this.haveindicia = haveindicia;
    }

    @Column(name="countrycode")
    public String getCountrycode() {
        return this.countrycode;
    }
    
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Column(name="claimpaydate ")
    public String getClaimpaydate() {
        return this.claimpaydate;
    }
    
    public void setClaimpaydate(String claimpaydate) {
        this.claimpaydate = claimpaydate;
    }

    @Column(name="bookstatus")
    public String getBookstatus() {
        return this.bookstatus;
    }
    
    public void setBookstatus(String bookstatus) {
        this.bookstatus = bookstatus;
    }

    @Column(name="chqdate")
    public String getChqdate() {
        return this.chqdate;
    }
    
    public void setChqdate(String chqdate) {
        this.chqdate = chqdate;
    }

    @Column(name="chqno")
    public String getChqno() {
        return this.chqno;
    }
    
    public void setChqno(String chqno) {
        this.chqno = chqno;
    }

    @Column(name="docno")
    public String getDocno() {
        return this.docno;
    }
    
    public void setDocno(String docno) {
        this.docno = docno;
    }

    @Column(name="isbeneficiarykilled")
    public String getIsbeneficiarykilled() {
        return this.isbeneficiarykilled;
    }
    
    public void setIsbeneficiarykilled(String isbeneficiarykilled) {
        this.isbeneficiarykilled = isbeneficiarykilled;
    }

    @Column(name="birthdate")
    public String getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MgreceiverId) ) return false;
		 MgreceiverId castOther = ( MgreceiverId ) other; 
         
		 return ( (this.getCertno()==castOther.getCertno()) || ( this.getCertno()!=null && castOther.getCertno()!=null && this.getCertno().equals(castOther.getCertno()) ) )
 && ( (this.getAccidentdate()==castOther.getAccidentdate()) || ( this.getAccidentdate()!=null && castOther.getAccidentdate()!=null && this.getAccidentdate().equals(castOther.getAccidentdate()) ) )
 && ( (this.getReceivedate()==castOther.getReceivedate()) || ( this.getReceivedate()!=null && castOther.getReceivedate()!=null && this.getReceivedate().equals(castOther.getReceivedate()) ) )
 && ( (this.getSeqno()==castOther.getSeqno()) || ( this.getSeqno()!=null && castOther.getSeqno()!=null && this.getSeqno().equals(castOther.getSeqno()) ) )
 && ( (this.getPrename()==castOther.getPrename()) || ( this.getPrename()!=null && castOther.getPrename()!=null && this.getPrename().equals(castOther.getPrename()) ) )
 && ( (this.getFirstname()==castOther.getFirstname()) || ( this.getFirstname()!=null && castOther.getFirstname()!=null && this.getFirstname().equals(castOther.getFirstname()) ) )
 && ( (this.getLastname()==castOther.getLastname()) || ( this.getLastname()!=null && castOther.getLastname()!=null && this.getLastname().equals(castOther.getLastname()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getPayamount()==castOther.getPayamount()) || ( this.getPayamount()!=null && castOther.getPayamount()!=null && this.getPayamount().equals(castOther.getPayamount()) ) )
 && ( (this.getAddress()==castOther.getAddress()) || ( this.getAddress()!=null && castOther.getAddress()!=null && this.getAddress().equals(castOther.getAddress()) ) )
 && ( (this.getTumbon()==castOther.getTumbon()) || ( this.getTumbon()!=null && castOther.getTumbon()!=null && this.getTumbon().equals(castOther.getTumbon()) ) )
 && ( (this.getZipcode()==castOther.getZipcode()) || ( this.getZipcode()!=null && castOther.getZipcode()!=null && this.getZipcode().equals(castOther.getZipcode()) ) )
 && ( (this.getMobilephone()==castOther.getMobilephone()) || ( this.getMobilephone()!=null && castOther.getMobilephone()!=null && this.getMobilephone().equals(castOther.getMobilephone()) ) )
 && ( (this.getCitizenid()==castOther.getCitizenid()) || ( this.getCitizenid()!=null && castOther.getCitizenid()!=null && this.getCitizenid().equals(castOther.getCitizenid()) ) )
 && ( (this.getPaytype()==castOther.getPaytype()) || ( this.getPaytype()!=null && castOther.getPaytype()!=null && this.getPaytype().equals(castOther.getPaytype()) ) )
 && ( (this.getBanktype()==castOther.getBanktype()) || ( this.getBanktype()!=null && castOther.getBanktype()!=null && this.getBanktype().equals(castOther.getBanktype()) ) )
 && ( (this.getBankcode()==castOther.getBankcode()) || ( this.getBankcode()!=null && castOther.getBankcode()!=null && this.getBankcode().equals(castOther.getBankcode()) ) )
 && ( (this.getBankbranch()==castOther.getBankbranch()) || ( this.getBankbranch()!=null && castOther.getBankbranch()!=null && this.getBankbranch().equals(castOther.getBankbranch()) ) )
 && ( (this.getBankaccount()==castOther.getBankaccount()) || ( this.getBankaccount()!=null && castOther.getBankaccount()!=null && this.getBankaccount().equals(castOther.getBankaccount()) ) )
 && ( (this.getGuardianbeneficiary()==castOther.getGuardianbeneficiary()) || ( this.getGuardianbeneficiary()!=null && castOther.getGuardianbeneficiary()!=null && this.getGuardianbeneficiary().equals(castOther.getGuardianbeneficiary()) ) )
 && ( (this.getIspay()==castOther.getIspay()) || ( this.getIspay()!=null && castOther.getIspay()!=null && this.getIspay().equals(castOther.getIspay()) ) )
 && ( (this.getHaveindicia()==castOther.getHaveindicia()) || ( this.getHaveindicia()!=null && castOther.getHaveindicia()!=null && this.getHaveindicia().equals(castOther.getHaveindicia()) ) )
 && ( (this.getCountrycode()==castOther.getCountrycode()) || ( this.getCountrycode()!=null && castOther.getCountrycode()!=null && this.getCountrycode().equals(castOther.getCountrycode()) ) )
 && ( (this.getClaimpaydate()==castOther.getClaimpaydate()) || ( this.getClaimpaydate()!=null && castOther.getClaimpaydate()!=null && this.getClaimpaydate().equals(castOther.getClaimpaydate()) ) )
 && ( (this.getBookstatus()==castOther.getBookstatus()) || ( this.getBookstatus()!=null && castOther.getBookstatus()!=null && this.getBookstatus().equals(castOther.getBookstatus()) ) )
 && ( (this.getChqdate()==castOther.getChqdate()) || ( this.getChqdate()!=null && castOther.getChqdate()!=null && this.getChqdate().equals(castOther.getChqdate()) ) )
 && ( (this.getChqno()==castOther.getChqno()) || ( this.getChqno()!=null && castOther.getChqno()!=null && this.getChqno().equals(castOther.getChqno()) ) )
 && ( (this.getDocno()==castOther.getDocno()) || ( this.getDocno()!=null && castOther.getDocno()!=null && this.getDocno().equals(castOther.getDocno()) ) )
 && ( (this.getIsbeneficiarykilled()==castOther.getIsbeneficiarykilled()) || ( this.getIsbeneficiarykilled()!=null && castOther.getIsbeneficiarykilled()!=null && this.getIsbeneficiarykilled().equals(castOther.getIsbeneficiarykilled()) ) )
 && ( (this.getBirthdate()==castOther.getBirthdate()) || ( this.getBirthdate()!=null && castOther.getBirthdate()!=null && this.getBirthdate().equals(castOther.getBirthdate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCertno() == null ? 0 : this.getCertno().hashCode() );
         result = 37 * result + ( getAccidentdate() == null ? 0 : this.getAccidentdate().hashCode() );
         result = 37 * result + ( getReceivedate() == null ? 0 : this.getReceivedate().hashCode() );
         result = 37 * result + ( getSeqno() == null ? 0 : this.getSeqno().hashCode() );
         result = 37 * result + ( getPrename() == null ? 0 : this.getPrename().hashCode() );
         result = 37 * result + ( getFirstname() == null ? 0 : this.getFirstname().hashCode() );
         result = 37 * result + ( getLastname() == null ? 0 : this.getLastname().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getPayamount() == null ? 0 : this.getPayamount().hashCode() );
         result = 37 * result + ( getAddress() == null ? 0 : this.getAddress().hashCode() );
         result = 37 * result + ( getTumbon() == null ? 0 : this.getTumbon().hashCode() );
         result = 37 * result + ( getZipcode() == null ? 0 : this.getZipcode().hashCode() );
         result = 37 * result + ( getMobilephone() == null ? 0 : this.getMobilephone().hashCode() );
         result = 37 * result + ( getCitizenid() == null ? 0 : this.getCitizenid().hashCode() );
         result = 37 * result + ( getPaytype() == null ? 0 : this.getPaytype().hashCode() );
         result = 37 * result + ( getBanktype() == null ? 0 : this.getBanktype().hashCode() );
         result = 37 * result + ( getBankcode() == null ? 0 : this.getBankcode().hashCode() );
         result = 37 * result + ( getBankbranch() == null ? 0 : this.getBankbranch().hashCode() );
         result = 37 * result + ( getBankaccount() == null ? 0 : this.getBankaccount().hashCode() );
         result = 37 * result + ( getGuardianbeneficiary() == null ? 0 : this.getGuardianbeneficiary().hashCode() );
         result = 37 * result + ( getIspay() == null ? 0 : this.getIspay().hashCode() );
         result = 37 * result + ( getHaveindicia() == null ? 0 : this.getHaveindicia().hashCode() );
         result = 37 * result + ( getCountrycode() == null ? 0 : this.getCountrycode().hashCode() );
         result = 37 * result + ( getClaimpaydate() == null ? 0 : this.getClaimpaydate().hashCode() );
         result = 37 * result + ( getBookstatus() == null ? 0 : this.getBookstatus().hashCode() );
         result = 37 * result + ( getChqdate() == null ? 0 : this.getChqdate().hashCode() );
         result = 37 * result + ( getChqno() == null ? 0 : this.getChqno().hashCode() );
         result = 37 * result + ( getDocno() == null ? 0 : this.getDocno().hashCode() );
         result = 37 * result + ( getIsbeneficiarykilled() == null ? 0 : this.getIsbeneficiarykilled().hashCode() );
         result = 37 * result + ( getBirthdate() == null ? 0 : this.getBirthdate().hashCode() );
         return result;
   }   


}


