package com.c8.jw.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ccom.c8.jw.service.IPrintService;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component

public class PrintWorker {

	@Autowired
    private  IPrintService printService;

    @JobWorker(type = "print")
    public void processPayment(final JobClient client, final ActivatedJob job) {
    	printService.print();
        client.newCompleteCommand(job.getKey()).send().join();
        
    }
}
