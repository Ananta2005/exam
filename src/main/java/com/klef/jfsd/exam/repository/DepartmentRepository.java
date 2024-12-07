package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
