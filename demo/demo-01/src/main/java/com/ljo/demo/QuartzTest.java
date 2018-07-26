package com.ljo.demo;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/8
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
public class QuartzTest {

    public static void main(String[] arg0) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
