package com.example.mc.NotesAppSKL;

public class Note {
    private int id;
    private String title;
    private String location;
    private String message;
    private String voice;
    private String picture;

    public Note() {}

    public Note(String title, String location, String message, String voice, String picture) {
        super();
        this.title = title;
        this.location = location;
        this.message = message;
        this.voice = voice;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Note [id=" + id + ", title=" + title+ ", location=" + location
                + ", message=" + message + ", voice=" + voice + ", picture=" + picture + "]";
    }


}