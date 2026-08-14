package me.hyowon.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.hyowon.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
