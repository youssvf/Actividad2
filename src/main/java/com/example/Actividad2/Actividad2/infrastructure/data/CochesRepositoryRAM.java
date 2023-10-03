package com.example.Actividad2.Actividad2.infrastructure.data;

import com.example.Actividad2.Actividad2.domain.Coche;
import com.example.Actividad2.Actividad2.domain.CochesRepository;

import java.util.ArrayList;
import java.util.List;

public class CochesRepositoryRAM implements CochesRepository {

    public List<Coche> coches = new ArrayList<>();
    public CochesRepositoryRAM(){
        coches.add(new Coche("4387JXM","Seat","Leon",432354));
        coches.add(new Coche("3454DKL","Ford","Mondeo",4));
        coches.add(new Coche( "1089LXF","Volkswagen","Passat",65443));
    }

    @Override
    public List<Coche> getAll() {
        return this.coches;
    }

    @Override
    public boolean addCoche(Coche coche) {
        return this.coches.add(coche);
    }

}
