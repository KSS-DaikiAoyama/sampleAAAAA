package com.example.a;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Product;

@Controller
public class A {
	
	@RequestMapping("/a")
	public String a() {
		return "a";
	}
	
	@RequestMapping("/b")
	public String b(Model model) {
		Product product = new Product();
		
		product.setPicPath("data:image/jpg;base64,/images/Moon.jpg");
//		product.setPicPath(picPath);
		
		model.addAttribute("product", product);
		
		return "b";
	}
	
	@RequestMapping("/github")
	public String github() {
		
		System.out.println("connected!!!!");
		
		System.out.print(false);
		
		
		
		
		
//		aiurerawejoi
		
//		fjdosijgas
		
		
//		dfsajgiosjajg/
		
		
//		sfajoidfjiajfjao
		return "github";
	}
}
