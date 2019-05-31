/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner; //Esto es una libreria

/**
 *
 * @author Alriosa
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        
          //VARIABLES
          /* 
          ESTO ES UN COMENTARIO DE LINEA MULTIPLE
          */
        int variable; //Variable del tipo Entero
        int variableInicializada =1; //Variable del tipo entero inicializada
        float soyUnDecimal; //Variable del tipo decimal
        double soyOtroDecimal=3.14; //variable del tipo decimal
        boolean soyVerdero=true; //Variable del tipo booleana (True o False)
        String variableTexto="1"; //Variable del tipo texto
        
        System.out.println("Ingrese un numero");//Esto es una impresion
        
        variable = in.nextInt(); //Con esto hago que el usuario ingrese o almecene informacion en esa variable
        System.out.println("El numero ingresado fue: " + variable);
    }
    
}
