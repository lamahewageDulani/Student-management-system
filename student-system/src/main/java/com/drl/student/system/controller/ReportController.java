package com.drl.student.system.controller;

import com.drl.student.system.model.Report;
import com.drl.student.system.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
@CrossOrigin("http://localhost:3000/")
public class ReportController {
    @Autowired
    private ReportRepository reportRepository;

    @PostMapping("/add_rep")
    Report newReport(@RequestBody Report newReport){
        return reportRepository.save(newReport);
    }

    @GetMapping("/get_rep")
    List<Report> getAllReports(){
        return reportRepository.findAll();
    }

}
