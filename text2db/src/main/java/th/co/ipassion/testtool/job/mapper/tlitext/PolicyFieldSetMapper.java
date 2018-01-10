package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Policy;
import th.co.ipassion.testtool.entity.tlitext.PolicyId;

public class PolicyFieldSetMapper implements FieldSetMapper<Policy> {
	public Policy mapFieldSet(FieldSet fieldSet) throws BindException {
		Policy result = new Policy();
		PolicyId id = new PolicyId();
		id.setPolicyno(fieldSet.readString(0));
		id.setRate(fieldSet.readString(1));
		id.setName(fieldSet.readString(2));
		id.setType(fieldSet.readString(3));		
		id.setEffectivedate(fieldSet.readString(4));
		id.setPlanname(fieldSet.readString(5));
		id.setRiderplan(fieldSet.readString(6));
		id.setTlbranch(fieldSet.readString(7));		
		result.setId(id);
		return result;
	}
}
