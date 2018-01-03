package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Certrider;
import th.co.ipassion.testtool.entity.tlitext.CertriderId;


public class CertRiderFieldSetMapper implements FieldSetMapper<Certrider> {
	public Certrider mapFieldSet(FieldSet fs) throws BindException {
		
		Certrider result = new Certrider();
		CertriderId id = new CertriderId();
		
		id.setPolicyno(fs.readString(0));
		id.setCertno(fs.readString(1));
		id.setRidertype(fs.readString(2));
		id.setSum(fs.readString(3));
		id.setPremium(fs.readString(4));
		id.setExtrapremium(fs.readString(5));
		id.setRiderstatus(fs.readString(6));
		id.setRiderstatusdate(fs.readString(7));
		id.setReserve(fs.readString(8));

		result.setId(id);
		return result;
	}
}
