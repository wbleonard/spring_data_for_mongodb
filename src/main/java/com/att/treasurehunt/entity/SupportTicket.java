package com.att.treasurehunt.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

public class SupportTicket {
    @Field("created_date")
    private Date createdDate;

    private String issue;

    private List<Note> notes;

    @Field("resolved_date")
    private Date resolvedDate;

    private String service;

    private String status;

    @Field("ticket_id")
    private String ticketId;

    // Getters and setters

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    
}
