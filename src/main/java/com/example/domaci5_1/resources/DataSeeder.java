package com.example.domaci5_1.resources;

import com.example.domaci5_1.entity.Post;
import com.example.domaci5_1.repository.PostRepository;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Date;

//na ovaj nacin seedujem repository
public class DataSeeder implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        PostRepository postRepository = new PostRepository();
        for(int i = 0; i < 5;i++){
            Post p1 = new Post();
            Date date = new Date();
            p1.setDate(date.toString());
            p1.setAuthor("Author" + i);
            p1.setTitle("Title " + i);
            p1.setText("Lorem Ipsum bajo");
            postRepository.addPost(p1);
        }
        sce.getServletContext().setAttribute("postRepository",postRepository);
    }
}
