package com.issueflow.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.issueflow.model.Issue;

@Repository
public class IssueRepository {
	private final List<Issue> issues;
	
	public IssueRepository() {
		this.issues = new ArrayList<>();
	}
	
	public void save(Issue issue) {
		issues.add(issue);
	}
	
	public List<Issue> findAll() {
		return issues;
	}
}
