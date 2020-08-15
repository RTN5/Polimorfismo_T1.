/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_t1;

/**
 *
 * @author User
 */

class Sistema_Diagnostico{
    public void Identificar_Fallas_Sistema(){
        System.out.println("Componentes defectuosos");
    }
}

class Sistema_Encendido extends Sistema_Diagnostico{
    public void Identificar_Fallas_Sistema(){
        System.out.println(" Componente defectuoso: Bateía\n");
    }
}

class Sistema_Transmision extends Sistema_Diagnostico{
    public void Identificar_Fallas_Sistema(){
        System.out.println(" Componente defectuoso: Engrenajes defectuosos\n");
    }
}


class Sistema_Frenos extends Sistema_Diagnostico{
    public void Identificar_Fallas_Sistema(){
        System.out.println(" Componente defectuoso: Pastilla de freno\n");
    }
}

class Sistema_Combustible extends Sistema_Diagnostico{
    public void Identificar_Fallas_Sistema(){
        System.out.println(" Componente defectuoso: Bomba de gasolina\n");
    }
}

public class Polimorfismo_T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sistema_Diagnostico SDE = new Sistema_Encendido();
        Sistema_Diagnostico SDT = new Sistema_Transmision();
        Sistema_Diagnostico SDF = new Sistema_Frenos();
        Sistema_Diagnostico SDC = new Sistema_Combustible();
        
        System.out.println("      Universidad de las Fuerzas Armadas ESPE\n");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Materia: Programación [7450] ");
        System.out.println("Alumno: Esteban Morales\n");
        System.out.println("              Polimorfismo ");
        System.out.println("_________________________________________");
        System.out.println("*Sistema defectuoso: Sistema de Encendido");
        SDE.Identificar_Fallas_Sistema();
        
        System.out.println("*Sistema defectuoso: Sistema de Tranmisión");
        SDT.Identificar_Fallas_Sistema();
        
        System.out.println("*Sistema defectuoso: Sistema de Frenos");
        SDF.Identificar_Fallas_Sistema();
        
        System.out.println("*Sistema defectuoso: Sistema de Combustible");
        SDC.Identificar_Fallas_Sistema();
        
        
    }
    
}
