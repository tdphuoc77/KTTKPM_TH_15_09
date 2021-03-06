package com.cmoi_th_15_09.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String fName;
    private  String lName;
    private String email;
}
