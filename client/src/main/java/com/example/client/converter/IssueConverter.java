package com.example.client.converter;

import com.example.client.model.Issue;
import com.example.client.model.IssueDTO;
import com.example.client.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.sql.Types.NULL;

@Service
public class IssueConverter  {


    public Issue Request(IssueDTO issueDTO, Issue existingIssue) {


        existingIssue.setReportNumber(issueDTO.getReportNumber());
        existingIssue.setContactEmail(issueDTO.getContactEmail());
        existingIssue.setStatus(issueDTO.getStatus());
        existingIssue.setDescription(issueDTO.getDescription());
        existingIssue.setService(issueDTO.getService());
        existingIssue.setCreationDate(issueDTO.getCreationDate());
        existingIssue.setCreationUser(issueDTO.getCreationUser());
        existingIssue.setUpdateDate(issueDTO.getUpdateDate());
        existingIssue.setUpdateUser(issueDTO.getUpdateUser());

        return existingIssue;
    }

    public IssueDTO  Response(Issue issue) {

        IssueDTO issueDTO=new IssueDTO();
        issueDTO.setClassification("");
        issueDTO.setResolutionComment("");
        issueDTO.setReportNumber(issue.getReportNumber());
        issueDTO.setContactEmail(issue.getContactEmail());
        issueDTO.setStatus(issue.getStatus());
        issueDTO.setDescription(issue.getDescription());
        issueDTO.setService(issue.getService());
        issueDTO.setCreationDate(issue.getCreationDate());
        issueDTO.setCreationUser(issue.getCreationUser());
        issueDTO.setUpdateDate(issue.getUpdateDate());
        issueDTO.setUpdateUser(issue.getUpdateUser());

        return issueDTO;
    }


}
