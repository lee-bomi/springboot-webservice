package com.emma.book.springboot.domain.posts;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //posts클래스로 db에 접근하게할 클래스
}
