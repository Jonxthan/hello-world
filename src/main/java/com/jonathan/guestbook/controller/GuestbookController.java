package com.jonathan.guestbook.controller;


import com.jonathan.guestbook.domain.GuestbookEntry;
import com.jonathan.guestbook.service.GuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestbookController {

    @Autowired
    private GuestbookService guestbookService;

    @GetMapping("/")
    public List <GuestbookEntry> testMapping () {
        return guestbookService.findAllEntries();
    }
}
