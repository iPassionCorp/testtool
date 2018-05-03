package th.co.ipassion.testtool.dto.tlp;

public class PolicyBeneficiary implements java.io.Serializable {
    private String policyno;
    private String seqno;
    private String beneficiaryprename;
    private String beneficiaryname;
    private String beneficiarylastname;
    private String relationship;
    private String percentage;
    private String age;

    public String getPolicyno() {
        return policyno;
    }

    public String getSeqno() {
        return seqno;
    }

    public String getBeneficiaryname() {
        return beneficiaryname;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getAge() {
        return age;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public void setBeneficiaryname(String beneficiaryname) {
        this.beneficiaryname = beneficiaryname;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBeneficiaryprename() {
        return beneficiaryprename;
    }

    public void setBeneficiaryprename(String beneficiaryprename) {
        this.beneficiaryprename = beneficiaryprename;
    }

    public String getBeneficiarylastname() {
        return beneficiarylastname;
    }

    public void setBeneficiarylastname(String beneficiarylastname) {
        this.beneficiarylastname = beneficiarylastname;
    }
}
