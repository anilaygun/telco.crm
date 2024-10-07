package com.etiya.customerservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "individual_customer")
@PrimaryKeyJoinColumn(name = "id")
public class IndividualCustomer extends Customer {
    @Column(name = "NAT_id")
    private int nationalityId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    //TODO: enum?
    @Column(name = "gender")
    private byte gender;
    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "father_name")
    private String fatherName;
}
