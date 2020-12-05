package com.mycompany.mavenproject2;
import java.util.GregorianCalendar;




public class Main {
    public static void main(String args[]){
        Cliente cliente1 = new Cliente("Fulano","9999","Rua A");
        Cliente cliente2 = new Cliente("Ciclano","8888","Rua B");
        Pedido pedido1 = new Pedido(01, 500 ,cliente1, 0);
        Pedido pedido2 = new Pedido(02 ,500 ,cliente2, 1);
        System.out.println(pedido1.toString());
        System.out.println(pedido2.toString());
      
    }
}

