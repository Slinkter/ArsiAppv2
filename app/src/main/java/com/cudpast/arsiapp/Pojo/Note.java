package com.cudpast.arsiapp.Pojo;

public class Note {

    int id ;
    String title ; // nombre del curso
    String body ; // id_video o link de video de youtube

    public Note(int id , String title,String body){
        this.id = id;
        this.body = body;
        this.title =title;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
