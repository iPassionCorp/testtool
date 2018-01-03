package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Name;
import th.co.ipassion.testtool.entity.tlitext.NameId;


public class NameFieldSetMapper implements FieldSetMapper<Name> {
	public Name mapFieldSet(FieldSet fs) throws BindException {
		
		Name result = new Name();
		NameId id = new NameId();
		
		id.setNameid(fs.readString(0));
		id.setPersonid(fs.readString(1));
		id.setPrename(fs.readString(2));
		id.setFirstname(fs.readString(3));
		id.setLastname(fs.readString(4));
		id.setStartdate(fs.readString(5));
		
		result.setId(id);
		return result;
	}
}
