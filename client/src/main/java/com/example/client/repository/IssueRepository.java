package com.example.client.repository;

import com.example.client.model.Client;
import com.example.client.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {

    @Query(value = "{ call SelectIssueByClient(:id)}", nativeQuery = true)
    List<Issue> SelectIssueByClient(@Param("id") Integer id);

    @Query(value = "{ call SelectIssueByReportNumber(:Number)}", nativeQuery = true)
    Issue SelectIssueByReportNumber(@Param("Number") String Number);


}
