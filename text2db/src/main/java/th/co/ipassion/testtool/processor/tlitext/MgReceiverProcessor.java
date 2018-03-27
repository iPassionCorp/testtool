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
        if (text.matches("(.*)\\u0000(.*)")) {
            item.setCertno(item.getCertno().trim().replaceAll("\\u0000", ""));
            item.setAccidentdate(item.getAccidentdate().trim().replaceAll("\\u0000", ""));
            item.setReceivedate(item.getReceivedate().trim().replaceAll("\\u0000", ""));
            item.setSeqno(item.getSeqno().trim().replaceAll("\\u0000", ""));
            item.setPrename(item.getPrename().trim().replaceAll("\\u0000", ""));
            item.setFirstname(item.getFirstname().trim().replaceAll("\\u0000", ""));
            item.setLastname(item.getLastname().trim().replaceAll("\\u0000", ""));
            item.setType(item.getType().trim().replaceAll("\\u0000", ""));
            item.setPayamount(item.getPayamount().trim().replaceAll("\\u0000", ""));
            item.setAddress(item.getAddress().trim().replaceAll("\\u0000", ""));
            item.setTumbon(item.getTumbon().trim().replaceAll("\\u0000", ""));
            item.setZipcode(item.getZipcode().trim().replaceAll("\\u0000", ""));
            item.setMobilephone(item.getMobilephone().trim().replaceAll("\\u0000", ""));
            item.setCitizenid(item.getCitizenid().trim().replaceAll("\\u0000", ""));
            item.setPaytype(item.getPaytype().trim().replaceAll("\\u0000", ""));
            item.setBanktype(item.getBanktype().trim().replaceAll("\\u0000", ""));
            item.setBankcode(item.getBankcode().trim().replaceAll("\\u0000", ""));
            item.setBankbranch(item.getBankbranch().trim().replaceAll("\\u0000", ""));
            item.setBankaccount(item.getBankaccount().trim().replaceAll("\\u0000", ""));
            item.setGuardianbeneficiary(item.getGuardianbeneficiary().trim().replaceAll("\\u0000", ""));
            item.setIspay(item.getIspay().trim().replaceAll("\\u0000", ""));
            item.setHaveindicia(item.getHaveindicia().trim().replaceAll("\\u0000", ""));
            item.setCountrycode(item.getCountrycode().trim().replaceAll("\\u0000", ""));
            item.setClaimpaydate(item.getClaimpaydate().trim().replaceAll("\\u0000", ""));
            item.setBookstatus(item.getBookstatus().trim().replaceAll("\\u0000", ""));
            item.setChqdate(item.getChqdate().trim().replaceAll("\\u0000", ""));
            item.setChqno(item.getChqno().trim().replaceAll("\\u0000", ""));
            item.setDocno(item.getDocno().trim().replaceAll("\\u0000", ""));
            item.setIsbeneficiarykilled(item.getIsbeneficiarykilled().trim().replaceAll("\\u0000", ""));
            item.setBirthdate(item.getBirthdate().trim().replaceAll("\\u0000", ""));
            return item;
        }else {
            return item;
        }
    }
}
