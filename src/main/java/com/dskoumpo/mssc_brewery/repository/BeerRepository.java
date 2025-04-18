package com.dskoumpo.mssc_brewery.repository;

import com.dskoumpo.mssc_brewery.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface BeerRepository extends JpaRepository<Beer, UUID> {
}