package vn.edu.iuh.fit.lab06.backend.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab06.backend.repositories.PostRepository;

@Service
@NoArgsConstructor @AllArgsConstructor
public class PostServices {
    private PostRepository postRepository;
}

