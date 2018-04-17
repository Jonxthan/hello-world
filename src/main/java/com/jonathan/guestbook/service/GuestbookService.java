package com.jonathan.guestbook.service;

import com.jonathan.guestbook.domain.GuestbookEntry;
import com.jonathan.guestbook.domain.GuestbookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestbookService {

    @Autowired
    private GuestbookEntryRepository guestbookEntryRepository;

    public List <GuestbookEntry> findAllEntries () {
        return this.guestbookEntryRepository.findAll();
    }

}
