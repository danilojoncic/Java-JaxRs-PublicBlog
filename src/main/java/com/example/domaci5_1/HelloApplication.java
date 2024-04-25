package com.example.domaci5_1;

import com.example.domaci5_1.repository.abstraction.CommentInterfaceRepo;
import com.example.domaci5_1.repository.CommentRepository;
import com.example.domaci5_1.repository.abstraction.PostInterfaceRepo;
import com.example.domaci5_1.repository.PostRepository;
import com.example.domaci5_1.service.CommentService;
import com.example.domaci5_1.service.PostService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {
    public HelloApplication() {
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(CommentRepository.class).to(CommentInterfaceRepo.class).in(Singleton.class);
                this.bind(PostRepository.class).to(PostInterfaceRepo.class).in(Singleton.class);

                this.bindAsContract(PostService.class);
                this.bindAsContract(CommentService.class);
            }
        };
        register(binder);

        // Ucitavamo resurse
        packages("com.example.domaci5_1.resources");
    }
}