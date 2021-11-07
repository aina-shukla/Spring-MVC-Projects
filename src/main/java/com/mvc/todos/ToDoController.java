package com.mvc.todos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("uname")
public class ToDoController {

	@Autowired
	ToDoService todoService;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String listToDos(ModelMap model) {
		model.addAttribute("todos", todoService.retrieveTodos("Aina"));
		return "list-todos";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showToDos() {
		return "todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addToDos(ModelMap model, @RequestParam String description) {
		todoService.addTodo("Aina", description,new Date(), false);
		model.clear();
		return "redirect:list-todos";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteToDos(ModelMap model, @RequestParam int id) {
//		todoService.addTodo("Aina", description,new Date(), false);
		todoService.deleteTodo(id);
		model.clear();
		return "redirect:list-todos";
	}
	
}
