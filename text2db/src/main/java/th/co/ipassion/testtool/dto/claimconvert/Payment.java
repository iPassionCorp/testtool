package th.co.ipassion.testtool.dto.claimconvert;

public class Payment  implements java.io.Serializable {


     private String policyno;
     private String productcode;
     private String customercode;
     private String paymentdate;
     private String receiptno;
     private String payperiod;
     private String premiumamt;
     private String collecteddate;
     private String mode;
	public String getPolicyno() {
		return policyno;
	}
	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getCustomercode() {
		return customercode;
	}
	public void setCustomercode(String customercode) {
		this.customercode = customercode;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public String getReceiptno() {
		return receiptno;
	}
	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}
	public String getPayperiod() {
		return payperiod;
	}
	public void setPayperiod(String payperiod) {
		this.payperiod = payperiod;
	}
	public String getPremiumamt() {
		return premiumamt;
	}
	public void setPremiumamt(String premiumamt) {
		this.premiumamt = premiumamt;
	}
	public String getCollecteddate() {
		return collecteddate;
	}
	public void setCollecteddate(String collecteddate) {
		this.collecteddate = collecteddate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
     
}
