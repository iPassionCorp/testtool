package th.co.ipassion.testtool.processor;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.tlitext.MgReceiver;

public class MgReceiverProcessor implements ItemProcessor<MgReceiver, MgReceiver>{

    public MgReceiver process(MgReceiver item) throws Exception {
        if (
        item.getCertno().matches("(.*)\\u0000(.*)") ||
        item.getAccidentdate().matches("(.*)\\u0000(.*)") ||
        item.getReceivedate().matches("(.*)\\u0000(.*)") ||
        item.getSeqno().matches("(.*)\\u0000(.*)") ||
        item.getPrename().matches("(.*)\\u0000(.*)") ||
        item.getFirstname().matches("(.*)\\u0000(.*)") ||
        item.getLastname().matches("(.*)\\u0000(.*)") ||
        item.getType().matches("(.*)\\u0000(.*)") ||
        item.getPayamount().matches("(.*)\\u0000(.*)") ||
        item.getAddress().matches("(.*)\\u0000(.*)") ||
        item.getTumbon().matches("(.*)\\u0000(.*)") ||
        item.getZipcode().matches("(.*)\\u0000(.*)") ||
        item.getMobilephone().matches("(.*)\\u0000(.*)") ||
        item.getCitizenid().matches("(.*)\\u0000(.*)") ||
        item.getPaytype().matches("(.*)\\u0000(.*)") ||
        item.getBanktype().matches("(.*)\\u0000(.*)") ||
        item.getBankcode().matches("(.*)\\u0000(.*)") ||
        item.getBankbranch().matches("(.*)\\u0000(.*)") ||
        item.getBankaccount().matches("(.*)\\u0000(.*)") ||
        item.getGuardianbeneficiary().matches("(.*)\\u0000(.*)") ||
        item.getIspay().matches("(.*)\\u0000(.*)") ||
        item.getHaveindicia().matches("(.*)\\u0000(.*)") ||
        item.getCountrycode().matches("(.*)\\u0000(.*)") ||
        item.getClaimpaydate().matches("(.*)\\u0000(.*)") ||
        item.getBookstatus().matches("(.*)\\u0000(.*)") ||
        item.getChqdate().matches("(.*)\\u0000(.*)") ||
        item.getChqno().matches("(.*)\\u0000(.*)") ||
        item.getDocno().matches("(.*)\\u0000(.*)") ||
        item.getIsbeneficiarykilled().matches("(.*)\\u0000(.*)") ||
        item.getBirthdate().matches("(.*)\\u0000(.*)")
        ){
            return null;
        }
        return item;
    }
}
