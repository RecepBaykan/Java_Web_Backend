package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontius.proje.entity.Map;
import com.nontius.proje.entity.Weapon;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {

}
