package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) { 
		
		
		
     ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(applicationContext.xml);
    	SportsCoach spCoach = ctx.getBean("cricketcoach",SportsCoach.class);
    	System.out.println("The training time is:-"+spCoach.getTrainingSchedule());
    	ctx.close();
    		   
    		  
	}

}
