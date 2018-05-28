package th.co.ipassion.testtool.dto.billing;

public class HistoryDownPlan {
    private String certno;
    private String oldproductcode;
    private String newproductcode;
    private String payperiod;
    private String newpremium;
    private String createdate;
    private String status;

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    public String getOldproductcode() {
        return oldproductcode;
    }

    public void setOldproductcode(String oldproductcode) {
        this.oldproductcode = oldproductcode;
    }

    public String getNewproductcode() {
        return newproductcode;
    }

    public void setNewproductcode(String newproductcode) {
        this.newproductcode = newproductcode;
    }

    public String getPayperiod() {
        return payperiod;
    }

    public void setPayperiod(String payperiod) {
        this.payperiod = payperiod;
    }

    public String getNewpremium() {
        return newpremium;
    }

    public void setNewpremium(String newpremium) {
        this.newpremium = newpremium;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
