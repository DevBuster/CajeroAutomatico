package clases;

import java.util.Scanner;

/**
 *
 * @author DevBuster
 */
public abstract class SuperClaseAbstracta {

    // protected porque se usará la herencia
    protected int transacciones, retiro, deposito;

    // solo se puede acceder a esta variable dentro de esta clase
    private static int saldo;

    Scanner entrada = new Scanner(System.in);

    // opciones de menu
    public void Operar() {
        int estado = 0;
        int seleccion = 0;

        // creamos las opciones de menu para el usuario
        do {
            do {
                System.out.println("-------------------------");
                System.out.println("SELECCIONE UNA OPCION:");
                System.out.println("1. Consulta de saldo");
                System.out.println("2. Retiro de efectivo");
                System.out.println("3. Deposito de efectivo");
                System.out.println("4. Salir");
                System.out.println("-------------------------");

                System.out.print("OPCION: ");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    estado = 1;
                } else {
                    System.out.println("-------------------------");
                    System.out.println("ERROR: NO EXISTE EL MENU");

                }

            } while (estado == 0);

            if (seleccion == 1) {
                estado = 1;
                SuperClaseAbstracta mensajero = new SubclaseConsulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                SuperClaseAbstracta mensajero = new SubclaseRetiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                SuperClaseAbstracta mensajero = new SubclaseRetiro();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("VUELVA PRONTO");
                estado = 2;
            }
        } while (estado != 2);
    }

    // solicitar monto para retirar
    protected void Retirar() {
        retiro = entrada.nextInt();
    }

    // solicitar monto pra depositar
    protected void Depositar() {
        deposito = entrada.nextInt();
    }

    // implementar polimorfismo
    protected abstract void Transacciones();

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        SuperClaseAbstracta.saldo = saldo;
    }
}
