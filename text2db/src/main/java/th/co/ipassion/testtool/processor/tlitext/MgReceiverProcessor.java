package th.co.ipassion.testtool.processor.tlitext;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.tlitext.MgReceiver;

public class MgReceiverProcessor implements ItemProcessor<MgReceiver, MgReceiver>{

    public MgReceiver process(MgReceiver item) {
        String text =item.getCertno() +" "+ item.getAccidentdate()+" "+item.getReceivedate()+" "
                +item.getSeqno()+" "+item.getPrename()+" "+ item.getFirstname()+" "+ item.getLastname()+" "+
                item.getType()+" "+item.getPayamount()+" "+item.getAddress()+" "+ item.getTumbon()+" "+
                item.getZipcode()+" "+item.getMobilephone()+" "+item.getCitizenid()+" "+item.getPaytype()+" "+
                item.getBanktype()+" "+ item.getBankcode()+" "+item.getBankbranch()+" "+item.getBankaccount()+" "+
                item.getGuardianbeneficiary()+" "+item.getIspay()+" "+item.getHaveindicia()+" "+item.getCountrycode()+" "+
                item.getClaimpaydate()+" "+ item.getBookstatus()+" "+item.getChqdate()+" "+ item.getChqno()+" "+
                item.getDocno()+" "+ item.getIsbeneficiarykilled()+" "+ item.getBirthdate();
        if (text.matches("(.*)\\u0000(.*)")){
            return null;
        }
        return item;
    }
}
