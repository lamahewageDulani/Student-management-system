package com.drl.student.system.repository;

import com.drl.student.system.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository <Images, Integer> {
}
