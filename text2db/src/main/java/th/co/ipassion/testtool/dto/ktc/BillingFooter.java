package th.co.ipassion.testtool.dto.ktc;

public class BillingFooter implements java.io.Serializable{
    private String uttxrectype;
    private String uttxseq;
    private String uttxtotdbamount;
    private String uttxnodbitem;
    private String uttxtotcramount;
    private String uttxnocritem;
    private String filler;

    public String getUttxrectype() {
        return uttxrectype;
    }

    public void setUttxrectype(String uttxrectype) {
        this.uttxrectype = uttxrectype;
    }

    public String getUttxseq() {
        return uttxseq;
    }

    public void setUttxseq(String uttxseq) {
        this.uttxseq = uttxseq;
    }

    public String getUttxtotdbamount() {
        return uttxtotdbamount;
    }

    public void setUttxtotdbamount(String uttxtotdbamount) {
        this.uttxtotdbamount = uttxtotdbamount;
    }

    public String getUttxnodbitem() {
        return uttxnodbitem;
    }

    public void setUttxnodbitem(String uttxnodbitem) {
        this.uttxnodbitem = uttxnodbitem;
    }

    public String getUttxtotcramount() {
        return uttxtotcramount;
    }

    public void setUttxtotcramount(String uttxtotcramount) {
        this.uttxtotcramount = uttxtotcramount;
    }

    public String getUttxnocritem() {
        return uttxnocritem;
    }

    public void setUttxnocritem(String uttxnocritem) {
        this.uttxnocritem = uttxnocritem;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }
}
