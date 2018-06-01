package th.co.ipassion.testtool.dto.billing;

public class CancelRefund {
	private String certno;
	private String duedate;
	private String transactiondate;
	private String partial;
	private String cancelreason2;
	public String getCertno() {
		return certno;
	}
	public void setCertno(String certno) {
		this.certno = certno;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}
	public String getPartial() {
		return partial;
	}
	public void setPartial(String partial) {
		this.partial = partial;
	}
	public String getCancelreason2() {
		return cancelreason2;
	}
	public void setCancelreason2(String cancelreason2) {
		this.cancelreason2 = cancelreason2;
	}
	
}
