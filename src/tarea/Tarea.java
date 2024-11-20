package tarea;
import java.util.Scanner;
    
//Author: Diego Mendez
//Abstract: This code contains all the 30 excercises

public class Tarea {

    public static void main(String[] args) {
        System.out.println("Escribe el número del ejercicio que quieres probar");
        Scanner s = new Scanner(System.in);
        boolean check = true;
        while (check) {
            int index = s.nextInt();
            switch (index) {
                case 1 -> Tarea.ejercicio1();
                case 2 -> Tarea.ejercicio2();
                case 3 -> Tarea.ejercicio3();
                case 4 -> Tarea.ejercicio4();
                case 5 -> Tarea.ejercicio5();
                case 6 -> Tarea.ejercicio6();
                case 7 -> Tarea.ejercicio7();
                case 8 -> Tarea.ejercicio8();
                case 9 -> Tarea.ejercicio9();
                case 10 -> Tarea.ejercicio10();
                case 11 -> Tarea.ejercicio11();
                case 12 -> Tarea.ejercicio12();
                case 13 -> Tarea.ejercicio13();
                case 14 -> Tarea.ejercicio14();
                case 15 -> Tarea.ejercicio15();
                case 16 -> Tarea.ejercicio16();
                case 17 -> Tarea.ejercicio17();
                case 18 -> Tarea.ejercicio18();
                case 19 -> Tarea.ejercicio19();
                case 20 -> Tarea.ejercicio20();
                default -> {
                    System.out.println("Cancelado");
                    check=false;
                    //throw new AssertionError();
                }
                    //throw new AssertionError();
            }
        }      
    }
    
    public static void ejercicio1(){
        System.out.println("Hola, ya se imprimir frases");
    }
    public static void ejercicio2(){
        int a = 273;
        System.out.println(a);
    }
    public static void ejercicio3() {
        double a = 5.3;
        System.out.println(a);
    }
    public static void ejercicio4(){
        int a=1234,b=532;
        System.out.println("1234+532= "+(a+b));
    }
    public static void ejercicio5(){
        int a=1234,b=532;
        System.out.println("1234-532= "+(a-b));
    }
    public static void ejercicio6(){
        int a=1234,b=532;
        System.out.println("1234*532= "+(a*b));
    }
    public static void ejercicio7(){
        int a=1234,b=532;
        System.out.println("1234/532= "+(a/b));
    }
    public static void ejercicio8(){
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio9(){
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio10(){
        for (int i = 1; i < 10001; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio11(){
        for (int i = 5; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio12(){
        for (int i = 5; i < 16; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio13(){
        for (int i = 5; i < 15001; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio14(){
        for (int i = 0; i < 201; i++) {
            System.out.println("hola ");
        }
    }
    public static void ejercicio15(){
        for (int i = 0; i < 31; i++) {
            System.out.println(i*i);
        }
    }
    public static void ejercicio16(){
        long a=1;
        for (long i = 1; i < 21; i++) {
            a=a*i;
            System.out.println(i);
        }
        System.out.println("seria :"+a);
    }
    public static void ejercicio17(){
        long a=0;
        for (int i = 1; i < 101; i++) {
            a=a+(i*i);
        }
        System.out.println("seria "+a);
    }
    public static void ejercicio18(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un entero");
        int a=s.nextInt(),sumadoUno=0;
        int total=a;
        System.out.println(a);
        for (int i = 1; i < 101; i++) {
            sumadoUno=a+i;
            total=total+sumadoUno;
            System.out.println("+"+sumadoUno+"="+total);
        }
        System.out.println(total);
    }
    public static void ejercicio19(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en euros(Puede incluir decimales)");
        double a = s.nextDouble();
        double dollar = a*1.06;
        System.out.println("El valor en dolares es: "+dollar);
        System.out.println("1 euro = 1.06 dolares estadounidenses");
    }
    public static void ejercicio20(){
        System.out.println("Ingrese una cantidad de euros(min. 0  max. 999)");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el alto del rectangulo");
        double a = s.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo");
        double b = s.nextDouble();
        System.out.println("El area es de: "+(a*b));
    }
    
}
