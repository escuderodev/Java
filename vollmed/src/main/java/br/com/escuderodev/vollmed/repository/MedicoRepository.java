package br.com.escuderodev.vollmed.repository;

import br.com.escuderodev.vollmed.model.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
