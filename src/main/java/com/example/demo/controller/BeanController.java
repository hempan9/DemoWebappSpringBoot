package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Bean;

@Controller
public class BeanController {

	@RequestMapping("sub")
	public ModelAndView indexView( @RequestParam("id")int id, @RequestParam("name")String name,  Bean bean) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id",id);
		modelAndView.addObject("name", name);
		//modelAndView.addObject("b",bean);
		modelAndView.setViewName("indexResponse");
		return modelAndView;
		
	}

}
