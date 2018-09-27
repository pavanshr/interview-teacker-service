package com.example.interviewtracker.controller;


import com.example.interviewtracker.service.InterviewTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class interviewTrackerController {

@Autowired
InterviewTrackerService interviewTrackerService;

    @RequestMapping(value = "/candidate/info/{appid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity listAllLeaveData(@PathVariable("appid") String appid) {

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(interviewTrackerService.retrieveLoaDataByAssociateId(appid));
        } catch (Exception e) {

            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("There was an issue while retrieving application details details");
        }
    }
}