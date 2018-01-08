package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mgclaim;
import th.co.ipassion.testtool.entity.tlitext.MgclaimId;

public class MgClaimFieldSetMapper implements FieldSetMapper<Mgclaim> {
	public Mgclaim mapFieldSet(FieldSet fieldSet) throws BindException {
		Mgclaim result = new Mgclaim();
		MgclaimId id = new MgclaimId();
		id.setCertno(fieldSet.readString(0));
		id.setAccidentdate(fieldSet.readString(1));
		id.setReceivedate(fieldSet.readString(2));
		id.setClaimtype(fieldSet.readString(3));
		id.setSectioncode(fieldSet.readString(4));
		id.setOrderno(fieldSet.readString(5));
		id.setReferenceno(fieldSet.readString(6));
		id.setLinkerno(fieldSet.readString(7));
		id.setOkdate(fieldSet.readString(8));
		id.setPolicyno(fieldSet.readString(9));
		id.setIsmigration(fieldSet.readString(10));
		result.setId(id);
		return result;
	}
}
