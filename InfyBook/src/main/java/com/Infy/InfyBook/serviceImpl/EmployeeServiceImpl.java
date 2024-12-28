package com.Infy.InfyBook.serviceImpl;

import com.Infy.InfyBook.dto.EmployeeRequestDTO;
import com.Infy.InfyBook.dto.EmployeeResponseDTO;
import com.Infy.InfyBook.mapper.EmployeeDtoMapper;
import com.Infy.InfyBook.model.Employee;
import com.Infy.InfyBook.repository.EmployeeRepo;
import com.Infy.InfyBook.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public EmployeeResponseDTO signup(EmployeeRequestDTO employeeRequestDTO) {
        Employee employee = EmployeeDtoMapper.convertRequestDtoToEntity(employeeRequestDTO);
        employee = employeeRepo.save(employee);
        return EmployeeDtoMapper.convertEntityToResponseDto(employee);
    }

    @Override
    public List<EmployeeResponseDTO> getAll() {
        List<Employee> employeeList = employeeRepo.findAll();
        List<EmployeeResponseDTO> employeeResponseDTOList = new ArrayList<>();
        for(Employee em : employeeList){
            employeeResponseDTOList.add(EmployeeDtoMapper.convertEntityToResponseDto(em));
        }

        return employeeResponseDTOList;
    }

    @Override
    public EmployeeResponseDTO getEmployee(UUID id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(
                ()-> new RuntimeException());

        return EmployeeDtoMapper.convertEntityToResponseDto(employee);
    }

    @Override
    public EmployeeResponseDTO updateEmployeeDetails(UUID id, EmployeeRequestDTO employeeRequestDTO) {
        // Handle exception that employee with given is NOT FOUND
        Employee employee = employeeRepo.findById(id).get();
            //    .orElseThrow(()-> new RuntimeException());

        employee.setEmpId(employeeRequestDTO.getEmpId());
        employee.setName(employeeRequestDTO.getName());
        employee.setEmail(employeeRequestDTO.getEmail());
        employee.setRole(employeeRequestDTO.getRole());
        employee.setPassword(employeeRequestDTO.getPassword());

        employee = employeeRepo.save(employee);
        return EmployeeDtoMapper.convertEntityToResponseDto(employee);
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if(employee.isPresent()){
            employeeRepo.delete(employee.get());
        }
        return true;
    }
}
