package com.vs.taskconfig;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	// Created One simpleDateFormat Class
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	@Scheduled(fixedRate=1000)
	public void performTask() {
		System.out.println("Regular task performed at "+dateFormat.format(new Date()));
	}
	// This method executes after 1 min and then stsrt 
	@Scheduled(initialDelay=1000, fixedRate=10000)
	public void performDelayTask() {
		System.out.println("Delayed Regular task performed at"+dateFormat.format(new Date()));
	}
	//This method execute after Every 5 seconds
	@Scheduled(cron="*/2 * * * * *")
	public void performTaskUsingCron() {
		System.out.println("Regular TASK USING CRON AT "+dateFormat.format(new Date()));
	}
	

}
