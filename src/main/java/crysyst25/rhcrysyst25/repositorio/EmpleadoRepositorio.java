/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crysyst25.rhcrysyst25.repositorio;

import crysyst25.rhcrysyst25.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Cristianvilla
 */
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer>{
    
    
}
