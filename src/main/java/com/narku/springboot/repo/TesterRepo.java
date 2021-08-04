package com.narku.springboot.repo;

import com.narku.springboot.model.Tester;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TesterRepo extends JpaRepository<Tester, Long> {
    void deleteTesterById(Long id);

    Optional<Tester> findTesterById(Long id);
}
