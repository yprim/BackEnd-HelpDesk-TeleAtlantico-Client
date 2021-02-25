package com.example.client.converter;

import com.example.client.model.*;
import org.springframework.stereotype.Service;

@Service
public class CommentConverter {

	public Comment Response(CommentDTO commentDTO) {

		Comment comment = new Comment();
		comment.setDescription(commentDTO.getDescription());
		comment.setReportNumber(commentDTO.getReportNumber());
		comment.setCreationDate(commentDTO.getCreationDate());
		comment.setCreationUser(commentDTO.getCreationUser());
		comment.setUpdateDate(commentDTO.getUpdateDate());
		comment.setUpdateUser(commentDTO.getUpdateUser());
		comment.setUpdateUser(commentDTO.getUpdateUser());
		
	        return comment;
	    }

	public CommentDTO Request(Comment comment ) {

		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setDescription(comment.getDescription());
		commentDTO.setReportNumber(comment.getReportNumber());
		commentDTO.setCreationDate(comment.getCreationDate());
		commentDTO.setCreationUser(comment.getCreationUser());
		commentDTO.setUpdateDate(comment.getUpdateDate());
		commentDTO.setUpdateUser(comment.getUpdateUser());
		commentDTO.setUpdateUser(comment.getUpdateUser());


		return commentDTO;
	}
}
