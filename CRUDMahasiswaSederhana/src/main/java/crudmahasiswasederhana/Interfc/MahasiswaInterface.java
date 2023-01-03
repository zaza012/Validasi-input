/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudmahasiswasederhana.Interfc;

import crudmahasiswasederhana.db.Models.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Fikri Fahmi Azim
 * 21103088
 * SI 05 C
 */
public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update (Mahasiswa o) throws SQLException;
    void delete (String nim) throws SQLException;
    List<Mahasiswa> getAll() throws SQLException;
    
}
