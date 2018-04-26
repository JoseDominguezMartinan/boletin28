/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin28
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Alumno alumno=new Alumno();
        
        alumno.setNome("Jose");
        alumno.setNota(9);
        alumno.setEnderezo(alumno.modificarEnderezo("Pazos",4));
        alumno.amosar();
        alumno.cambiarNota(10);
        alumno.setEnderezo(alumno.modificarEnderezo("Garcia Barbón",4));
        alumno.amosar();
        
        
    }
    
}
