package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.repositories.PostsRepository;
import com.codeup.blog.services.PostsSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostsController {

  private final PostsSvc postsSvc;

  @Autowired
  public PostsController (PostsSvc postsSvc){
    this.postsSvc = postsSvc;
  }

  @GetMapping("/posts")
  public String showAll(Model vModel) {

    List<Post> posts = postsSvc.findAll();
    vModel.addAttribute("posts", posts);

    return "posts/index";
  }

  @GetMapping("/posts/{id}")
  public String showPost(@PathVariable int id, Model vModel) {

    Post singlePost = postsSvc.findOne(id);

    vModel.addAttribute("post", singlePost);
    return "posts/show";
  }

  // ----------------------------------
  // Create a new post:
  // ----------------------------------
  @GetMapping("/posts/create")
  public String createForm(Model model) {
    model.addAttribute("post", new Post());
    return "posts/create";
  }

  @PostMapping("/posts/create")
  public String savePost(@ModelAttribute Post post){
    postsSvc.savePost(post);
    return "redirect:/posts";
  }

  // ----------------------------------
  // Edit a post:
  // ----------------------------------
  @GetMapping("/posts/{id}/edit")
  public String showEditForm(@PathVariable Integer id, Model model) {
    Post editPost = postsSvc.findOne(id);
    model.addAttribute("post", editPost);
    return "/posts/edit";
  }
}

