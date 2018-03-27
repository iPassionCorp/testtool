package th.co.ipassion.testtool.processor.dm;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.tlitext.Remark;

public class RemarkProcessor implements ItemProcessor<Remark, Remark> {
    public Remark process(Remark item) {
        String text =item.getPolicyno() +" "+ item.getDepartment()+" "+item.getSequence()+" "
                +item.getMessage();
        if (text.matches("(.*)\\u0000(.*)")){
            item.setMessage(item.getMessage().trim().replaceAll("\\u0000",""));
            return item;
        }
        else{
            return  item;
        }
    }
}
