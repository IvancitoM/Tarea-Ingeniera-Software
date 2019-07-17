/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author Héctor Morales
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mes, dia, anio;
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Calcular la edad de una persona");//preguntamos dia, mes y año de nacimiento
        System.out.println("Día de nacimiento");
        dia = sca.nextInt();
        System.out.println("Mes de nacimiento");
        mes = sca.nextInt();
        System.out.println("Año de nacimiento");
        anio = sca.nextInt();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(anio), fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                            periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }
    
}
