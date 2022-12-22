package com.linkedin.proje1.entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Table(name = "employee")
@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String eMail;
//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
//    List<WorkExperience> workExperiences;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    List<Certificate> certificates;
//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
//    List<LangKnowledge> langKnowledge;
//    @OneToMany(mappedBy = "employee")
//    Map<ExtraNote,ExtraNote> extraNotes=new LinkedHashMap<>();
//    @JsonAnySetter
//    void setDetail(ExtraNote key, ExtraNote value){
//        extraNotes.put(key,value);
//    }

}
