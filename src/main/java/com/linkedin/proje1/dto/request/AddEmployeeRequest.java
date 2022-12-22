package com.linkedin.proje1.dto.request;

import com.linkedin.proje1.entity.Certificate;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddEmployeeRequest {
    String name;
    String surname;
    String eMail;
    List<String> certificates;

}
