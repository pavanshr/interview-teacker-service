package com.example.interviewtracker.service;
import com.example.interviewtracker.response.CandidateInfoResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.nio.file.Path;
import java.nio.file.Paths;


@Slf4j
@Service
public class InterviewTrackerService {



    @Cacheable("leaveData")
    public CandidateInfoResponse retrieveLoaDataByAssociateId(String ldapId) {
        CandidateInfoResponse  candidateInfoResponse = null;
        try {

            ObjectMapper mapper = new ObjectMapper();
            Path resourceDirectory = Paths.get("src", "main", "resources", "CandidateInfoResponse.json");
              candidateInfoResponse = mapper.readValue(resourceDirectory.toFile(), CandidateInfoResponse.class);
        } catch (Exception e) {
            log.error("There was an issue while retrieving candidate info details", e);
        }

        return candidateInfoResponse;
    }


}