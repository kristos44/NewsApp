package com.example.android.newsapp;

/**
 * Created by krzysztof on 31.07.18.
 */

class News {
    private String title;
    private String section;
    private String publishDateTime;
    private String url;
    private String author;

    public News(String title, String section, String publishDateTime, String url, String author) {
        this.title = title;
        this.section = section;
        this.publishDateTime = publishDateTime;
        this.url = url;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getPublishDateTime() {
        return publishDateTime;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }
}
