/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.emperador.operacion;

/**
 *
 * @author Paola Figueroa.
 */
public class Operacion {
 
    /**    
     * Separa una cadena de texto a partir de la expresión "," y " ". 
     * @param input split
     */
    
    public static void listaalumnos(String input) {
    String[] estudiantes = input.split(",");
        
      for (String estudiante : estudiantes) {
            String[] partes = estudiante.split(" ");
            String id = partes[0];
            String primerNombre = partes[3];
            String primerApellido = partes[1];
            
            System.out.println("[ID:" + id + "][Nombre y apellido: " + primerNombre + " " + primerApellido + "]");
        }
    }
}