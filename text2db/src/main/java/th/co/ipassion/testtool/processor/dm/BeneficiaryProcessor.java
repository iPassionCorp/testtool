package th.co.ipassion.testtool.processor.dm;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.dm.Beneficiary;

public class BeneficiaryProcessor  implements ItemProcessor<Beneficiary, Beneficiary> {
    public Beneficiary process(Beneficiary item) {
        String text = item.getPolicytype()+" "+item.getPolicyno()+" "+item.getSequence()+" "+item.getPrename()
                +" "+item.getFirstname()+" "+item.getLastname()+" "+item.getRelationshipcode()+" "+item.getPercentshare()
                +" "+item.getPersonflag()+" "+item.getIdno()+" "+item.getBirthdate();
        if (text.matches("(.*)\\u0000(.*)")) {
            item.setPolicytype(item.getPolicytype().trim().replaceAll("\\u0000", ""));
            item.setPolicyno(item.getPolicyno().trim().replaceAll("\\u0000", ""));
            item.setSequence(item.getSequence().trim().replaceAll("\\u0000", ""));
            item.setPrename(item.getPrename().trim().replaceAll("\\u0000", ""));
            item.setFirstname(item.getFirstname().trim().replaceAll("\\u0000", ""));
            item.setLastname(item.getLastname().trim().replaceAll("\\u0000", ""));
            item.setRelationshipcode(item.getRelationshipcode().trim().replaceAll("\\u0000", ""));
            item.setPercentshare(item.getPercentshare().trim().replaceAll("\\u0000", ""));
            item.setPersonflag(item.getPersonflag().trim().replaceAll("\\u0000", ""));
            item.setIdno(item.getIdno().trim().replaceAll("\\u0000", ""));
            item.setBirthdate(item.getBirthdate().trim().replaceAll("\\u0000", ""));
            return item;
        }else{
            return item;
        }
    }
}
