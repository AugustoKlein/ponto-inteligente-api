package com.augusto.pontointeligente.api.repositories;

import com.augusto.pontointeligente.api.model.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

@Transactional(readOnly = true)
@NamedQueries({
        @NamedQuery(name = "LancamentoRepository.findByEmployeeId",
                query = "SELECT l FROM Lancamento l WHERE l.employee.id = :employeeId")
})
public interface LancamentoRepository extends JpaRepository<Lancamento,Long> {


    List<Lancamento> findByEmployeeId(@Param("employeeId") Long employeeId);

    Page<Lancamento> findByEmployeeId(@Param("employeeId") Long employeeId, Pageable pageable);
}