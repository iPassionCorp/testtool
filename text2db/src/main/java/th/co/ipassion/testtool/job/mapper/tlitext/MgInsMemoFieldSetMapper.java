package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mginsmemo;
import th.co.ipassion.testtool.entity.tlitext.MginsmemoId;

public class MgInsMemoFieldSetMapper implements FieldSetMapper<Mginsmemo> {
	public Mginsmemo mapFieldSet(FieldSet fs) throws BindException {
		
		Mginsmemo result = new Mginsmemo();
		MginsmemoId id = new MginsmemoId();
		
		id.setCertno(fs.readString(0));
		id.setAccidentdate(fs.readString(1));
		id.setReceivedate(fs.readString(2));
		id.setMemocode(fs.readString(3));
		id.setDetail1(fs.readString(4));
		id.setDetail2(fs.readString(5));
		id.setSavedate(fs.readString(6));
		
		result.setId(id);
		return result;
	}
}
