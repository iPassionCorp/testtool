package th.co.ipassion.testtool.dto.ktc;

public class PaymentDetail  implements java.io.Serializable {


     private String uttxrectype;
     private String uttxseq;
     private String uttxpan;
     private String uttxcardholdername;
     private String uttxtrxnamt;
     private String uttxreferno1;
     private String uttxreferno2;
     private String uttxtrxntype;
     private String uttxrecordstatus;
     private String uttxpaymentdate;
     private String uttxpaymenttime;
     private String uttxresponsecode;
     private String uttxauthcode;
     private String expirydate;

    public PaymentDetail() {
    }

    public PaymentDetail(String uttxrectype, String uttxseq, String uttxpan, String uttxcardholdername, String uttxtrxnamt, String uttxreferno1, String uttxreferno2, String uttxtrxntype, String uttxrecordstatus, String uttxpaymentdate, String uttxpaymenttime, String uttxresponsecode, String uttxauthcode, String expirydate) {
       this.uttxrectype = uttxrectype;
       this.uttxseq = uttxseq;
       this.uttxpan = uttxpan;
       this.uttxcardholdername = uttxcardholdername;
       this.uttxtrxnamt = uttxtrxnamt;
       this.uttxreferno1 = uttxreferno1;
       this.uttxreferno2 = uttxreferno2;
       this.uttxtrxntype = uttxtrxntype;
       this.uttxrecordstatus = uttxrecordstatus;
       this.uttxpaymentdate = uttxpaymentdate;
       this.uttxpaymenttime = uttxpaymenttime;
       this.uttxresponsecode = uttxresponsecode;
       this.uttxauthcode = uttxauthcode;
       this.expirydate = expirydate;
    }
   
    public String getUttxrectype() {
        return this.uttxrectype;
    }
    
    public void setUttxrectype(String uttxrectype) {
        this.uttxrectype = uttxrectype;
    }

    public String getUttxseq() {
        return this.uttxseq;
    }
    
    public void setUttxseq(String uttxseq) {
        this.uttxseq = uttxseq;
    }

    public String getUttxpan() {
        return this.uttxpan;
    }
    
    public void setUttxpan(String uttxpan) {
        this.uttxpan = uttxpan;
    }

    public String getUttxcardholdername() {
        return this.uttxcardholdername;
    }
    
    public void setUttxcardholdername(String uttxcardholdername) {
        this.uttxcardholdername = uttxcardholdername;
    }

    public String getUttxtrxnamt() {
        return this.uttxtrxnamt;
    }
    
    public void setUttxtrxnamt(String uttxtrxnamt) {
        this.uttxtrxnamt = uttxtrxnamt;
    }

    public String getUttxreferno1() {
        return this.uttxreferno1;
    }
    
    public void setUttxreferno1(String uttxreferno1) {
        this.uttxreferno1 = uttxreferno1;
    }

    public String getUttxreferno2() {
        return this.uttxreferno2;
    }
    
    public void setUttxreferno2(String uttxreferno2) {
        this.uttxreferno2 = uttxreferno2;
    }

    public String getUttxtrxntype() {
        return this.uttxtrxntype;
    }
    
    public void setUttxtrxntype(String uttxtrxntype) {
        this.uttxtrxntype = uttxtrxntype;
    }

    public String getUttxrecordstatus() {
        return this.uttxrecordstatus;
    }
    
    public void setUttxrecordstatus(String uttxrecordstatus) {
        this.uttxrecordstatus = uttxrecordstatus;
    }

    public String getUttxpaymentdate() {
        return this.uttxpaymentdate;
    }
    
    public void setUttxpaymentdate(String uttxpaymentdate) {
        this.uttxpaymentdate = uttxpaymentdate;
    }

    public String getUttxpaymenttime() {
        return this.uttxpaymenttime;
    }
    
    public void setUttxpaymenttime(String uttxpaymenttime) {
        this.uttxpaymenttime = uttxpaymenttime;
    }

    public String getUttxresponsecode() {
        return this.uttxresponsecode;
    }
    
    public void setUttxresponsecode(String uttxresponsecode) {
        this.uttxresponsecode = uttxresponsecode;
    }

    public String getUttxauthcode() {
        return this.uttxauthcode;
    }
    
    public void setUttxauthcode(String uttxauthcode) {
        this.uttxauthcode = uttxauthcode;
    }

    public String getExpirydate() {
        return this.expirydate;
    }
    
    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PaymentDetail) ) return false;
		 PaymentDetail castOther = ( PaymentDetail ) other; 
         
		 return ( (this.getUttxrectype()==castOther.getUttxrectype()) || ( this.getUttxrectype()!=null && castOther.getUttxrectype()!=null && this.getUttxrectype().equals(castOther.getUttxrectype()) ) )
 && ( (this.getUttxseq()==castOther.getUttxseq()) || ( this.getUttxseq()!=null && castOther.getUttxseq()!=null && this.getUttxseq().equals(castOther.getUttxseq()) ) )
 && ( (this.getUttxpan()==castOther.getUttxpan()) || ( this.getUttxpan()!=null && castOther.getUttxpan()!=null && this.getUttxpan().equals(castOther.getUttxpan()) ) )
 && ( (this.getUttxcardholdername()==castOther.getUttxcardholdername()) || ( this.getUttxcardholdername()!=null && castOther.getUttxcardholdername()!=null && this.getUttxcardholdername().equals(castOther.getUttxcardholdername()) ) )
 && ( (this.getUttxtrxnamt()==castOther.getUttxtrxnamt()) || ( this.getUttxtrxnamt()!=null && castOther.getUttxtrxnamt()!=null && this.getUttxtrxnamt().equals(castOther.getUttxtrxnamt()) ) )
 && ( (this.getUttxreferno1()==castOther.getUttxreferno1()) || ( this.getUttxreferno1()!=null && castOther.getUttxreferno1()!=null && this.getUttxreferno1().equals(castOther.getUttxreferno1()) ) )
 && ( (this.getUttxreferno2()==castOther.getUttxreferno2()) || ( this.getUttxreferno2()!=null && castOther.getUttxreferno2()!=null && this.getUttxreferno2().equals(castOther.getUttxreferno2()) ) )
 && ( (this.getUttxtrxntype()==castOther.getUttxtrxntype()) || ( this.getUttxtrxntype()!=null && castOther.getUttxtrxntype()!=null && this.getUttxtrxntype().equals(castOther.getUttxtrxntype()) ) )
 && ( (this.getUttxrecordstatus()==castOther.getUttxrecordstatus()) || ( this.getUttxrecordstatus()!=null && castOther.getUttxrecordstatus()!=null && this.getUttxrecordstatus().equals(castOther.getUttxrecordstatus()) ) )
 && ( (this.getUttxpaymentdate()==castOther.getUttxpaymentdate()) || ( this.getUttxpaymentdate()!=null && castOther.getUttxpaymentdate()!=null && this.getUttxpaymentdate().equals(castOther.getUttxpaymentdate()) ) )
 && ( (this.getUttxpaymenttime()==castOther.getUttxpaymenttime()) || ( this.getUttxpaymenttime()!=null && castOther.getUttxpaymenttime()!=null && this.getUttxpaymenttime().equals(castOther.getUttxpaymenttime()) ) )
 && ( (this.getUttxresponsecode()==castOther.getUttxresponsecode()) || ( this.getUttxresponsecode()!=null && castOther.getUttxresponsecode()!=null && this.getUttxresponsecode().equals(castOther.getUttxresponsecode()) ) )
 && ( (this.getUttxauthcode()==castOther.getUttxauthcode()) || ( this.getUttxauthcode()!=null && castOther.getUttxauthcode()!=null && this.getUttxauthcode().equals(castOther.getUttxauthcode()) ) )
 && ( (this.getExpirydate()==castOther.getExpirydate()) || ( this.getExpirydate()!=null && castOther.getExpirydate()!=null && this.getExpirydate().equals(castOther.getExpirydate()) ) );
   }


}


