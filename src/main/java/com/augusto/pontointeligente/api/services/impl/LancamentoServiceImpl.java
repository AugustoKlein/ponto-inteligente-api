package com.augusto.pontointeligente.api.services.impl;

import com.augusto.pontointeligente.api.exception.CustomGenericException;
import com.augusto.pontointeligente.api.model.Lancamento;
import com.augusto.pontointeligente.api.repositories.LancamentoRepository;
import com.augusto.pontointeligente.api.services.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoServiceImpl implements LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Override
    public Lancamento save(Lancamento lancamento) {
        return lancamentoRepository.save(lancamento);
    }

    @Override
    public Lancamento searchById(Long id) {
        Optional<Lancamento> optionalLancamento =  lancamentoRepository.findById(id);

        if(!optionalLancamento.isPresent())
            throw new CustomGenericException("No Lancamento found by the id number given");

        return optionalLancamento.get();
    }

    @Override
    public void remove(Long id) {
        lancamentoRepository.deleteById(id);
    }

    @Override
    public Page<Lancamento> searchByEmployeeId(Long employeeId, PageRequest pageRequest) {
        return lancamentoRepository.findByEmployeeId(employeeId,pageRequest);
    }


}
