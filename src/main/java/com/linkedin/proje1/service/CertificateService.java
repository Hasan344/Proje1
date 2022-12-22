//package com.linkedin.proje1.service;
//
//import com.linkedin.proje1.dto.request.AddCertificateRequest;
//import com.linkedin.proje1.dto.request.AddEmployeeRequest;
//import com.linkedin.proje1.entity.Certificate;
//import com.linkedin.proje1.mapper.EmployeeMapper;
//import com.linkedin.proje1.repository.CertificateRepository;
//import java.util.List;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
//public class CertificateService {
//    CertificateRepository certificateRepository;
//    EmployeeMapper employeeMapper;
//
//    public void addCertificates(List<AddCertificateRequest> names, AddEmployeeRequest addEmployeeRequest){
//        for(int i=0;i<names.size();i++) {
//            Certificate certificate = Certificate.builder()
//                    .name(names.get(i).getName())
//                    .employee(employeeMapper.toEmployeeEntity(addEmployeeRequest))
//                    .build();
//            certificateRepository.save(certificate);
//        }
//    }
//}
//
//
//
//
