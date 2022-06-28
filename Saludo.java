import java.util.Scanner;


public class Saludo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Este es un comentario de una linea
        /*Este es un comentario 
        de multiples lineas */
        
        /*
        // Imprimir en consola
        
        System.out.println("Saludos"); 
        
        // Tipos de variables en Java
        // Enteros
        
        // Int: almacena hasta 32 bits
        int Cajita = 5; // Se declara y define la variable de entero
        int Cajita_2;
        Cajita_2 = 9; // Se pueden declarar y definir variables en sentencias aparte
        System.out.println(Cajita);
        System.out.println(Cajita_2);
        System.out.println("El valor de la cajita es: "+Cajita);
        
        // Byte: almacena hasta 8 bits
        byte Cajita_3;
        
        // Short: almacena hasta 16 bits
        short Cajita_4;
        
        //Long: almacena hasta 64 bits 
        long Cajita_5;
        
        // Flotantes 
        
        // Float
        float Cajita_6;
        
        // Double
        double Cajita_7;
        
        // Caracteres 
        
        // Char
        char letra = 'a';
        System.out.println("El valor de letra es: " + letra);
        
        // Booleanos
        boolean valor = true;
        System.out.println("El valor del booleano es " + valor);
        
        // Datos no primitivos: aquellos a los cuales se les aplican metodos
        
        String nombre = "Jaime"; // No funciona con comillas sencillas a diferencia de Char
        
        Integer Caja = 55;
        System.out.println(nombre);
        System.out.println("Caja + Cajita: "+Cajita+Caja); // Concatenacion de variables
        System.out.println(Caja+Cajita); // Suma de enteros
        
        // Constantes
        
        final int Caja_Constante = 7;
        // Caja_Constante = 6; Manda error ya que es inmutable
        
        // Los floats no se pueden establecer como constantes, se usa double para decimales
        
        final double pi = 3.1416;
        System.out.println(Caja_Constante);
        System.out.println(pi); 
        
        
        // Inputs
        
        int entero; // Declaramos una variable de entero
        float flotante;
        String nombre;
        String nombre_completo;
        char letra;
        
        // Enteros: 
        
        System.out.println("Ingrese un entero: ");
        
        Scanner entrada = new Scanner(System.in); // En el bombillo que sale en la linea de codigo, importamos la clase scanner y le asignamos a entrada una instancia de esta
        entero = entrada.nextInt(); // A la variable numero, le aplicamos el metodo .nextInt, para asi poder ingresar en esta lo que el usuario digite
        System.out.println("Ingreso el numero "+entero);
        
        // Flotantes:
        
        System.out.println("Ingrese un flotante: ");
        
        Scanner entrada_2 = new Scanner(System.in);
        
        flotante = entrada_2.nextFloat(); // El metodo para hacer inputs con floats
        
        System.out.println("Ingreso el flotante "+flotante);
        
        // Strings: 
        
        System.out.println("Ingrese el nombre: ");
        
        Scanner entrada_3 = new Scanner(System.in);
        
        nombre = entrada_3.next(); // Para strings, usamos el metodo .next (Este solo lee la primera palabra ingresada)
        
        System.out.println("Ingreso el nombre "+nombre);
        
        System.out.println("Ingrese su nombre completo: ");
        
        Scanner entrada_4 = new Scanner(System.in); 
        
        nombre_completo = entrada_4.nextLine(); // Este metodo lee las diferentes palabras del string
        
        System.out.println("Ingreso el nombre completo "+nombre_completo);
        
        // Chars: 
        
        System.out.println("Ingrese una letra: ");
        
        Scanner entrada_5 = new Scanner(System.in);
        
        letra = entrada_5.next().charAt(0); // Ademas del metodo .next() que nos ayuda a ingresar en letra lo que el usuario digite, el metodo .chartAt() solo extrae la posicion indicada de la cadena ingresada
        System.out.println("Ingreso la letra "+letra);

        
        // Operadores incrementales 
        
        int numero = 5;
        numero = numero + 1; // forma tradicional
        System.out.println("El valor de numero es: "+numero);
        numero += 4; // suma
        numero -= 1; // resta  
        System.out.println("El valor de numero es: "+numero);
        numero *= 2; // multiplicacion
        System.out.println("El valor de numero es: "+numero);
        numero /= 2; // division
        System.out.println("El valor de numero es: "+numero);
        numero %= 9; // modulo 
        System.out.println("EL valor de numero es: "+numero);

        
        // Condicionales IF ELSE
        int a = 12;
        int b = 5;
        
        if (a>b) {
            System.out.println("a es mayor que b");
        }
        else {
            System.out.println("b es mayor que a");
        }
        
        int edad = 8;
        
        if (edad>=18) {
            System.out.println("Es mayor de edad"); 
        }
        else {
            System.out.println("Es menor de edad");
        }

        
        // Condicionales switch 
        
        int a; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numerp entre 1 y 4: ");
        a = sc.nextInt();
        
        switch (a) {
            case 1: System.out.println("a vale 1");
            break;
            case 2: System.out.println("a vale 2");
            break;
            case 3: System.out.println("a vale 3");
            break;
            case 4: System.out.println("a vale 4");
            break; 
            default: System.out.println("debe ingresar un numero entre 1 y 4"); // el else del switch
        }

        
        // Ciclo while 
        
        int contador =  1;
        
        while (contador <= 10) {
            System.out.println("Estoy contando el numero "+contador);
            contador ++; // Incremento para contadores
        }

        // Ciclo do while
        
        int contador = 100;
        
        do {
            System.out.println("Ahora valgo "+contador);
            contador ++;
        } while (contador <= 10);
        
        // La diferencia con while radica en que como primero se ejecutan las instrucciones y despues se verifica el condicional, si este no se cumple, las instrucciones se ejecutan una vez
*/
        
        // Ciclo for
        
        for (int i = 1; i<=10; i++) { // For no necesita establecer contador previo porque este ya se encuentra en sus parametros
            System.out.println("Ahora valgo "+i);
        }
        System.out.println("Se acabo el ciclo");
        
        for (int evilI = 10; evilI >= 1; evilI--) {
            System.out.println("Voy en reversa y valgo "+evilI);     
        }
        System.out.println("Se acabo el anticiclo");

    }
    
}
