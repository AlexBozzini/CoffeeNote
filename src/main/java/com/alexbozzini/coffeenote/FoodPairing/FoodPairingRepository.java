package com.alexbozzini.coffeenote.FoodPairing;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "foods", path = "foods")
public interface FoodPairingRepository extends PagingAndSortingRepository<FoodPairing, Long> {
}
