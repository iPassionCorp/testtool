package th.co.ipassion.testtool.dto.ktc;

public class BillingFooter  implements java.io.Serializable {


     private String uttxrectype;
     private String uttxseq;
     private String uttxtotdbamount;
     private String uttxnodbitem;
     private String uttxtotcramount;
     private String uttxnocritem;
     private String filler;

    public BillingFooter() {
    }

    public BillingFooter(String uttxrectype, String uttxseq, String uttxtotdbamount, String uttxnodbitem, String uttxtotcramount, String uttxnocritem, String filler) {
       this.uttxrectype = uttxrectype;
       this.uttxseq = uttxseq;
       this.uttxtotdbamount = uttxtotdbamount;
       this.uttxnodbitem = uttxnodbitem;
       this.uttxtotcramount = uttxtotcramount;
       this.uttxnocritem = uttxnocritem;
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

    public String getFiller() {
        return this.filler;
    }
    
    public void setFiller(String filler) {
        this.filler = filler;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BillingFooter) ) return false;
		 BillingFooter castOther = ( BillingFooter ) other; 
         
		 return ( (this.getUttxrectype()==castOther.getUttxrectype()) || ( this.getUttxrectype()!=null && castOther.getUttxrectype()!=null && this.getUttxrectype().equals(castOther.getUttxrectype()) ) )
 && ( (this.getUttxseq()==castOther.getUttxseq()) || ( this.getUttxseq()!=null && castOther.getUttxseq()!=null && this.getUttxseq().equals(castOther.getUttxseq()) ) )
 && ( (this.getUttxtotdbamount()==castOther.getUttxtotdbamount()) || ( this.getUttxtotdbamount()!=null && castOther.getUttxtotdbamount()!=null && this.getUttxtotdbamount().equals(castOther.getUttxtotdbamount()) ) )
 && ( (this.getUttxnodbitem()==castOther.getUttxnodbitem()) || ( this.getUttxnodbitem()!=null && castOther.getUttxnodbitem()!=null && this.getUttxnodbitem().equals(castOther.getUttxnodbitem()) ) )
 && ( (this.getUttxtotcramount()==castOther.getUttxtotcramount()) || ( this.getUttxtotcramount()!=null && castOther.getUttxtotcramount()!=null && this.getUttxtotcramount().equals(castOther.getUttxtotcramount()) ) )
 && ( (this.getUttxnocritem()==castOther.getUttxnocritem()) || ( this.getUttxnocritem()!=null && castOther.getUttxnocritem()!=null && this.getUttxnocritem().equals(castOther.getUttxnocritem()) ) )
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
         result = 37 * result + ( getFiller() == null ? 0 : this.getFiller().hashCode() );
         return result;
   }   


}


