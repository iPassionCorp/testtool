package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Compensateid;
import th.co.ipassion.testtool.entity.tlitext.CompensateidId;


public class CompensateidFieldSetMapper implements FieldSetMapper<Compensateid> {
	public Compensateid mapFieldSet(FieldSet fieldSet) throws BindException {
		Compensateid result = new Compensateid();
		CompensateidId id = new CompensateidId();
		id.setCompensateid(fieldSet.readString(0));
		id.setReferenceid(fieldSet.readString(1));
		result.setId(id);
		return result;
	}
}
