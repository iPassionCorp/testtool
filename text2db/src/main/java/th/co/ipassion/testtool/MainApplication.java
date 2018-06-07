package th.co.ipassion.testtool;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-job-context.xml");
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

        for (int i = 0; i < args.length; i ++) {       
	        Job job = (Job) context.getBean(args[i]);
	        try {
	            JobExecution execution = jobLauncher.run(job, new JobParameters());
	            System.out.println("Job Exit Status : "+ execution.getStatus() + " @ " + new Date());
	      
	        } catch (JobExecutionException e) {
	            System.out.println("Job " + args[i] + " failed @ " + new Date() );
	            e.printStackTrace();
	        } finally {
	        	
	        }
        }
	}

}
