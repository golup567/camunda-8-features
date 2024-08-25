package com.inn.exporter.api;

import io.camunda.zeebe.exporter.api.Exporter;
import io.camunda.zeebe.exporter.api.context.Controller;

public class JsonExporter implements Exporter {

	Controller controller;
  
    public void open(Controller controller) {    
    	this.controller=controller;
    }
    
    public void close() {
    }
	@Override
	public void export(io.camunda.zeebe.protocol.record.Record<?> record) {
		System.out.println(record.toJson());
        this.controller.updateLastExportedRecordPosition(record.getPosition());

	}

}
