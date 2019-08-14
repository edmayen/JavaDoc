/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;
/**
 *Clase para probar el concepto de JavaDoc
 * @author edmayen
 * version: 1.0
 */
public class EjemploJavaDoc {

    /**
     * Metodo para probar el concepto de JavaDoc
     * @param args argumentos de la linea de comandos 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado=new Aritmetica(3,3).sumar();
        System.out.println("Resultado: "+resultado);
    }
    
}
