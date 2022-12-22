package com.linkedin.proje1.service;

import com.linkedin.proje1.dto.request.AddEmployeeRequest;
import com.linkedin.proje1.entity.EmployeeEntity;
import com.linkedin.proje1.repository.EmployeeRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class EmployeeService {
    EmployeeRepository employeeRepository;
//    EmployeeMapper employeeMapper;


    public void addEmployee(AddEmployeeRequest addEmployeeRequest){

        EmployeeEntity employeeEntity=EmployeeEntity.builder()
                .name(addEmployeeRequest.getName())
                .eMail(addEmployeeRequest.getEMail())
                .surname(addEmployeeRequest.getSurname())
                .build();


        employeeRepository.save(employeeEntity);
    }


}
