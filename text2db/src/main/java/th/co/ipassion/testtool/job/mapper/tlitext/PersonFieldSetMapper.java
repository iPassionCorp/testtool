package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Person;
import th.co.ipassion.testtool.entity.tlitext.PersonId;

public class PersonFieldSetMapper implements FieldSetMapper<Person> {
	public Person mapFieldSet(FieldSet fieldSet) throws BindException {
		Person result = new Person();
		PersonId id = new PersonId();
		id.setPersonid(fieldSet.readString(0));
		id.setReferenceid(fieldSet.readString(1));
		id.setReferencetype(fieldSet.readString(2));
		id.setBirthdate(fieldSet.readString(3));		
		id.setSex(fieldSet.readString(4));
		id.setCustomerid(fieldSet.readString(5));
		id.setBluecard(fieldSet.readString(6));
		id.setReserve(fieldSet.readString(7));		
		result.setId(id);
		return result;
	}
}
