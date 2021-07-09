package com.david.mongo_demo.jobs;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduleJob {

    @Scheduled(cron = "* * * * * ?")
    @SchedulerLock(name = "scheduledTaskName", lockAtLeastFor = "2m", lockAtMostFor = "2m")
    public void scheduledTask() {
        log.info("Running task");
    }

}
