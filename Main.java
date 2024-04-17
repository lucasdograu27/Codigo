importar java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner=eu new Scanner();
    int num1=eu.nextInt();
    int num2=eu.nextInt();
    char operador=eu.next().charAt(0)
    if(operador=="+"){
      System.out.printl(soma(num1,  n um2));
    } else if (operador=="-"){
       System.out.printl(subtracao(  num1,num2));
    }
    else if (operador=="*"){
       System.out.printl(  multiplica cao(num1,num2));
    }
    else if (operador=="/"){
       System.out.printl(divisao(  nu m1,num2));
    }
    }
  }
public static int soma (int a, int b){
  return a+b;
 
}
public static int multiplicação (int a, int b){
  return a*b;
 
}
public static int subtração (int a, int b){
  return ab;
 
}
public static int divisão (int a, int b){
  return a/b;
 
}
