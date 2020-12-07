package com.mycompany.mavenproject2;
import java.util.GregorianCalendar;

public class Pedido {

        int numero;
        float preco;
        GregorianCalendar dataDeEntrega = new GregorianCalendar();
        Cliente cliente;
        int tipoDeEntrega;
        
        public Pedido(int numero, float preco, Cliente cliente, int tipoDeEntrega){
            this.numero = numero;
            this.preco = preco;
            this.cliente = cliente;
            this.tipoDeEntrega = tipoDeEntrega; //Entrega com valor 0 é a comum, com valor 1 é a expressa ;
            if(tipoDeEntrega == 1 ){
              
               preco = preco + preco*0.2f;
               this.preco = preco;
            }
            else{
                this.dataDeEntrega.add(this.dataDeEntrega.DAY_OF_MONTH,3);
            }
           
        }

    public int getNumero() {
        return numero;
    }

    public float getPreco() {
        return preco;
    }

    public GregorianCalendar getDataDeEntrega() {
        return dataDeEntrega;
    }
    
    public boolean verificaExpresso(){
        GregorianCalendar aux = new GregorianCalendar();
        if(tipoDeEntrega == 1 ) return true;
                else return false;
     /*GregorianCalendar aux = new GregorianCalendar();
       int i = aux.compareTo(dataDeEntrega);
       if(i == 1 ) return true;
                else return false;
*/
       
    }
     public String toString(){ 
        if(this.verificaExpresso()){
            return "Pedido Nº:" + this.numero + ". O Cliente:" + this.cliente.nome + " Realizou um pedido no valor de " + this.preco + " que foi entregue na data:" + this.dataDeEntrega.toZonedDateTime() + " De forma Expressa";
        }
        else{
           return "Pedido Nº:" + this.numero + ". O Cliente:" + this.cliente.nome + " Realizou um pedido no valor de " + this.preco + " que foi entregue na data:" + this.dataDeEntrega.toZonedDateTime() + " De forma Normal";
        }
    }
    
}
    
