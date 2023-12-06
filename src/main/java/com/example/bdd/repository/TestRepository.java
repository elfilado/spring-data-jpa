package com.example.bdd.repository;

import com.example.bdd.model.dododb.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Client, Long> {
    Client findById(long id);
}