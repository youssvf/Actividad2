package com.example.Actividad2.Actividad2.application;

import com.example.Actividad2.Actividad2.domain.Coche;
import com.example.Actividad2.Actividad2.domain.CochesRepository;

import java.util.List;

public class CochesUseCases implements CochesRepository {
    private CochesRepository cochesRepository;

    public CochesUseCases(CochesRepository cochesRepository){
        this.cochesRepository = cochesRepository;
    }

    @Override
    public List<Coche> getAll() {
        return this.cochesRepository.getAll();
    }

    @Override
    public boolean addCoche(Coche coche) {
        return this.cochesRepository.addCoche(coche);
    }
}
