package th.co.ipassion.testtool.job;

import org.springframework.batch.item.file.separator.SimpleRecordSeparatorPolicy;

public class CutLinePolicy extends SimpleRecordSeparatorPolicy {

    @Override
    public boolean isEndOfRecord(String aLine) {
        if (aLine.trim().length() ==0) {
            return false;
        }
        return super.isEndOfRecord(aLine);
    }

    @Override
    public String postProcess(String aRecord) {
        String line = aRecord;
        if (line.matches("00(.*)")){
            System.out.println(line.trim().length() + " " + line);
            return super.postProcess(line);
        }
        return null;
    }

}
