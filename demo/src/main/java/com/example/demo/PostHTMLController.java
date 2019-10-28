package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class PostHTMLController {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
			
	@GetMapping("/viewposts")
	public String getPosts(Model model){
		List<Posts> postslist = namedParameterJdbcTemplate.query(
				"Select * from posts",
				BeanPropertyRowMapper.newInstance(Posts.class));
		model.addAttribute("posts",postslist);
		return "posts";
	}
	
	@GetMapping("/viewposts/{user}")
	public String getPostsByName(@PathVariable String user, Model model){
		List<Posts> postslist = namedParameterJdbcTemplate.query(
				"Select * from posts where user= :user",
				new MapSqlParameterSource().addValue("user",user),
				BeanPropertyRowMapper.newInstance(Posts.class));
		model.addAttribute("posts",postslist);
		return "posts";
	}
	
	
}
