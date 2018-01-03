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
		
		id.setSeqno(fs.readString(3));
		id.setPrename(fs.readString(4));
		id.setFirstname(fs.readString(5));
		id.setLastname(fs.readString(6));
		id.setType(fs.readString(7));
		id.setPayamount(fs.readString(8));
		id.setAddress(fs.readString(9));
		id.setTumbon(fs.readString(10));
		id.setZipcode(fs.readString(11));
		id.setMobilephone(fs.readString(12));
		id.setCitizenid(fs.readString(13));
		id.setPaytype(fs.readString(14));
		id.setBanktype(fs.readString(15));
		id.setBankcode(fs.readString(16));
		id.setBankbranch(fs.readString(17));
		id.setBankaccount(fs.readString(18));
		id.setGuardianbeneficiary(fs.readString(19));
		id.setIspay(fs.readString(20));
		id.setHaveindicia(fs.readString(21));
		id.setCountrycode(fs.readString(22));
		id.setClaimpaydate(fs.readString(23));
		id.setBookstatus(fs.readString(24));
		id.setChqdate(fs.readString(25));
		id.setCertno(fs.readString(26));
		id.setDocno(fs.readString(27));
		id.setIsbeneficiarykilled(fs.readString(28));
		id.setBirthdate(fs.readString(29));
		
		result.setId(id);
		return result;
	}
}
