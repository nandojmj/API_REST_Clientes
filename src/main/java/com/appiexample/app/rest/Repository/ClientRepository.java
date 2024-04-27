package com.appiexample.app.rest.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.appiexample.app.rest.Model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}