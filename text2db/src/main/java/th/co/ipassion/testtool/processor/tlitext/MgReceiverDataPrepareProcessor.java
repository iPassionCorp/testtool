package th.co.ipassion.testtool.processor.tlitext;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.tlitext.MgReceiver;


public class MgReceiverDataPrepareProcessor implements ItemProcessor<MgReceiver, MgReceiver> {
    public MgReceiver process(MgReceiver item) {
        System.out.println(item.getCertno());
        return item;
    }
}
