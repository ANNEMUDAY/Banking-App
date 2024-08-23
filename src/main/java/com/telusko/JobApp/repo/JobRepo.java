package com.telusko.JobApp.repo;

//import java.util.ArrayList;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.telusko.JobApp.model.JobPost;
//
//@Repository
//public interface JobRepo extends JpaRepository<JobPost,Integer> {
//
//}

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    // arrayList to store store JobPost objects
    List<JobPost> jobs = new ArrayList<>();

    // ****************************************************************************

    // constructor->injecting objects into ArrayList defined above.
    public JobRepo() {

        // Java Developer Job Post
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
    }

    // ****************************************************************************

    // method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return jobs;
    }

    // method to save a job post object into arrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                String.valueOf(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
    }




}