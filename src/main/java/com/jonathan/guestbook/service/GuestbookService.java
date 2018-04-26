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

    public List<GuestbookEntry> findAllEntries() {
        return this.guestbookEntryRepository.findAll();
    }

    public GuestbookEntry findGuestbookEntryById(Integer id) {
        return this.guestbookEntryRepository.findGuestbookEntryById(id);
    }

    public List<GuestbookEntry> findGuestbookEntryByUser(String user) {
        return this.guestbookEntryRepository.findGuestbookEntryByUser(user);
    }

    public void deleteGuestbookEntryById(Integer id) {
        this.guestbookEntryRepository.delete(id);
    }

    public void save(GuestbookEntry newEntry) {
        this.guestbookEntryRepository.save (newEntry);
    }

    public GuestbookEntry findOne (Integer id) {
        return this.guestbookEntryRepository.findOne (id);
    }

}
