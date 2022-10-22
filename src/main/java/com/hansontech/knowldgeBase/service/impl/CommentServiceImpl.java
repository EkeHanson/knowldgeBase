package com.hansontech.knowldgeBase.service.impl;
import com.hansontech.knowldgeBase.entity.Comments;
import com.hansontech.knowldgeBase.repository.CommentRepository;
import com.hansontech.knowldgeBase.service.CommentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
        private CommentRepository commentRepository;

        public CommentServiceImpl(CommentRepository commentRepository) {
            super();
            this.commentRepository = commentRepository;}

        @Override
        public List<Comments> getAllComment() {
            return commentRepository.findAll();}
        @Override
        public Comments saveComments(Comments comments) {
            return commentRepository.save(comments);}
        @Override
        public Comments getCommentsById(Long id) {
            return commentRepository.findById(id).get();}
        @Override
        public Comments updateComments(Comments comment) {
            return commentRepository.save(comment);}

    @Override
    public void deleteComments(Long id) {
        commentRepository.deleteById(id);
    }
}

