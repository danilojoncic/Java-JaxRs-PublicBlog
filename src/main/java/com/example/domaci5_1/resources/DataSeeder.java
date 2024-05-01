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


        Post p1 = new Post();
        p1.setTitle("Gigatron VS Limundo");
        p1.setAuthor("Posteni kupac");
        p1.setText("Da li je bolje trositi vas tesko zaradjeni novac u Gigatronu ili ipak okusati srecu na lokalnoj " +
                "riznici Limunda, to je kraj teksta!");
        postRepository.addPost(p1);

        Post p2 = new Post();
        p2.setTitle("Bec ili Vienna");
        p2.setAuthor("Turisticki vodic Dragoslav");
        p2.setText("Dodje na isto, to je kraj teksta!");
        postRepository.addPost(p2);

        Post p3 = new Post();
        p3.setTitle("Kako spremiti polumaraton za 3 nedelje");
        p3.setAuthor("Strucnjak za trcanje");
        p3.setText("Spremices se tako sto ces prvu nedelju jadikovati kako je tesko trcanje, a onda ces naredne 2 nedelje trcati");
        postRepository.addPost(p3);

        sce.getServletContext().setAttribute("postRepository",postRepository);
    }
}
