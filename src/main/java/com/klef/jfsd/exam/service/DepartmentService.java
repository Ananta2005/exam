package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.entity.Department;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertDepartment(String name, String location, String hodName) {
        Department department = new Department();
        department.setName(name);
        department.setLocation(location);
        department.setHodName(hodName);
        entityManager.persist(department);
    }

    @Transactional
    public void deleteDepartmentById(int departmentId) {
        String hql = "DELETE FROM Department d WHERE d.departmentId = ?1";
        entityManager.createQuery(hql).setParameter(1, departmentId).executeUpdate();
    }
}
