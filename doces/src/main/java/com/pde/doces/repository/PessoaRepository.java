package com.pde.doces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pde.doces.model.pessoa;

public interface PessoaRepository extends JpaRepository <pessoa, Long> {
}
