package com.Infy.InfyBook.repository;

import com.Infy.InfyBook.model.EmployeeBookStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeBookStatusRepo extends JpaRepository<EmployeeBookStatus, UUID> {
}
