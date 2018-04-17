package com.jonathan.guestbook.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuestbookEntryRepository extends CrudRepository <GuestbookEntry, Integer> {

    @Override
    List<GuestbookEntry> findAll ();
}
