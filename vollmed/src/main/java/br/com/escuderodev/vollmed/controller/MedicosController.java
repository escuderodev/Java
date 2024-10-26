package br.com.escuderodev.vollmed.controller;

import br.com.escuderodev.vollmed.model.medico.DadosCadastroMedico;
import br.com.escuderodev.vollmed.model.medico.Medico;
import br.com.escuderodev.vollmed.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicos")
public class MedicosController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void create(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}
