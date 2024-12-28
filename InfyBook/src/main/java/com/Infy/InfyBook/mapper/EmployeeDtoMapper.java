package com.Infy.InfyBook.mapper;

import com.Infy.InfyBook.dto.EmployeeRequestDTO;
import com.Infy.InfyBook.dto.EmployeeResponseDTO;
import com.Infy.InfyBook.model.Employee;

public class EmployeeDtoMapper {

    public static EmployeeResponseDTO convertEntityToResponseDto(Employee employee){
        EmployeeResponseDTO employeeResponseDTO = new EmployeeResponseDTO();
        employeeResponseDTO.setId(employee.getId());
        employeeResponseDTO.setEmpId(employee.getEmpId());
        employeeResponseDTO.setName(employee.getName());
        employeeResponseDTO.setEmail(employee.getEmail());
        employeeResponseDTO.setRole(employee.getRole());

        return employeeResponseDTO;
    }

    public static Employee convertRequestDtoToEntity(EmployeeRequestDTO employeeRequestDTO){
        Employee employee = new Employee();
        employee.setEmpId(employeeRequestDTO.getEmpId());
        employee.setName(employeeRequestDTO.getName());
        employee.setEmail(employeeRequestDTO.getEmail());
        employee.setRole(employeeRequestDTO.getRole());
        employee.setPassword(employeeRequestDTO.getPassword());

        return employee;
    }
}
