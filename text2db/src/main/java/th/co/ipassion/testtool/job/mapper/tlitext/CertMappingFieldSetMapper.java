package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Certmapping;
import th.co.ipassion.testtool.entity.tlitext.CertmappingId;

public class CertMappingFieldSetMapper implements FieldSetMapper<Certmapping> {
	public Certmapping mapFieldSet(FieldSet fieldSet) throws BindException {
		Certmapping result = new Certmapping();
		CertmappingId id = new CertmappingId();
		id.setPolicyno(fieldSet.readString(0));
		id.setCertno(fieldSet.readString(1));
		id.setRpolicyno(fieldSet.readString(2));
		id.setRpolicyn(fieldSet.readString(3));
		result.setId(id);
		return result;
	}
}
