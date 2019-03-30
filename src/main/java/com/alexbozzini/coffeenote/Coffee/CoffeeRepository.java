package com.alexbozzini.coffeenote.Coffee;

import com.alexbozzini.coffeenote.Coffee.Coffee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(rel = "coffees", path = "coffees")
public interface CoffeeRepository extends PagingAndSortingRepository<Coffee, Long> {
}
