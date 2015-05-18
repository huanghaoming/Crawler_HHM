package org.hhm.crawler.pojo;

public class Config {
	private static int taskID = 0;
	private static int isLucene = 0;
	private static int monitorTime = 3000;
	private static int threads = 1;
	private static int threadGatherMax = 20;
	private static int isApplyTemplate = 0;

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int Parameter) {
		taskID = Parameter;
	}

	public int getIsLucene() {
		return isLucene;
	}

	public void setIsLucene(int Parameter) {
		isLucene = Parameter;
	}

	public int getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(int Parameter) {
		monitorTime = Parameter;
	}

	public int getThreads() {
		return threads;
	}

	public static void setThreads(int Parameter) {
		threads = Parameter;
	}

	public int getThreadGatherMax() {
		return threadGatherMax;
	}

	public void setThreadGatherMax(int Parameter) {
		threadGatherMax = Parameter;
	}

	public int getIsApplyTemplate() {
		return isApplyTemplate;
	}

	public void setIsApplyTemplate(int Parameter) {
		isApplyTemplate = Parameter;
	}

}
