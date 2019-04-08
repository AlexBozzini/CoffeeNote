package com.alexbozzini.coffeenote.Note;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "notes", path = "notes")
public interface NoteRepository extends PagingAndSortingRepository<Note, Long> {
}
