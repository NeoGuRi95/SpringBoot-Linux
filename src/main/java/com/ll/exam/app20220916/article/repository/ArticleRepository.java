package com.ll.exam.app20220916.article.repository;

import com.ll.exam.app20220916.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}