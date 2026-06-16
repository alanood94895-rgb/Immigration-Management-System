package com.example.tra.Repositories;

import com.example.tra.Entities.ImmigrationOfficer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficerRepository extends JpaRepository<ImmigrationOfficer, Long> {

    List<ImmigrationOfficer> findByOfficerRank(String officerRank);

}
