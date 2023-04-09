package clases;

public class SubclaseDeposito extends SuperClaseAbstracta {

    @Override
    protected void Transacciones() {
        System.out.println("-------------------------");
        System.out.print("CUANTO DESEA DEPOSITAR?: ");
        Depositar();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);

        System.out.println("DEPOSITASTE: " + deposito);
        System.out.println("SALDO ACTUAL: " + getSaldo());
    }
}
