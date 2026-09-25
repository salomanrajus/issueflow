package com.issueflow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issueflow.dto.CreateIssueRequest;
import com.issueflow.model.Issue;
import com.issueflow.repository.IssueRepository;

@Service
public class IssueService {
	
	private final IssueRepository issueRepository;
	
	private int issueCounter = 0;
	
	public IssueService(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}
	
	public Issue getIssue() {
		Issue issue =  new Issue(
				 "ISS-001",
			     "Deployment failure",
			     "Application deployment failed in the production environment",
			     "HIGH",
			     "OPEN"
				);
		
		issueRepository.save(issue);
		
		return issue;
	}
	
	public List<Issue> getAllIssues() {
		return issueRepository.findAll();
	}
	
	public Issue createIssue(CreateIssueRequest request) {		
		
		issueCounter++;
		String issueId = "ISS-" + String.format("%03d", issueCounter);
		
		Issue issue =  new Issue(
		        issueId,
		        request.getTitle(),
		        request.getDescription(),
		        request.getPriority(),
		        request.getStatus()
		    );
		
		issueRepository.save(issue);
		
		return issue;
	}
}
