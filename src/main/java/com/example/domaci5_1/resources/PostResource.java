package com.example.domaci5_1.resources;

import com.example.domaci5_1.entity.Post;
import com.example.domaci5_1.service.PostService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/posts")
public class PostResource {
    @Inject
    private PostService postService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        System.out.println("GET CALLED: Fetching all posts");
        return Response.ok(this.postService.allPosts()).build();
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post find(@PathParam("id") Integer id) {
        System.out.println("GET CALLED: Fetching post with id: " + id);
        return this.postService.findPost(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Post create(@Valid Post post) {
        System.out.println("POST CALLED: Creating a new post: " + post.getTitle());
        return this.postService.addPost(post);
    }

}