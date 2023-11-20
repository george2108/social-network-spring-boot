package org.example.jorge.dto;

public class MessageDTO {
    private long id;
    private String content;

    public  MessageDTO(){
        super();
    }

    public MessageDTO(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
