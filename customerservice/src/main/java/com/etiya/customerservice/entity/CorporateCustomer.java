package com.etiya.customerservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "corporate_customer")
@PrimaryKeyJoinColumn(name = "id")
public class CorporateCustomer extends Customer{

    @Column(name = "corporate_name")
    private String corporateName;
    @Column(name = "tax_no")
    private String taxNo;
    @Column(name = "phone")
    private String phone;

}
