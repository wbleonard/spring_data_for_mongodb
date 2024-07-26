package com.att.treasurehunt.entity;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Field;

public class Note {
    private String author;
    private String comment;
    private Date date;
    @Field("note_id")
    private String noteId;

    // Getters and setters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
}
