package com.thinkful.notes.firebase;

import java.io.Serializable;
import java.util.Calendar;
public class NoteListItem {
    private String text;
    private String status;
    private Calendar date;

    public String id;

    public NoteListItem() {}

    public NoteListItem(String text) {
        this(text, "Open", Calendar.getInstance(),null);
    }

    public NoteListItem(String text, String status, Calendar date, String id){
        this.text = text;
        this.status = status;
        this.date = date;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}