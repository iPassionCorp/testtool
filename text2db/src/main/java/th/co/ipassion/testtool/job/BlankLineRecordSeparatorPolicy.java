package th.co.ipassion.testtool.job;

import org.springframework.batch.item.file.separator.SimpleRecordSeparatorPolicy;

public class BlankLineRecordSeparatorPolicy extends SimpleRecordSeparatorPolicy {

    @Override
    public boolean isEndOfRecord(String aLine) {
        if (aLine.trim().length() ==0) {
            return false;
        }
        return super.isEndOfRecord(aLine);
    }

    @Override
    public String postProcess(String aRecord) {
        if (aRecord==null || aRecord.trim().length()==0 || "null".equals(aRecord)) {
            return null;
        }
        return super.postProcess(aRecord);
    }
}