package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Detcert;
import th.co.ipassion.testtool.entity.tlitext.DetcertId;


public class DetCertFieldSetMapper implements FieldSetMapper<Detcert> {
	public Detcert mapFieldSet(FieldSet fs) throws BindException {
		
		Detcert result = new Detcert();
		DetcertId id = new DetcertId();
		
		id.setPolicyno(fs.readString(0));
		id.setCertno(fs.readString(1));
		id.setCode(fs.readString(2));
		id.setAddress1(fs.readString(3));
		id.setAddress2(fs.readString(4));
		id.setTelephoneno(fs.readString(5));
		id.setMariagestatus(fs.readString(6));
		id.setRecname1(fs.readString(7));
		id.setPercent1(fs.readString(8));
		id.setRelationshipcode1(fs.readString(9));
		id.setRecname2(fs.readString(10));
		id.setPercent2(fs.readString(11));
		id.setRelationshipcode2(fs.readString(12));
		id.setRecname3(fs.readString(13));
		id.setPercent3(fs.readString(14));
		id.setRelationshipcode3(fs.readString(15));
		id.setAnalist(fs.readString(16));
		id.setPrmiseno(fs.readString(17));
		id.setPrmiseno2(fs.readString(18));
		id.setLoantype(fs.readString(19));
		id.setMed(fs.readString(20));
		id.setReserve(fs.readString(21));
		
		result.setId(id);
		return result;
	}
}
