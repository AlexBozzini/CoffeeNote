package com.alexbozzini.coffeenote.FoodPairing;

import com.alexbozzini.coffeenote.FoodPairing.FoodPairing;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(rel = "foodPairings", path = "foodPairings")
public interface FoodPairingRepository extends PagingAndSortingRepository<FoodPairing, Long> {
}
