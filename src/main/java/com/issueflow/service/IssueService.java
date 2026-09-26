package com.issueflow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issueflow.dto.CreateIssueRequest;
import com.issueflow.model.Issue;
import com.issueflow.repository.IssueRepository;

@Service
public class IssueService {
	
	private final IssueRepository issueRepository;

	public IssueService(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}
	
	public List<Issue> getAllIssues() {
		return issueRepository.findAll();
	}
	
	public Issue createIssue(CreateIssueRequest request) {
		Issue issue =  new Issue(
		        request.getTitle(),
		        request.getDescription(),
		        request.getPriority(),
		        request.getStatus()
		    );
		
		issueRepository.save(issue);
		return issue;
	}
}
