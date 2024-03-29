package com.nischita.FlipBucket.repo;

import com.nischita.FlipBucket.models.MarkSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarkSheetRepository extends JpaRepository<MarkSheet,Integer> {



}
