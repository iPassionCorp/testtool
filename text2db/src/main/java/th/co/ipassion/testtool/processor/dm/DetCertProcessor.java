package th.co.ipassion.testtool.processor.dm;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.dm.DetCert;

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
            return null;
        }
        System.out.println("Done!!! "+item.getPolicyno());
        return item;
    }
}
