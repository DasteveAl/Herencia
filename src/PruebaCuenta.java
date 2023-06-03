import java.util.*;
public class PruebaCuenta {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial = $ ");
        float saldo_inicial_ahorros = input.nextFloat();
        System.out.println("Ingrese tasa de interes = ");
        float tasa_ahorros = input.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldo_inicial_ahorros, tasa_ahorros);
        System.out.println("Ingresar Cantidad a consignar: $ ");
        float cantidad_depositar = input.nextFloat();
        cuenta1.consignar(cantidad_depositar);
        System.out.println("Ingresar cantidad a retirar: $ ");
        float cantidad_retirar = input.nextFloat();
        cuenta1.retirar(cantidad_retirar);
        cuenta1.extracto_mensual();
        cuenta1.imprimir();
    }
}
