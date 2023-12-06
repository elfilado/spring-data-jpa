package com.example.bdd.service;

import com.example.bdd.model.dododb.Client;
import com.example.bdd.model.northwind.Employee;
import com.example.bdd.repository.EmployeeRepository;
import com.example.bdd.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestRepository testRepository;
    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    public Client findById(long id) {
        return this.testRepository.findById(id);
    }
}
