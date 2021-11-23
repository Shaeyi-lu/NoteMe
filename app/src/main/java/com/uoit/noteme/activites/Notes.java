package com.uoit.noteme.activites;

public class Notes {
    private String title;
    private String subtitle;
    private String text;
    private String imagePath;

    public Notes(String title, String subtitle, String text, String imagePath) {
        this.title = title;
        this.subtitle = subtitle;
        this.text = text;
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getText() {
        return text;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String toJsonString(){
        return "{ \"title\": \"" + getTitle() + "\",\n" +
                "   \"subtitle\": \"" + getSubtitle() + "\",\n" +
                "   \"text\": \"" + getText() + "\",\n" +
                "   \"image path\": \"" + getImagePath() + "\"}";
    }
}
