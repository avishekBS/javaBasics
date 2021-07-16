package com.learning.jersey.learningJerseyTwo.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learning.jersey.learningJerseyTwo.model.Comment;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

	Comment comment = new Comment();
	ArrayList<Comment> commentList = new ArrayList<Comment>();

	@GET
	public ArrayList<Comment> getComments(@PathParam("messageId") int messageId) {
		commentList.add(new Comment(1, messageId, "Avishek", "I am learning jax-rs subresource"));
		commentList.add(new Comment(2, messageId, "poushali", "Dont get understand what he does"));
		return commentList;
	}

	@GET
	@Path("/{commentAuthor}")
	public Comment getComment(@PathParam("commentAuthor") String commentAuthor, @PathParam("messageId") int messageId) {
		commentList.add(new Comment(1, messageId, "Avishek", "I am learning jax-rs subresource"));
		commentList.add(new Comment(2, messageId, "poushali", "Dont get understand what he does"));
		if (!commentList.isEmpty()) {
			for (Comment comment : commentList) {
				if (commentAuthor.equalsIgnoreCase(comment.getAuthor()))
					return comment;
			}
		}
		return null;
	}

}
