package com.dskoumpo.mssc_brewery.repository;

import com.dskoumpo.mssc_brewery.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;


public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}