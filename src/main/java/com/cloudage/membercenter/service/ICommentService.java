package com.cloudage.membercenter.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cloudage.membercenter.entity.Comment;

public interface ICommentService {
	Page<Comment> findCommentsOfArticle(int articleId, int page);

	Comment save(Comment comment);
	
	int getCommentCountOfArticle(int articleId);
	Page<Comment> findCommentsOfMe(int author_id, int page);// 别人的评论

	Page<Comment> findMyComments(int author_id, int page);//我的评论
}