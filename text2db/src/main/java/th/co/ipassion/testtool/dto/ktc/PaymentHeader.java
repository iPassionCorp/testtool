package th.co.ipassion.testtool.dto.ktc;

public class PaymentHeader  implements java.io.Serializable {


     private String uttxrectype;
     private String uttxseq;
     private String uttxeffectivedate;
     private String uttxfiledate;
     private String uttxmerid;
     private String uttxmername;
     private String uttxcompacno;
     private String uttxservicetype;
     private String uttxbankcode;
     private String uttxrecsize;
     private String uttxfiletype;
     private String filler;

    public PaymentHeader() {
    }

    public PaymentHeader(String uttxrectype, String uttxseq, String uttxeffectivedate, String uttxfiledate, String uttxmerid, String uttxmername, String uttxcompacno, String uttxservicetype, String uttxbankcode, String uttxrecsize, String uttxfiletype, String filler) {
       this.uttxrectype = uttxrectype;
       this.uttxseq = uttxseq;
       this.uttxeffectivedate = uttxeffectivedate;
       this.uttxfiledate = uttxfiledate;
       this.uttxmerid = uttxmerid;
       this.uttxmername = uttxmername;
       this.uttxcompacno = uttxcompacno;
       this.uttxservicetype = uttxservicetype;
       this.uttxbankcode = uttxbankcode;
       this.uttxrecsize = uttxrecsize;
       this.uttxfiletype = uttxfiletype;
       this.filler = filler;
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

    public String getUttxeffectivedate() {
        return this.uttxeffectivedate;
    }
    
    public void setUttxeffectivedate(String uttxeffectivedate) {
        this.uttxeffectivedate = uttxeffectivedate;
    }

    public String getUttxfiledate() {
        return this.uttxfiledate;
    }
    
    public void setUttxfiledate(String uttxfiledate) {
        this.uttxfiledate = uttxfiledate;
    }

    public String getUttxmerid() {
        return this.uttxmerid;
    }
    
    public void setUttxmerid(String uttxmerid) {
        this.uttxmerid = uttxmerid;
    }

    public String getUttxmername() {
        return this.uttxmername;
    }
    
    public void setUttxmername(String uttxmername) {
        this.uttxmername = uttxmername;
    }

    public String getUttxcompacno() {
        return this.uttxcompacno;
    }
    
    public void setUttxcompacno(String uttxcompacno) {
        this.uttxcompacno = uttxcompacno;
    }

    public String getUttxservicetype() {
        return this.uttxservicetype;
    }
    
    public void setUttxservicetype(String uttxservicetype) {
        this.uttxservicetype = uttxservicetype;
    }

    public String getUttxbankcode() {
        return this.uttxbankcode;
    }
    
    public void setUttxbankcode(String uttxbankcode) {
        this.uttxbankcode = uttxbankcode;
    }

    public String getUttxrecsize() {
        return this.uttxrecsize;
    }
    
    public void setUttxrecsize(String uttxrecsize) {
        this.uttxrecsize = uttxrecsize;
    }

    public String getUttxfiletype() {
        return this.uttxfiletype;
    }
    
    public void setUttxfiletype(String uttxfiletype) {
        this.uttxfiletype = uttxfiletype;
    }

    public String getFiller() {
        return this.filler;
    }
    
    public void setFiller(String filler) {
        this.filler = filler;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PaymentHeader) ) return false;
		 PaymentHeader castOther = ( PaymentHeader ) other; 
         
		 return ( (this.getUttxrectype()==castOther.getUttxrectype()) || ( this.getUttxrectype()!=null && castOther.getUttxrectype()!=null && this.getUttxrectype().equals(castOther.getUttxrectype()) ) )
 && ( (this.getUttxseq()==castOther.getUttxseq()) || ( this.getUttxseq()!=null && castOther.getUttxseq()!=null && this.getUttxseq().equals(castOther.getUttxseq()) ) )
 && ( (this.getUttxeffectivedate()==castOther.getUttxeffectivedate()) || ( this.getUttxeffectivedate()!=null && castOther.getUttxeffectivedate()!=null && this.getUttxeffectivedate().equals(castOther.getUttxeffectivedate()) ) )
 && ( (this.getUttxfiledate()==castOther.getUttxfiledate()) || ( this.getUttxfiledate()!=null && castOther.getUttxfiledate()!=null && this.getUttxfiledate().equals(castOther.getUttxfiledate()) ) )
 && ( (this.getUttxmerid()==castOther.getUttxmerid()) || ( this.getUttxmerid()!=null && castOther.getUttxmerid()!=null && this.getUttxmerid().equals(castOther.getUttxmerid()) ) )
 && ( (this.getUttxmername()==castOther.getUttxmername()) || ( this.getUttxmername()!=null && castOther.getUttxmername()!=null && this.getUttxmername().equals(castOther.getUttxmername()) ) )
 && ( (this.getUttxcompacno()==castOther.getUttxcompacno()) || ( this.getUttxcompacno()!=null && castOther.getUttxcompacno()!=null && this.getUttxcompacno().equals(castOther.getUttxcompacno()) ) )
 && ( (this.getUttxservicetype()==castOther.getUttxservicetype()) || ( this.getUttxservicetype()!=null && castOther.getUttxservicetype()!=null && this.getUttxservicetype().equals(castOther.getUttxservicetype()) ) )
 && ( (this.getUttxbankcode()==castOther.getUttxbankcode()) || ( this.getUttxbankcode()!=null && castOther.getUttxbankcode()!=null && this.getUttxbankcode().equals(castOther.getUttxbankcode()) ) )
 && ( (this.getUttxrecsize()==castOther.getUttxrecsize()) || ( this.getUttxrecsize()!=null && castOther.getUttxrecsize()!=null && this.getUttxrecsize().equals(castOther.getUttxrecsize()) ) )
 && ( (this.getUttxfiletype()==castOther.getUttxfiletype()) || ( this.getUttxfiletype()!=null && castOther.getUttxfiletype()!=null && this.getUttxfiletype().equals(castOther.getUttxfiletype()) ) )
 && ( (this.getFiller()==castOther.getFiller()) || ( this.getFiller()!=null && castOther.getFiller()!=null && this.getFiller().equals(castOther.getFiller()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUttxrectype() == null ? 0 : this.getUttxrectype().hashCode() );
         result = 37 * result + ( getUttxseq() == null ? 0 : this.getUttxseq().hashCode() );
         result = 37 * result + ( getUttxeffectivedate() == null ? 0 : this.getUttxeffectivedate().hashCode() );
         result = 37 * result + ( getUttxfiledate() == null ? 0 : this.getUttxfiledate().hashCode() );
         result = 37 * result + ( getUttxmerid() == null ? 0 : this.getUttxmerid().hashCode() );
         result = 37 * result + ( getUttxmername() == null ? 0 : this.getUttxmername().hashCode() );
         result = 37 * result + ( getUttxcompacno() == null ? 0 : this.getUttxcompacno().hashCode() );
         result = 37 * result + ( getUttxservicetype() == null ? 0 : this.getUttxservicetype().hashCode() );
         result = 37 * result + ( getUttxbankcode() == null ? 0 : this.getUttxbankcode().hashCode() );
         result = 37 * result + ( getUttxrecsize() == null ? 0 : this.getUttxrecsize().hashCode() );
         result = 37 * result + ( getUttxfiletype() == null ? 0 : this.getUttxfiletype().hashCode() );
         result = 37 * result + ( getFiller() == null ? 0 : this.getFiller().hashCode() );
         return result;
   }   


}


