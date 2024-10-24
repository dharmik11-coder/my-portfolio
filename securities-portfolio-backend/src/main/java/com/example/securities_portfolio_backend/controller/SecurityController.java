package com.example.securities_portfolio_backend.controller;

import com.example.securities_portfolio_backend.model.Security;
import com.example.securities_portfolio_backend.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/securities")
@CrossOrigin(origins = "http://localhost:4200")
public class SecurityController {

    @Autowired
    private SecurityRepository securityRepository;

    // Get all securities
    @GetMapping
    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    // Create a new security
    @PostMapping
    public Security createSecurity(@RequestBody Security security) {
        return securityRepository.save(security);
    }

    // Get a security by ID
    @GetMapping("/{id}")
    public ResponseEntity<Security> getSecurityById(@PathVariable Long id) {
        Security security = securityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Security not found"));
        return ResponseEntity.ok(security);
    }

    // Update a security
    @PutMapping("/{id}")
    public ResponseEntity<Security> updateSecurity(@PathVariable Long id, @RequestBody Security updatedSecurity) {
        Security security = securityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Security not found"));

        security.setName(updatedSecurity.getName());
        security.setType(updatedSecurity.getType());
        security.setPrice(updatedSecurity.getPrice());
        security.setQuantity(updatedSecurity.getQuantity());

        final Security savedSecurity = securityRepository.save(security);
        return ResponseEntity.ok(savedSecurity);
    }

    // Delete a security
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSecurity(@PathVariable Long id) {
        Security security = securityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Security not found"));

        securityRepository.delete(security);
        return ResponseEntity.noContent().build();
    }
}

