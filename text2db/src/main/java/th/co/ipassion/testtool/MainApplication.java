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
		
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-job-context.xml");
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        //Job job = (Job) context.getBean("importPolicyJob");
        Job job = (Job) context.getBean(args[0]);
        //Job job = (Job) context.getBean("importCertLinkerJob");
        //Job job = (Job) context.getBean("importCertMappingJob");
        //Job job = (Job) context.getBean("importMgClaimJob");
        //Job job = (Job) context.getBean("importMgHisJob");

        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());
      
        } catch (JobExecutionException e) {
            System.out.println("Job " + args[0] + " failed");
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
	}

}
