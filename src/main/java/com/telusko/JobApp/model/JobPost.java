package com.telusko.JobApp.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
//@AllArgsConstructor
public class JobPost {

    private int postId;

    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public JobPost(int id, String title, String description, int reqexperience, String... skills) {
        this.postId = id;
        this.postProfile = title;
        this.postDesc= description;
        this.reqExperience= reqexperience;
        this.postTechStack = Arrays.asList(skills);

    }

//    public void Testing(){
//        String [] string=new String[5];
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("uday");
//
//    }

}