package com.xenil.javatusurtask.demo.service.report;

import com.xenil.javatusurtask.demo.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    SumService sumService;

    public String sumReport(int a, int b){
        return String.valueOf(sumService.sum(a,b));
    }
}
