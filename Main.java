/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import clases.SubclaseConsulta;
import clases.SuperClaseAbstracta;

/**
 *
 * @author DevBuster
 */
public class Main {

    public static void main(String[] args) {
        SuperClaseAbstracta mensajero = new SubclaseConsulta();
        mensajero.setSaldo(10000);
        mensajero.Operar();
    }
}
