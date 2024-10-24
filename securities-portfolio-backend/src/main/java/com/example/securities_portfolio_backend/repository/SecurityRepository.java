package com.example.securities_portfolio_backend.repository;

import com.example.securities_portfolio_backend.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Security, Long> {
}
