/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.emperador.ui;

import java.util.Scanner;
import mx.itson.emperador.operacion.Operacion;
/**
 *
 * @author Paola Figueroa
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa la cadena de texto: ");
        String input = scanner.nextLine();
        
        Operacion.listaalumnos(input);
        
    }
}