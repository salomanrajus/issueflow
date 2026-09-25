package com.issueflow.controller;

import com.issueflow.dto.CreateIssueRequest;
import com.issueflow.model.Issue;
import com.issueflow.service.IssueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/")
    public String home() {
        return "IssueFlow is running!";
    }

    @GetMapping("/issues")
    public List<Issue> getAllIssues() {
        return issueService.getAllIssues();
    }

    @PostMapping("/issues")
    public Issue createIssue(@RequestBody CreateIssueRequest request) {
        return issueService.createIssue(request);
    }
}
