package com.example.Actividad2.Actividad2.domain;

import java.util.List;

public interface CochesRepository {
    public List<Coche> getAll();
    public boolean addCoche(Coche coche);
}
