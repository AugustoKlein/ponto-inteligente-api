package com.augusto.pontointeligente.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "company")
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "company_name", nullable = false)
    private String compayName;

    @Column(name = "tax_number", nullable = false)
    private String taxNumber;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee>  employees;

    @PreUpdate
    public void preUpdate(){
        updatedDate = new Date();
    }

    @PrePersist
    public  void prePersist(){
        updatedDate = new Date();
        creationDate = new Date();
    }

}
