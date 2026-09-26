package com.issueflow.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.issueflow.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
}
