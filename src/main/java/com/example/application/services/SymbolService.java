package com.example.application.services;

import com.example.application.data.Symbol;
import com.example.application.data.SymbolRepository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class SymbolService {

    private final SymbolRepository repository;

    public SymbolService(SymbolRepository repository) {
        this.repository = repository;
    }

    public Optional<Symbol> get(Long id) {
        return repository.findById(id);
    }

    public Symbol update(Symbol entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Symbol> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Symbol> list(Pageable pageable, Specification<Symbol> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
