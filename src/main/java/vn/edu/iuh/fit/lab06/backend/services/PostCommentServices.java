package vn.edu.iuh.fit.lab06.backend.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab06.backend.repositories.PostCommentRepository;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentServices {
    private PostCommentRepository postCommentRepository;
}
