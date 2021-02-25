package com.example.client.converter;

import com.example.client.model.Issue;
import com.example.client.model.IssueDTO;
import com.example.client.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.sql.Types.NULL;

@Service
public class IssueConverter  {

    @Autowired
    private IssueService service;


    public Issue Request(IssueDTO issue) {

        Issue existingIssue = service.SelectIssueByReportNumber(issue);
        existingIssue.setReportNumber(issue.getReportNumber());
        existingIssue.setContactEmail(issue.getContactEmail());
        existingIssue.setStatus(issue.getStatus());
        existingIssue.setDescription(issue.getDescription());
        existingIssue.setService(issue.getService());
        existingIssue.setCreationDate(issue.getCreationDate());
        existingIssue.setCreationUser(issue.getCreationUser());
        existingIssue.setUpdateDate(issue.getUpdateDate());
        existingIssue.setUpdateUser(issue.getUpdateUser());

        return existingIssue;
    }

    public IssueDTO  Response(Issue issue) {

        IssueDTO issueDTO=new IssueDTO();
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
