package ch08.ex02.case04;

import java.util.Arrays;

public enum Job {
		EXIT , LIST , ADD , FIX , DEL;
	
		public  static Job toJob(int ordinal) {
			return values()[ordinal];
		}
		
		public static Job toJob2(int ordinal) {
			/*
			Stream<Job> stream = Arrays.stream(values());
			stream = stream.filter(job -> job.ordinal() == ordinal);
			Optional<Job> job = stream.findFirst();
			return job.orElse(null);
			*/
			//chaining
			return Arrays.stream(values())
					.filter(job -> job.ordinal()==ordinal)
					.findFirst()
					.orElse(null);
		}
}
