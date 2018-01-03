package th.co.ipassion.testtool.job.mapper.tlitext;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import th.co.ipassion.testtool.entity.tlitext.Cert;
import th.co.ipassion.testtool.entity.tlitext.CertId;


public class CertFieldSetMapper implements FieldSetMapper<Cert> {
	public Cert mapFieldSet(FieldSet fs) throws BindException {
		
		Cert result = new Cert();
		CertId id = new CertId();
		
		id.setPolicyno(fs.readString(0));
		id.setCertno(fs.readString(1));
		id.setAppno(fs.readString(2));
		id.setReqdate(fs.readString(3));
		id.setNameid(fs.readString(4));
		id.setAge(fs.readString(5));
		id.setSmi(fs.readString(6));
		id.setLifesum(fs.readString(7));
		id.setAccidentsum(fs.readString(8));
		id.setPeriod(fs.readString(9));
		id.setLoanTerm(fs.readString(10));
		id.setLifepremium(fs.readString(11));
		id.setExtrapremium(fs.readString(12));
		id.setTpdpremium(fs.readString(13));
		id.setExtratpdpremium(fs.readString(14));
		id.setAddpremium(fs.readString(15));
		id.setEm(fs.readString(16));
		id.setTpd(fs.readString(17));
		id.setEffectivedate(fs.readString(18));
		id.setMaturedate(fs.readString(19));
		id.setPremiumdate(fs.readString(20));
		id.setCertyyyymm(fs.readString(21));
		id.setStatcer(fs.readString(22));
		id.setStatcer2(fs.readString(23));
		id.setStatdate2(fs.readString(24));
		id.setInformdate1(fs.readString(25));
		id.setPaydate1(fs.readString(26));
		id.setAmount1(fs.readString(27));
		id.setInformdate2(fs.readString(28));
		id.setPaydate2(fs.readString(29));
		id.setAmount2(fs.readString(30));
		id.setDeaddate(fs.readString(31));
		id.setEndownmentyear(fs.readString(32));
		id.setDeadcause(fs.readString(33));
		id.setReceiptflag(fs.readString(34));
		id.setReferenceno(fs.readString(35));
		id.setReserve(fs.readString(36));

		result.setId(id);
		return result;
	}
}
