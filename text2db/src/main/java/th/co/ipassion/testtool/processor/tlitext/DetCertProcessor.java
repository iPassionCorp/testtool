package th.co.ipassion.testtool.processor.tlitext;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.tlitext.DetCert;


public class DetCertProcessor implements ItemProcessor<DetCert, DetCert> {

    public DetCert process(DetCert item) throws Exception {
        if(item.getPolicyno().matches("(.*)\\u0000(.*)") ||
                item.getAddress1().matches("(.*)\\u0000(.*)")||
                item.getAddress2().matches("(.*)\\u0000(.*)")||
                item.getTelephoneno().matches("(.*)\\u0000(.*)")||
                item.getMariagestatus().matches("(.*)\\u0000(.*)")||
                item.getRecname1().matches("(.*)\\u0000(.*)")||
                item.getPercent1().matches("(.*)\\u0000(.*)")||
                item.getRelationshipcode1().matches("(.*)\\u0000(.*)")||
                item.getRecname2().matches("(.*)\\u0000(.*)")||
                item.getPercent2().matches("(.*)\\u0000(.*)")||
                item.getRelationshipcode2().matches("(.*)\\u0000(.*)")||
                item.getRecname3().matches("(.*)\\u0000(.*)")||
                item.getPercent3().matches("(.*)\\u0000(.*)")||
                item.getRelationshipcode3().matches("(.*)\\u0000(.*)")||
                item.getAnalist().matches("(.*)\\u0000(.*)")||
                item.getPrmiseno().matches("(.*)\\u0000(.*)")||
                item.getPrmiseno2().matches("(.*)\\u0000(.*)")||
                item.getLoantype().matches("(.*)\\u0000(.*)")||
                item.getMed().matches("(.*)\\u0000(.*)")||
                item.getReserve().matches("(.*)\\u0000(.*)")
                ){
            item.setPolicyno(item.getPolicyno().trim().replaceAll("\\u0000", ""));
            item.setAddress1(item.getAddress1().trim().replaceAll("\\u0000", ""));
            item.setAddress2(item.getAddress2().trim().replaceAll("\\u0000", ""));
            item.setTelephoneno(item.getTelephoneno().trim().replaceAll("\\u0000", ""));
            item.setMariagestatus(item.getMariagestatus().trim().replaceAll("\\u0000", ""));
            item.setRecname1(item.getRecname1().trim().replaceAll("\\u0000", ""));
            item.setPercent1(item.getPercent1().trim().replaceAll("\\u0000", ""));
            item.setRelationshipcode1(item.getRelationshipcode1().trim().replaceAll("\\u0000", ""));
            item.setRecname2(item.getRecname2().trim().replaceAll("\\u0000", ""));
            item.setPercent2(item.getPercent2().trim().replaceAll("\\u0000", ""));
            item.setRelationshipcode2(item.getRelationshipcode2().trim().replaceAll("\\u0000", ""));
            item.setRecname3(item.getRecname3().trim().replaceAll("\\u0000", ""));
            item.setPercent3(item.getPercent3().trim().replaceAll("\\u0000", ""));
            item.setRelationshipcode3(item.getRelationshipcode3().trim().replaceAll("\\u0000", ""));
            item.setAnalist(item.getAnalist().trim().replaceAll("\\u0000", ""));
            item.setPrmiseno(item.getPrmiseno().trim().replaceAll("\\u0000", ""));
            item.setPrmiseno2(item.getPrmiseno2().trim().replaceAll("\\u0000", ""));
            item.setLoantype(item.getLoantype().trim().replaceAll("\\u0000", ""));
            item.setMed(item.getMed().trim().replaceAll("\\u0000", ""));
            item.setReserve(item.getReserve().trim().replaceAll("\\u0000", ""));
            return item;
        }
        else{
            return item;
        }
    }
}


