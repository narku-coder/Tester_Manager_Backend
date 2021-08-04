package com.narku.springboot;

import com.narku.springboot.model.Tester;
import com.narku.springboot.service.TesterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tester")
public class TesterResource {
    private final TesterService testerService;

    public TesterResource(TesterService testerService) {
        this.testerService = testerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tester>> getAllTesters()
    {
        List<Tester> testers = testerService.findAllTesters();
        return new ResponseEntity<>(testers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Tester> getTesterById(@PathVariable("id") Long id)
    {
        Tester tester = testerService.findTesterById(id);
        return new ResponseEntity<>(tester, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Tester> addTester(@RequestBody Tester tester)
    {
        Tester newTester = testerService.addTester(tester);
        return new ResponseEntity<>(newTester, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Tester> updateTester(@RequestBody Tester tester)
    {
        Tester updatedTester = testerService.updateTester(tester);
        return new ResponseEntity<>(updatedTester, HttpStatus.OK);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> updateTester(@PathVariable("id") Long id)
    {
        testerService.deleteTester(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
