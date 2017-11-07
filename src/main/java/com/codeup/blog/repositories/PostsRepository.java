package com.codeup.blog.repositories;

//creates the tables in `mysql`

import com.codeup.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends CrudRepository <Post, Long>{



}
