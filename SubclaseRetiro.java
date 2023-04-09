package clases;

public class SubclaseRetiro extends SuperClaseAbstracta {

    @Override
    protected void Transacciones() {
        System.out.print("CUANTO DESEA RETIRAR?: ");
        Retirar();

        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);

            System.out.println("-------------------------");
            System.out.println("RETIRASTE: " + retiro);
            System.out.println("SALDO ACTUAL: " + getSaldo());

        } else {
            System.out.println("-------------------------");
            System.out.println("ERROR: SALDO INSUFICIENTE");
        }
    }
}
