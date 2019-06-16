import java.util.*;
public class JobSeeking {

	public static void main(String[] args) {
		ArrayList<Job> jobs = new ArrayList<Job>();
		Job job1 = new Job("Stake Holder");
		Job job2 = new Job("CEO", "Amazon", 81000);
		Job job3 = new Job();
		Job job4 = new Job("SDET", "Google", 150000);
//		add all jobs on one shot
//		jobs.addAll(Arrays.asList(job1, job2, job3, job4));
// 		goal is to create a collection of jobs
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
		jobs.add(job4);
		for (Job j : jobs) {
			System.out.println(j);
		}
		job1.setCompany("Tesla");
		job1.setAnnualSalary(120000);
		System.out.println("***********");
		System.out.println(job1);

	}
}