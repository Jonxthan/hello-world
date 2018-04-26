package com.jonathan.guestbook.controller;


import com.jonathan.guestbook.domain.GuestbookEntry;
import com.jonathan.guestbook.service.GuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/api")
@RestController
public class GuestbookController {

    @Autowired
    private GuestbookService guestbookService;

    @GetMapping("/")
    public List <GuestbookEntry> testMapping () {
        return guestbookService.findAllEntries();
    }

    @GetMapping ("/comment/{id}")
    public GuestbookEntry findGuestBookEntryById (@PathVariable("id") Integer id) {
        return this.guestbookService.findGuestbookEntryById(id);
    }


    @GetMapping ("/user/{user}")
    public List <GuestbookEntry> findGuestBookEntryByUser (@PathVariable ("user") String user) {
        return this.guestbookService.findGuestbookEntryByUser (user);
    }

    @GetMapping ("/comments")
    public List <GuestbookEntry> getAllComments () {
        return guestbookService.findAllEntries ();
    }

    @DeleteMapping("/comment/{id}")
    public void deleteGuestBookEntryById (@PathVariable ("id") Integer id) {
        this.guestbookService.deleteGuestbookEntryById(id);

    }

    @PostMapping("/add")
    public void addComment (@RequestBody GuestbookEntry guestBookEntry) {
        this.guestbookService.save (guestBookEntry);
    }

    @PostMapping ("/update")
    public void updateComment (@RequestBody GuestbookEntry guestBookEntry) {
        this.guestbookService.save (guestBookEntry);
    }

}


