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
        String temp = aRecord.substring(0,8);
        if (temp.matches("^[0-9]{8}$")){
            return super.postProcess(aRecord);
        }else{
            aRecord = aRecord.replaceAll("/(\r?\n|\r)/gm","");
            System.out.println(aRecord);
            return null;
        }
    }

}
