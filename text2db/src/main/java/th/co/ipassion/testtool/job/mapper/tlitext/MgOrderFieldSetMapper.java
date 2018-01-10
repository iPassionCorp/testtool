package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mgorder;
import th.co.ipassion.testtool.entity.tlitext.MgorderId;


public class MgOrderFieldSetMapper implements FieldSetMapper<Mgorder> {
	public Mgorder mapFieldSet(FieldSet fs) throws BindException {
		
		Mgorder result = new Mgorder();
		MgorderId id = new MgorderId();
		
		id.setSectioncode(fs.readString(0));
		id.setOrderno(fs.readString(1));
		id.setReceivetime(fs.readString(2));
		id.setCausecode(fs.readString(3));
		id.setCausedetail(fs.readString(4));
		id.setReceiverid(fs.readString(5));
		id.setConsiderid(fs.readString(6));
		id.setAdmitdate(fs.readString(7));
		id.setAdmitflag(fs.readString(8));
		id.setBillingorderno(fs.readString(9));
		id.setInterimflag(fs.readString(10));
		id.setHospitalcode(fs.readString(11));
		id.setReceivedocdate(fs.readString(12));
		id.setCalsurdate(fs.readString(13));
		
		result.setId(id);
		return result;
	}
}
