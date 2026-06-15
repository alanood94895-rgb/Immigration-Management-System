package com.example.tra.Repositories;

import com.example.tra.ImmigrationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepository extends JpaRepository<ImmigrationCenter, Long> {
}
