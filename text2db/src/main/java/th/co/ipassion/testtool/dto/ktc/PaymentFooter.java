package th.co.ipassion.testtool.dto.ktc;

public class PaymentFooter  implements java.io.Serializable {


     private String uttxrectype;
     private String uttxseq;
     private String uttxtotdbamount;
     private String uttxnodbitem;
     private String uttxtotcramount;
     private String uttxnocritem;
     private String uttxtotrejdbamount;
     private String uttxnorejdbitem;
     private String uttxtotrejcramount;
     private String uttxnorejcritem;
     private String filler;

    public PaymentFooter() {
    }

    public PaymentFooter(String uttxrectype, String uttxseq, String uttxtotdbamount, String uttxnodbitem, String uttxtotcramount, String uttxnocritem, String uttxtotrejdbamount, String uttxnorejdbitem, String uttxtotrejcramount, String uttxnorejcritem, String filler) {
       this.uttxrectype = uttxrectype;
       this.uttxseq = uttxseq;
       this.uttxtotdbamount = uttxtotdbamount;
       this.uttxnodbitem = uttxnodbitem;
       this.uttxtotcramount = uttxtotcramount;
       this.uttxnocritem = uttxnocritem;
       this.uttxtotrejdbamount = uttxtotrejdbamount;
       this.uttxnorejdbitem = uttxnorejdbitem;
       this.uttxtotrejcramount = uttxtotrejcramount;
       this.uttxnorejcritem = uttxnorejcritem;
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

    public String getUttxtotdbamount() {
        return this.uttxtotdbamount;
    }
    
    public void setUttxtotdbamount(String uttxtotdbamount) {
        this.uttxtotdbamount = uttxtotdbamount;
    }

    public String getUttxnodbitem() {
        return this.uttxnodbitem;
    }
    
    public void setUttxnodbitem(String uttxnodbitem) {
        this.uttxnodbitem = uttxnodbitem;
    }

    public String getUttxtotcramount() {
        return this.uttxtotcramount;
    }
    
    public void setUttxtotcramount(String uttxtotcramount) {
        this.uttxtotcramount = uttxtotcramount;
    }

    public String getUttxnocritem() {
        return this.uttxnocritem;
    }
    
    public void setUttxnocritem(String uttxnocritem) {
        this.uttxnocritem = uttxnocritem;
    }

    public String getUttxtotrejdbamount() {
        return this.uttxtotrejdbamount;
    }
    
    public void setUttxtotrejdbamount(String uttxtotrejdbamount) {
        this.uttxtotrejdbamount = uttxtotrejdbamount;
    }

    public String getUttxnorejdbitem() {
        return this.uttxnorejdbitem;
    }
    
    public void setUttxnorejdbitem(String uttxnorejdbitem) {
        this.uttxnorejdbitem = uttxnorejdbitem;
    }

    public String getUttxtotrejcramount() {
        return this.uttxtotrejcramount;
    }
    
    public void setUttxtotrejcramount(String uttxtotrejcramount) {
        this.uttxtotrejcramount = uttxtotrejcramount;
    }

    public String getUttxnorejcritem() {
        return this.uttxnorejcritem;
    }
    
    public void setUttxnorejcritem(String uttxnorejcritem) {
        this.uttxnorejcritem = uttxnorejcritem;
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
		 if ( !(other instanceof PaymentFooter) ) return false;
		 PaymentFooter castOther = ( PaymentFooter ) other; 
         
		 return ( (this.getUttxrectype()==castOther.getUttxrectype()) || ( this.getUttxrectype()!=null && castOther.getUttxrectype()!=null && this.getUttxrectype().equals(castOther.getUttxrectype()) ) )
 && ( (this.getUttxseq()==castOther.getUttxseq()) || ( this.getUttxseq()!=null && castOther.getUttxseq()!=null && this.getUttxseq().equals(castOther.getUttxseq()) ) )
 && ( (this.getUttxtotdbamount()==castOther.getUttxtotdbamount()) || ( this.getUttxtotdbamount()!=null && castOther.getUttxtotdbamount()!=null && this.getUttxtotdbamount().equals(castOther.getUttxtotdbamount()) ) )
 && ( (this.getUttxnodbitem()==castOther.getUttxnodbitem()) || ( this.getUttxnodbitem()!=null && castOther.getUttxnodbitem()!=null && this.getUttxnodbitem().equals(castOther.getUttxnodbitem()) ) )
 && ( (this.getUttxtotcramount()==castOther.getUttxtotcramount()) || ( this.getUttxtotcramount()!=null && castOther.getUttxtotcramount()!=null && this.getUttxtotcramount().equals(castOther.getUttxtotcramount()) ) )
 && ( (this.getUttxnocritem()==castOther.getUttxnocritem()) || ( this.getUttxnocritem()!=null && castOther.getUttxnocritem()!=null && this.getUttxnocritem().equals(castOther.getUttxnocritem()) ) )
 && ( (this.getUttxtotrejdbamount()==castOther.getUttxtotrejdbamount()) || ( this.getUttxtotrejdbamount()!=null && castOther.getUttxtotrejdbamount()!=null && this.getUttxtotrejdbamount().equals(castOther.getUttxtotrejdbamount()) ) )
 && ( (this.getUttxnorejdbitem()==castOther.getUttxnorejdbitem()) || ( this.getUttxnorejdbitem()!=null && castOther.getUttxnorejdbitem()!=null && this.getUttxnorejdbitem().equals(castOther.getUttxnorejdbitem()) ) )
 && ( (this.getUttxtotrejcramount()==castOther.getUttxtotrejcramount()) || ( this.getUttxtotrejcramount()!=null && castOther.getUttxtotrejcramount()!=null && this.getUttxtotrejcramount().equals(castOther.getUttxtotrejcramount()) ) )
 && ( (this.getUttxnorejcritem()==castOther.getUttxnorejcritem()) || ( this.getUttxnorejcritem()!=null && castOther.getUttxnorejcritem()!=null && this.getUttxnorejcritem().equals(castOther.getUttxnorejcritem()) ) )
 && ( (this.getFiller()==castOther.getFiller()) || ( this.getFiller()!=null && castOther.getFiller()!=null && this.getFiller().equals(castOther.getFiller()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUttxrectype() == null ? 0 : this.getUttxrectype().hashCode() );
         result = 37 * result + ( getUttxseq() == null ? 0 : this.getUttxseq().hashCode() );
         result = 37 * result + ( getUttxtotdbamount() == null ? 0 : this.getUttxtotdbamount().hashCode() );
         result = 37 * result + ( getUttxnodbitem() == null ? 0 : this.getUttxnodbitem().hashCode() );
         result = 37 * result + ( getUttxtotcramount() == null ? 0 : this.getUttxtotcramount().hashCode() );
         result = 37 * result + ( getUttxnocritem() == null ? 0 : this.getUttxnocritem().hashCode() );
         result = 37 * result + ( getUttxtotrejdbamount() == null ? 0 : this.getUttxtotrejdbamount().hashCode() );
         result = 37 * result + ( getUttxnorejdbitem() == null ? 0 : this.getUttxnorejdbitem().hashCode() );
         result = 37 * result + ( getUttxtotrejcramount() == null ? 0 : this.getUttxtotrejcramount().hashCode() );
         result = 37 * result + ( getUttxnorejcritem() == null ? 0 : this.getUttxnorejcritem().hashCode() );
         result = 37 * result + ( getFiller() == null ? 0 : this.getFiller().hashCode() );
         return result;
   }   


}


