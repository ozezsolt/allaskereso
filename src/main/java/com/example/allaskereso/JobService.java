package com.example.allaskereso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;
    public List<Job> getAllJob(){
        List<Job> jobs = new ArrayList<Job>();
        jobRepository.findAll().forEach(job -> jobs.add(job));
        return jobs;
    }
    public Job getJobById(int id){
        return  jobRepository.findById(id).get();
    }
    public void saveOrUpdate(Job job){
        jobRepository.save(job);
    }
    public void delete(int id){
        jobRepository.deleteById(id);
    }
}
