package org.example.jorge.dto;

public class ImageDTO {
    private long id;
    private String title;
    private byte[] content;

    public ImageDTO(){
        super();
    }

    public ImageDTO(long id, String title, byte[] content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
