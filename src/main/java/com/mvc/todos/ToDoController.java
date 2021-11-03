package com.mvc.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ToDoController {

	@Autowired
	ToDoService todoService;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String toDos(ModelMap model) {
		model.addAttribute("todos", todoService.retrieveTodos("Aina"));
		return "list-todos";
	}
}
