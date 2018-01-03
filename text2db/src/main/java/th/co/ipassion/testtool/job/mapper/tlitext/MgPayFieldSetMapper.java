package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mgpay;
import th.co.ipassion.testtool.entity.tlitext.MgpayId;

public class MgPayFieldSetMapper implements FieldSetMapper<Mgpay> {
	public Mgpay mapFieldSet(FieldSet fs) throws BindException {
		
		Mgpay result = new Mgpay();
		MgpayId id = new MgpayId();
		
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
		id.setClaimtype(fs.readString(11));
		id.setPaytype(fs.readString(12));
		id.setProofinsuredage(fs.readString(13));
		id.setDisabilitytype(fs.readString(14));
		id.setDisnumber(fs.readString(15));
		id.setPayrate(fs.readString(16));
		id.setPayamount(fs.readString(17));
		id.setAccdamount(fs.readString(18));
		id.setSurrenderamount(fs.readString(19));
		id.setReturnamount(fs.readString(20));
		id.setDeductamount(fs.readString(21));
		id.setClaimokdate(fs.readString(22));
		id.setClaimpaydate(fs.readString(23));
		id.setAllowtype(fs.readString(24));
		result.setId(id);
		return result;
	}
}
