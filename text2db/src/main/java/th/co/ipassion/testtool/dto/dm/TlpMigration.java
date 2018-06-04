package th.co.ipassion.testtool.dto.dm;

public class TlpMigration {
    private String customerCode;
    private String tlpPolicyNo;
    private String tlpCertNo;
    private String tlpPlanNo;
    private String tlpProductName;
    private String tliPolicyNo;
    private String migratePlanCode;
    private String migratePlanNo;
    private String tmoPlanCode;
    private String tmoPlanNo;
    private String family;

    public String getTliPolicyNo() {
		return tliPolicyNo;
	}

	public void setTliPolicyNo(String tliPolicyNo) {
		this.tliPolicyNo = tliPolicyNo;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTlpPolicyNo() {
        return tlpPolicyNo;
    }

    public void setTlpPolicyNo(String tlpPolicyNo) {
        this.tlpPolicyNo = tlpPolicyNo;
    }

    public String getTlpCertNo() {
        return tlpCertNo;
    }

    public void setTlpCertNo(String tlpCertNo) {
        this.tlpCertNo = tlpCertNo;
    }

    public String getTlpPlanNo() {
        return tlpPlanNo;
    }

    public void setTlpPlanNo(String tlpPlanNo) {
        this.tlpPlanNo = tlpPlanNo;
    }

    public String getTlpProductName() {
        return tlpProductName;
    }

    public void setTlpProductName(String tlpProductName) {
        this.tlpProductName = tlpProductName;
    }

    public String getMigratePlanCode() {
        return migratePlanCode;
    }

    public void setMigratePlanCode(String migratePlanCode) {
        this.migratePlanCode = migratePlanCode;
    }

    public String getMigratePlanNo() {
        return migratePlanNo;
    }

    public void setMigratePlanNo(String migratePlanNo) {
        this.migratePlanNo = migratePlanNo;
    }

    public String getTmoPlanCode() {
        return tmoPlanCode;
    }

    public void setTmoPlanCode(String tmoPlanCode) {
        this.tmoPlanCode = tmoPlanCode;
    }

    public String getTmoPlanNo() {
        return tmoPlanNo;
    }

    public void setTmoPlanNo(String tmoPlanNo) {
        this.tmoPlanNo = tmoPlanNo;
    }
}
