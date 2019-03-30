package com.alexbozzini.coffeenote.Note;

import com.alexbozzini.coffeenote.Note.Note;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(rel = "notes", path = "notes")
public interface NoteRepository extends PagingAndSortingRepository<Note, Long> {
}
