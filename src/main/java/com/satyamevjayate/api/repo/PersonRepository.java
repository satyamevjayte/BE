package com.satyamevjayate.api.repo;

import com.satyamevjayate.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PersonRepository extends JpaRepository<Person, BigInteger> {
}
