/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crysyst25.rhcrysyst25.servicio;
import crysyst25.rhcrysyst25.modelo.Empleado;
import java.util.List;

/**
 *
 * @author Cristianvilla
 */
public interface IEmpleadoServicio {
    public List<Empleado>listarEmpleados();
    public Empleado buscarEmpleadoPorId(Integer idEmpleado);
    public Empleado guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
    
}
