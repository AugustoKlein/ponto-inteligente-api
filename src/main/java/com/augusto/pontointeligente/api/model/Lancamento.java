package com.augusto.pontointeligente.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lancamento")
@Data
public class Lancamento {

    public enum Type{
        INICIO_TRABALHO,
        TERMINO_TRABALHO,
        INICIO_ALMOCO,
        TERMINO_ALMOCO,
        INICIO_PAUSA,
        TERMINO_PAUSA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "description")
    private String description;

    @Column(name = "localization")
    private String localization;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "employee_id")
    private Long employeeId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id",referencedColumnName =  "id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT), insertable = false,updatable = false)
    private Employee employee;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "type")
    private Type type;

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
