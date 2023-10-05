package com.example.Actividad2.Actividad2.infrastructure.data;

import com.example.Actividad2.Actividad2.domain.Coche;
import com.example.Actividad2.Actividad2.domain.CochesRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CochesRepositorySQL implements CochesRepository {
    public CochesRepositorySQL(){

    }

    @Override
    public List<Coche> getAll() {
        List<Coche> coches = new ArrayList<>();
        try {
            Statement stmnt = DBconecction.getInstance().createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM coches");
            while (rs.next()){
                Coche coche = new Coche(
                        rs.getString("matricula"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("km")
                );
                coches.add(coche);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return coches;
    }

    @Override
    public boolean addCoche(Coche coche) {
        return false;
    }
}
