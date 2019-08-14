/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.javadoc;

/**
 *Esta clase permite realizar operaciones de aritmetica como sumar, restar
 * 
 * 
 * @author edmayen
 * version: 1.0
 */
public class Aritmetica {
    /**
     * primer Operando
     */
    int operadorA;
    
    /**
     * segundo Operador
     */
    int operadorB;
    
    /**
     * Constructor vacio en la clase
     */
    public Aritmetica(int a, int b)
    {
        this.operadorA=a;
        this.operadorB=b;
    }
    
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma 
     */
    public int sumar()
    {
        return operadorA+operadorB;
    }
}
