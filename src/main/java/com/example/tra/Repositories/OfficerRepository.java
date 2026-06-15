package com.example.tra.Repositories;

import com.example.tra.ImmigrationOfficer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficerRepository extends JpaRepository<ImmigrationOfficer, Long> {
}
