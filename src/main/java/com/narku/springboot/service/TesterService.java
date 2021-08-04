package com.narku.springboot.service;

import com.narku.springboot.exception.UserNotFoundException;
import com.narku.springboot.model.Tester;
import com.narku.springboot.repo.TesterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TesterService {
    private final TesterRepo testerRepo;

    @Autowired
    public TesterService(TesterRepo testerRepo) {
        this.testerRepo = testerRepo;
    }

    public Tester addTester(Tester tester)
    {
        tester.setTesterCode(UUID.randomUUID().toString());
        return testerRepo.save(tester);
    }

    public List<Tester> findAllTesters()
    {
        return testerRepo.findAll();
    }

    public Tester updateTester(Tester tester)
    {
        return testerRepo.save(tester);
    }

    public void deleteTester(Long id)
    {
        testerRepo.deleteTesterById(id);
    }

    public Tester findTesterById(Long id)
    {
        return testerRepo.findTesterById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
}
