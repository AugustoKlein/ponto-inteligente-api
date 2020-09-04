package com.augusto.pontointeligente.api.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    public enum Perfil{
    ROLE_ADMIN,ROLE_USUARIO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "tax_number")
    private String taxNumber;

    @Column(name = "value_hour")
    private BigDecimal valueHour;

    @Column(name = "quantity_hours_of_work")
    private Float quantityHoursOfWork;

    @Column(name = "quantity_hours_of_lunch")
    private Float quantityHoursOfLunch;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil",nullable = false)
    private Perfil perfil;

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;

   @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private List<Lancamento> lancamentos;

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
