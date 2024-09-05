package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontius.proje.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {

}
