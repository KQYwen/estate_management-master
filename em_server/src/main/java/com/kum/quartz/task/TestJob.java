package com.kum.quartz.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @version V1.0
 * @Package com.kum.quartz.task
 * @auhter 温彬
 * @date 2023/2/25-5:21 PM
 */
public class TestJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(new Date());
    }
}
