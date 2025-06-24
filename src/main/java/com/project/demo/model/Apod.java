package com.project.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "apod")
public class Apod {
    @Id
    private String date;
    private String title;
    private String explanation;
    private String url;
    private String authors;
}
