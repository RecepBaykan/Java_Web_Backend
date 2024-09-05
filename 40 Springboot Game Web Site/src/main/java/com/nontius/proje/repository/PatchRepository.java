package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nontius.proje.entity.Patch;

public interface PatchRepository extends JpaRepository<Patch, Long> {

}
