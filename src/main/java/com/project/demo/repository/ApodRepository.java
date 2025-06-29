package com.project.demo.repository;

import com.project.demo.model.Apod;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ApodRepository extends ElasticsearchRepository<Apod, String> {
    List<Apod> findByTitleContaining(String title);
}
