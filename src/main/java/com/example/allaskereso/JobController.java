package com.example.allaskereso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.example.allaskereso.UserRepository;

@RestController

public class JobController {
    @Autowired
    JobService jobService;
    @Autowired
    UserRepository userRepository;
    @PostMapping("/job")
    private List<Job> getAllJob(){
        return jobService.getAllJob();

    }
    @GetMapping("/job/{id}")
    private Job getJob(@PathVariable("id")int id){
        return jobService.getJobById(id);
    }
    @DeleteMapping("/job/{id}")
    private void deleteJob(@PathVariable("id") int id){
        jobService.delete(id);
    }
    @PostMapping("/job2")
    private int saveJObtest(@RequestBody Job job){
        jobService.saveOrUpdate(job);
        return job.getId();
    }
    public List<user> getallUser(){
        List<user> users= new ArrayList<user>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    @RequestMapping(method = RequestMethod.POST,value="/positions")
    private String  saveJOb(@RequestBody positions pos){

        Job job = new Job(pos.name,pos.location);
        jobService.saveOrUpdate(job);
        return "http://localhost:8080/job/"+String.valueOf(job.getId());
    }
    @RequestMapping( value="/search")
    public ArrayList<String> getJob(@RequestBody search search){
        Boolean error = true;
        ArrayList<String> result = new ArrayList<String>();

        List<Job> listj=   getAllJob();

        for(Job Curetnjob:listj){
            if(Curetnjob.getName().toLowerCase().contains(search.getKeyword().toLowerCase())&&
                Curetnjob.getLocation().toLowerCase().equals(search.getLocation().toLowerCase())){

                result.add("http://localhost:8080/job/"+String.valueOf(Curetnjob.getId()));
                error = false;
            }
        }
        if(error.equals(true)){

            result.add("Nincs találat");
        }
        return result;
    }

}
