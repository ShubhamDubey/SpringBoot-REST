package com.niit.myblog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.myblog.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}
