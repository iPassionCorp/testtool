package th.co.ipassion.testtool.dto.billing;

public class MemberMaster {
    private String policyno;
    private String certificateno;
    private String cardno;
    private String cardexpired;
    private String effectivedate;
    private String firstduedate;

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCardexpired() {
        return cardexpired;
    }

    public void setCardexpired(String cardexpired) {
        this.cardexpired = cardexpired;
    }

    public String getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate;
    }

    public String getFirstduedate() {
        return firstduedate;
    }

    public void setFirstduedate(String firstduedate) {
        this.firstduedate = firstduedate;
    }
}
