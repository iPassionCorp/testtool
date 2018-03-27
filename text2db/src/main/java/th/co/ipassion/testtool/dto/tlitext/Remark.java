package th.co.ipassion.testtool.dto.tlitext;

public class Remark {
    private String policyno;
    private String department;
    private String sequence;
    private String message;

    public String getPolicyno() {
        return policyno;
    }

    public String getDepartment() {
        return department;
    }

    public String getSequence() {
        return sequence;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
