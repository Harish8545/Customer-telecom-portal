package com.telecom.portal.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.portal.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
