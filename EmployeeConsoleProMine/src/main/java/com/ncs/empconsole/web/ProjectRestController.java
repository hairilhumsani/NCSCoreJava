package com.ncs.empconsole.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.ncs.empconsole.model.Project;
import com.ncs.empconsole.service.ProjectService;

@RestController
@RequestMapping("/projectConsole")
public class ProjectRestController {

	@Autowired
	ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> getAllProject()
	{
		return projectService.getAllProject();
	}
	
	@PostMapping("/projects")
	public Project addProject(@RequestBody Project p)
	{
		

		System.err.println(" -->> 1) From Web :- "+p);
		boolean status = projectService.addProject(p) != null;
		System.err.println(" -->> 4) add employee Rest controller status :- "+status);
		return (status == true)?p:null;
		
	}
	
}
