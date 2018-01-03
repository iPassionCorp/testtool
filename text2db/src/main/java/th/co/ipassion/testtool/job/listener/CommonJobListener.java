package th.co.ipassion.testtool.job.listener;

import java.util.List;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
public class CommonJobListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(CommonJobListener.class);

    private DateTime startTime, stopTime;
    
    @Override
    public void beforeJob(JobExecution jobExecution) {
        startTime = new DateTime();
        log.info("ExamResult Job starts at :"+startTime);
    }
	
	@Override
	public void afterJob(JobExecution jobExecution) {
        stopTime = new DateTime();
        log.info("ExamResult Job stops at :"+stopTime);
        log.info("Total time take in millis :"+getTimeInMillis(startTime , stopTime));
 
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
        		log.info("ExamResult job completed successfully");
            //Here you can perform some other business logic like cleanup
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
        		log.info("ExamResult job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                log.error("exception :" +th.getLocalizedMessage());
            }
        }
	}

	private String getTimeInMillis(DateTime startTime2, DateTime stopTime2) {
		long executionTime = stopTime2.getMillis() - startTime2.getMillis();
		return new DateTime (executionTime).toString();
	}
}
