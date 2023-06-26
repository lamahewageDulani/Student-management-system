package com.drl.student.system.repository;

import com.drl.student.system.model.Childissue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ChildissueRepository extends JpaRepository<Childissue, Integer> {

}
