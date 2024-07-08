package com.exam.quiz_online.repository;

import com.exam.quiz_online.model.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends JpaRepository<Options,Integer> {
}
