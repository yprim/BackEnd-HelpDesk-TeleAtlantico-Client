package com.example.client.repository;

import com.example.client.model.Comment;
import com.example.client.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query(value = "{ call SelectCommentByIssue(:id)}", nativeQuery = true)
    List<Comment> SelectCommentByIssue(@Param("id") Integer id);
}
