package com.example.client.repository;

import com.example.client.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {
}
