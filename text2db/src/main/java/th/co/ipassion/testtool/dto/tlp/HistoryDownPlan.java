package th.co.ipassion.testtool.dto.tlp;

public class HistoryDownPlan {
    private String certNo;
    private String oldProductCode;
    private String newProductCode;
    private String payPeriod;
    private String newPremium;
    private String createDate;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getOldProductCode() {
        return oldProductCode;
    }

    public void setOldProductCode(String oldProductCode) {
        this.oldProductCode = oldProductCode;
    }

    public String getNewProductCode() {
        return newProductCode;
    }

    public void setNewProductCode(String newProductCode) {
        this.newProductCode = newProductCode;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getNewPremium() {
        return newPremium;
    }

    public void setNewPremium(String newPremium) {
        this.newPremium = newPremium;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
