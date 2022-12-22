package com.linkedin.proje1.controller;

import com.linkedin.proje1.dto.request.AddCertificateRequest;
import com.linkedin.proje1.dto.request.AddEmployeeRequest;
//import com.linkedin.proje1.service.CertificateService;
import com.linkedin.proje1.service.EmployeeService;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;
//    CertificateService certificateService;
    @PostMapping
    void addEmployee(@RequestBody AddEmployeeRequest addEmployeeRequest){
    employeeService.addEmployee(addEmployeeRequest);
    }
}
