package com.example.interviewtracker.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateInfoResponse {


    private String personId;


    private String associateId;


    private String statusComment;

    private String statCommDOvrd;

    private String beginDate;

    private String expectedReturnDate;

    private String IsCurrentlyOnLeave;
}