package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mginterest;
import th.co.ipassion.testtool.entity.tlitext.MginterestId;


public class MgInterestFieldSetMapper implements FieldSetMapper<Mginterest> {
	public Mginterest mapFieldSet(FieldSet fs) throws BindException {
		
		Mginterest result = new Mginterest();
		MginterestId id = new MginterestId();
		
		id.setCertno(fs.readString(0));
		id.setAccidentdate(fs.readString(1));
		id.setReceivedate(fs.readString(2));
		id.setRidertype(fs.readString(3));
		id.setPaytype(fs.readString(4));
		id.setStartdate(fs.readString(5));
		id.setEnddate(fs.readString(6));
		id.setDay(fs.readString(7));
		id.setPayamount(fs.readString(8));
		id.setInterestamount(fs.readString(9));
		
		result.setId(id);
		return result;
	}
}
