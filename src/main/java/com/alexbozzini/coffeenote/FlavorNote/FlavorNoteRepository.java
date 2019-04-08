package com.alexbozzini.coffeenote.FlavorNote;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "flavors", path = "flavors")
public interface FlavorNoteRepository extends PagingAndSortingRepository<FlavorNote, Long> {
}
