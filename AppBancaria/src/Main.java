import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String UserName = "Juan Carlo";
        String AccountType = "Corriente";
        double bankBalance = 1599.99;
        Scanner input = new Scanner(System.in);
        int exit = 0;
        double transactionValue;

        while(exit!=9){
            System.out.println("********************************");
            System.out.println("Bienvenido " + UserName);
            System.out.println("Tipo de Cuenta = " + AccountType);
            System.out.println("Escriba el número de la opción deseada");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            exit = input.nextInt();
            switch (exit){
                case 1:
                    System.out.println("El saldo actual es de: " + bankBalance + "$");
                    break;
                case 2:
                    System.out.println("Cuál es el valor que desea retirar?");
                    transactionValue = input.nextDouble();
                    if (transactionValue > bankBalance){
                        System.out.println("Saldo insuficiente");
                    } else {
                        bankBalance -= transactionValue;
                        System.out.println("Saldo restante = " + bankBalance + "$");
                    }
                    break;
                case 3:
                    System.out.println("Cuál es el valor que desea depositar?");
                    transactionValue = input.nextDouble();
                    bankBalance += transactionValue;
                    System.out.println("Salgo actualizado = " + bankBalance + "$");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Ingrese un número válido");
            }
        }
    }
}