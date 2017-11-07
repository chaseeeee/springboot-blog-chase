package com.codeup.blog.services;

import com.codeup.blog.models.Post;
import com.codeup.blog.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("PostsSvc")
public class PostsSvc {

  private PostsRepository postsDao;

  @Autowired
  public PostsSvc(PostsRepository postsDao){
    this.postsDao = postsDao;
  }



  /*private List<Post> posts=new ArrayList<>();*/

  /*public PostsSvc() {
    createAds();
  }*/

  /*public List<Post> findAll() {
    return posts;
  }*/

 /* public Post save(Post post) {
    post.setId((long) posts.size() + 1);
    posts.add(post);
    return post;
  }*/

  /*public Post findOne(long id) {
    return posts.get((int) id - 1);
  }

  public List<Post> createAds() {

    savePost(new Post("Example 1", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci atque commodi eligendi necessitatibus voluptates. At distinctio dolores minus molestiae mollitia nemo sapiente ut veniam voluptates! Corporis distinctio error quaerat vel!"));

    savePost(new Post("Example 2", "QWE Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci atque commodi eligendi necessitatibus voluptates. At distinctio dolores minus molestiae mollitia nemo sapiente ut veniam voluptates! Corporis distinctio error quaerat vel!"));

    savePost(new Post("Example 3", "ASD Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci atque commodi eligendi necessitatibus voluptates. At distinctio dolores minus molestiae mollitia nemo sapiente ut veniam voluptates! Corporis distinctio error quaerat vel!"));

    return posts;

    }

  public void savePost(Post post){
    post.setId(posts.size()+1);
    posts.add(post);
  }*/

}