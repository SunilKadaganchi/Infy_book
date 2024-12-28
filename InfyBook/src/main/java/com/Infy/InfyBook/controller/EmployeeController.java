package com.Infy.InfyBook.controller;

import com.Infy.InfyBook.dto.EmployeeRequestDTO;
import com.Infy.InfyBook.dto.EmployeeResponseDTO;
import com.Infy.InfyBook.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    /**
     *
     *  - Add the Employee (Sign_Up /  Register)
     *  - Update the Employee Details
     *  - Get the Employee Details by EmpID
     *  - Get All Employee Details
     *  - Delete the Employee
     *
     *     - Employee Can Log_In with email and password
     *
     *  ADMIN ------
     *      - Only Admin can ADD, UPDATE, DELETE the Books
     *      - Only Admin can Update the status of Returned Books
     *
     *   - Can View the Books in his WishList
     *   - Can View the Books in Currently reading list
     *   - Can view the Books already returned
     *   - Can Rate the book that is currently reading or Returned
     *
     * */
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/signup")
    public ResponseEntity<?> employeeSignup(@RequestBody EmployeeRequestDTO employeeRequestDTO){
        return new ResponseEntity<>( employeeService.signup(employeeRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<?> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> getEmployee(@PathVariable UUID id){
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeResponseDTO> updateEmployeeDetails(@PathVariable UUID id,@RequestBody EmployeeRequestDTO employeeRequestDTO){
        return   ResponseEntity.ok(employeeService.updateEmployeeDetails(id,employeeRequestDTO)) ;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable(value = "id") UUID id){
        return  ResponseEntity.ok(employeeService.deleteEmployee(id)) ;
    }

}
