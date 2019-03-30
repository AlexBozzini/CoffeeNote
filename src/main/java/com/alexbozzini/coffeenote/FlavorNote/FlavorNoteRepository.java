package com.alexbozzini.coffeenote.FlavorNote;

import com.alexbozzini.coffeenote.FlavorNote.FlavorNote;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(rel = "flavorNotes", path = "flavorNotes")
public interface FlavorNoteRepository extends PagingAndSortingRepository<FlavorNote, Long> {
}
