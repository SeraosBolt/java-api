package com.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlunosRep extends JpaRepository<Alunos, Long> {
    
}
