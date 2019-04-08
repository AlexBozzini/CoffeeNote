package com.alexbozzini.coffeenote.Coffee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "coffees", path = "coffees")
public interface CoffeeRepository extends PagingAndSortingRepository<Coffee, Long> {
}
