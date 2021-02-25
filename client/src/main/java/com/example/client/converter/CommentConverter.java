package com.example.client.converter;

import org.springframework.stereotype.Service;

import com.example.client.model.Client;
import com.example.client.model.ClientDTO;
import com.example.client.model.Comment;
import com.example.client.model.CommentDTO;

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


	    public Comment Request(ClientDTO comment) {
	        return null;
	    }
}
