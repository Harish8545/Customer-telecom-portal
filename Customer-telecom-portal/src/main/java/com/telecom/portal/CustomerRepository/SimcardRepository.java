package com.telecom.portal.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.portal.model.Simcard;

@Repository
public interface SimcardRepository extends JpaRepository<Simcard, Integer> {

}
