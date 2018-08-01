package com.example.android.newsapp;

/**
 * Created by krzysztof on 31.07.18.
 */

class News {
    private String title;
    private String section;
    private String publishDateTime;
    private String url;

    public News(String title, String section, String publishDateTime, String url) {
        this.title = title;
        this.section = section;
        this.publishDateTime = publishDateTime;
        this.url = url;
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
}
