package main.java.th.co.ipassion.testtool.dto.tlp;

public class PolicyBeneficiary implements java.io.Serializable {
    private String policyno;
    private String seqno;
    private String beneficiaryname;
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
}
