package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Mgreceiver;
import th.co.ipassion.testtool.entity.tlitext.MgreceiverId;


public class MgReceiverFieldSetMapper implements FieldSetMapper<Mgreceiver> {
	public Mgreceiver mapFieldSet(FieldSet fs) throws BindException {
		
		Mgreceiver result = new Mgreceiver();
		MgreceiverId id = new MgreceiverId();
		
		id.setCertno(fs.readString(0));
		id.setAccidentdate(fs.readString(1));
		id.setReceivedate(fs.readString(2));
		
		//id.setSeqno(fs.readString());
		
		result.setId(id);
		return result;
	}
}
