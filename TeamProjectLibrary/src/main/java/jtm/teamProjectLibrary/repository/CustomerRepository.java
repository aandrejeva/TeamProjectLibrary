package jtm.teamProjectLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jtm.teamProjectLibrary.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
