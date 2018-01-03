package th.co.ipassion.testtool;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        //Job job = (Job) context.getBean("importPolicyJob");
        Job job = (Job) context.getBean("importPersonJob");
        //Job job = (Job) context.getBean("importCertlinkerJob");
        //Job job = (Job) context.getBean("importCertmappingJob");
        //Job job = (Job) context.getBean("importMgClaimJob");
        //Job job = (Job) context.getBean("importMgHisJob");
      
        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());
      
        } catch (JobExecutionException e) {
            System.out.println("Job ExamResult failed");
            e.printStackTrace();
        } finally {
        	
        }
	}

}
