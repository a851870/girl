package com.hackli.girl.repository;

import com.hackli.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    public List<Girl> findByAge(Integer age);
    public List<Girl> findByCupsize(String cupSize);
}
