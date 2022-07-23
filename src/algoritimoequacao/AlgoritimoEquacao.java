
package algoritimoequacao;
//Equacao de 3 grau
//Autor: Gabriel Henriques Sales
//IDE: Apache NetBeans
//20/07/2022
import java.util.Scanner;
public class AlgoritimoEquacao {
public static void main(String[] args) {
    //Declarando novo Scanner
    Scanner sc = new Scanner(System.in);
    // Variaveis
    double A,B,C,D,X1,X2;
    //Declarando as variaveis
    System.out.println("Valor de A");
    A = sc.nextDouble();
    System.out.println("Valor de B");
    B = sc.nextDouble();
    System.out.println("Valor de C");
    C = sc.nextDouble();
    D = B*B - 4*A*C;
    if(D >= 0){
    System.out.println("Valor de Delta = " + D);
    X1 =(B + Math.sqrt(D))/(2*A);
    X2 =(B - Math.sqrt(D))/(2*A);
    System.out.println("Valor de X1: " + X1);
    System.out.println("Valor de X2: " + X2);
    }else{System.out.print("Valor nao corresponde ao nescessario");
    
    //fimalgoritimo, tempo decorrido 26:07 minutos.
        }
    }
}
    
    
    
  
 


