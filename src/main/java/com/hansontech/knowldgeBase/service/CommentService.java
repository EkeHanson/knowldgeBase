package com.hansontech.knowldgeBase.service;
import com.hansontech.knowldgeBase.entity.Comments;

import java.util.List;

public interface CommentService {
    List<Comments> getAllComment();
    Comments saveComments(Comments comments);
    Comments getCommentsById(Long id);
    Comments updateComments(Comments comment);
    void deleteComments(Long id);

}
