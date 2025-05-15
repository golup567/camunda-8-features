package com.c8.jw.service.impl;

import org.springframework.stereotype.Service;

import ccom.c8.jw.service.IPrintService;

@Service

public class PrintService implements IPrintService {

	@Override
    public void print() {
        System.out.println("Print data...");
    }
}