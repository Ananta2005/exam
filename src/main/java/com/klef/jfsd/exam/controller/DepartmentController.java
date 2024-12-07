package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Insert a department
    @PostMapping("/insert")
    public String insertDepartment(@RequestParam String name, @RequestParam String location, @RequestParam String hodName) {
        departmentService.insertDepartment(name, location, hodName);
        return "Department added successfully!";
    }

    // Delete a department by ID
    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartmentById(id);
        return "Department deleted successfully!";
    }
}
