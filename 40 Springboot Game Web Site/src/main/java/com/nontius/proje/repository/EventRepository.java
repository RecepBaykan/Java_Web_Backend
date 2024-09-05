package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontius.proje.entity.Event;
import com.nontius.proje.entity.News;
import com.nontius.proje.entity.Patch;

public interface EventRepository extends JpaRepository<Event, Long> {

}
