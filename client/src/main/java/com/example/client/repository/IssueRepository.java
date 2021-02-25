package com.example.client.repository;

import com.example.client.model.Client;
import com.example.client.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;


@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {
    @Query(value = "{ call SelectIssueByReportNumber(:Number)}", nativeQuery = true)
    Issue SelectIssueByReportNumber(@Param("Number") String Number);



}
