/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.estudiantes;

import ec.edu.espoch.estudiantes.estudiantes.Cursos;
import ec.edu.espoch.estudiantes.estudiantes.Estudiantes;

/**
 *
 * @author SO-LAB1-PC24
 */
public class ComunicacionObj {
    
    public static void main(String[] args) {
        Estudiantes objEstudiantes = new Estudiantes();
        objEstudiantes.setNombre("Karen");
        objEstudiantes.setApellido("Maje");
        
        Cursos objCurso = new Cursos();
        objCurso.setNombre("Programacion Orientada a Objetos "); 
        objCurso.agregarEstudiante(objEstudiantes);
    }
}
