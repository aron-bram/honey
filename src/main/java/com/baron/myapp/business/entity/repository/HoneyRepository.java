package com.baron.myapp.business.entity.repository;

import com.baron.myapp.business.entity.model.Honey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoneyRepository extends JpaRepository<Honey, Integer> {
}
