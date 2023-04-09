package clases;

public class SubclaseConsulta extends SuperClaseAbstracta {

    @Override
    protected void Transacciones() {
        System.out.println("-------------------------");
        System.out.println("SALDO ACTUAL: " + getSaldo());
    }
}
