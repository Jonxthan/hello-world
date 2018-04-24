package com.jonathan.guestbook.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "entries")
public class GuestbookEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "entry_id")
    private Integer id;
    @NotEmpty
    private String user;
    @NotEmpty
    private String comment;

    public GuestbookEntry() {
    }

    public GuestbookEntry(String user, String comment) {
        this.user = user;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "GuestbookEntry{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

