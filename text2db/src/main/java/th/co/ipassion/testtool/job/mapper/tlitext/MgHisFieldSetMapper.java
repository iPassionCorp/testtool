package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mghis;
import th.co.ipassion.testtool.entity.tlitext.MghisId;

public class MgHisFieldSetMapper implements FieldSetMapper<Mghis> {
	public Mghis mapFieldSet(FieldSet fieldSet) throws BindException {
		Mghis result = new Mghis();
		MghisId id = new MghisId();
		id.setCertno(fieldSet.readString(0));
		id.setAccidentdate(fieldSet.readString(1));
		id.setReceivedate(fieldSet.readString(2));
		id.setClaimtype(fieldSet.readString(3));
		id.setSeqno(fieldSet.readString(4));
		id.setRemarkdate(fieldSet.readString(5));
		id.setRemarkno(fieldSet.readString(6));
		id.setRemark(fieldSet.readString(7));
		id.setEmployeeid(fieldSet.readString(8));
		id.setRectime(fieldSet.readString(9));
		result.setId(id);
		return result;
	}
}
