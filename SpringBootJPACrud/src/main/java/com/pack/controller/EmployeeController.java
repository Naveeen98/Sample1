package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pack.model.Employee;
import com.pack.service.EmployeeService;

@Controller
@RequestMapping(value="/article")
public class EmployeeController {

 @Autowired
 EmployeeService employeeService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("article_list");
  List<Employee> articleList = employeeService.getAllEmployees();
  model.addObject("articleList", articleList);
  
  return model;
 }
 
 @RequestMapping(value="/addArticle/", method=RequestMethod.GET)
 public ModelAndView addArticle() {
  ModelAndView model = new ModelAndView();
  
  Employee article = new Employee();
  model.addObject("articleForm", article);
  model.setViewName("article_form");
  
  return model;
 }
 
 @RequestMapping(value="/updateArticle/{id}", method=RequestMethod.GET)
 public ModelAndView editArticle(@PathVariable int id) {
  ModelAndView model = new ModelAndView();
  
  Employee article =employeeService.getEmployeeById(id);
  model.addObject("articleForm", article);
  model.setViewName("article_form");
  
  return model;
 }
 
 @RequestMapping(value="/saveArticle", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("articleForm") Employee article) {
  employeeService.saveOrUpdate(article);
  
  return new ModelAndView("redirect:/article/list");
 }
 
 @RequestMapping(value="/deleteArticle/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") int id) {
  employeeService.delete(id);
  
  return new ModelAndView("redirect:/article/list");
 }
}