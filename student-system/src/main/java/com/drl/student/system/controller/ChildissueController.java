package com.drl.student.system.controller;

import com.drl.student.system.model.Childissue;
import com.drl.student.system.repository.ChildissueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/childissue")
@CrossOrigin("http://localhost:3000/")
public class ChildissueController {

    @Autowired
    private ChildissueRepository childissueRepository;

    @PostMapping("/add_iss")
    Childissue newChildissue(@RequestBody Childissue newChildissue){
        return childissueRepository.save(newChildissue);
    }

    @GetMapping("/get_iss")
    List<Childissue> getAllReports(){
        return childissueRepository.findAll();
    }

    @GetMapping("/get_iss/{childIssueId}")
    Childissue getAllReports(@PathVariable int childIssueId){
        return childissueRepository.findById(childIssueId).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteReports(@PathVariable("id") String id){
        return "Resource with ID" + id + "deleted successfully";
    }
}
