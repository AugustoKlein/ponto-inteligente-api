package com.augusto.pontointeligente.api.services;

import com.augusto.pontointeligente.api.model.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public interface LancamentoService {

    Lancamento save(Lancamento lancamento);

    Lancamento searchById(Long id);

    void remove(Long id);

    Page<Lancamento> searchByEmployeeId(Long employeeId, PageRequest pageRequest);
}
