package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Customer;
import th.co.ipassion.testtool.entity.tlitext.CustomerId;

public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {
	public Customer mapFieldSet(FieldSet fieldSet) throws BindException {
		Customer result = new Customer();
		CustomerId id = new CustomerId();
		id.setCustomerid(fieldSet.readString(0));
		id.setReferenceid(fieldSet.readString(1));
		id.setReferencetype(fieldSet.readString(2));
		id.setBirthdate(fieldSet.readString(3));
		id.setSex(fieldSet.readString(4));
		id.setContactnameid(fieldSet.readString(5));
		id.setContactaddressid(fieldSet.readString(6));	
		result.setId(id);
		return result;
	}
}
