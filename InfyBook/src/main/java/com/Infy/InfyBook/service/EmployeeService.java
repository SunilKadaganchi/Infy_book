package com.Infy.InfyBook.service;

import com.Infy.InfyBook.dto.EmployeeRequestDTO;
import com.Infy.InfyBook.dto.EmployeeResponseDTO;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    EmployeeResponseDTO signup(EmployeeRequestDTO employeeRequestDTO);
    List<EmployeeResponseDTO> getAll();
    EmployeeResponseDTO getEmployee(UUID id);
    EmployeeResponseDTO updateEmployeeDetails(UUID id,EmployeeRequestDTO employeeRequestDTO);
    boolean deleteEmployee(UUID id);


}
