package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mgpay;
import th.co.ipassion.testtool.entity.tlitext.MgpayId;
import th.co.ipassion.testtool.entity.tlitext.Mgpayrider;
import th.co.ipassion.testtool.entity.tlitext.MgpayriderId;

public class MgPayRiderFieldSetMapper implements FieldSetMapper<Mgpayrider> {
	public Mgpayrider mapFieldSet(FieldSet fs) throws BindException {
		
		Mgpayrider result = new Mgpayrider();
		MgpayriderId id = new MgpayriderId();
		
		id.setCertno(fs.readString(0));
		id.setReceivedate(fs.readString(1));
		id.setAccidentdate(fs.readString(2));
		id.setSectioncode(fs.readString(3));
		id.setOrderno(fs.readString(4));
		id.setPolicystatus(fs.readString(5));
		id.setPolicystatusdate(fs.readString(6));
		id.setPolicystatus2(fs.readString(7));
		id.setPolicystatusdate2(fs.readString(8));
		id.setBranchcode(fs.readString(9));
		id.setServicebranch(fs.readString(10));
		id.setAmestartdate(fs.readString(11));
		id.setAmeday(fs.readString(12));
		id.setAmeexpense(fs.readString(13));
		id.setAmepayment(fs.readString(14));
		id.setTdday(fs.readString(15));
		id.setTdstartdate(fs.readString(16));
		id.setTdpayment(fs.readString(17));
		id.setReturnamount(fs.readString(18));
		id.setDeductamount(fs.readString(19));
		id.setVoiddate(fs.readString(20));
		id.setClaimokdate(fs.readString(21));
		id.setClaimpaydate(fs.readString(22));
		
		result.setId(id);
		return result;
	}
}
