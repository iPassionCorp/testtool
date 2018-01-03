package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Certlinker;
import th.co.ipassion.testtool.entity.tlitext.CertlinkerId;

public class CertLinkerFieldSetMapper implements FieldSetMapper<Certlinker> {
	public Certlinker mapFieldSet(FieldSet fieldSet) throws BindException {
		Certlinker result = new Certlinker();
		CertlinkerId id = new CertlinkerId();
		id.setCertnocp(fieldSet.readString(0));
		id.setCertnohp(fieldSet.readString(1));
		id.setPolicynocp(fieldSet.readString(2));
		id.setPolicynohp(fieldSet.readString(3));
		result.setId(id);
		return result;
	}
}
