public class CuentaCorriente extends Cuenta {
    float sobre_giro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobre_giro = 0;
    }

    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if (resultado < 0) {
            sobre_giro = sobre_giro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobre_giro - cantidad;
        if (sobre_giro > 0) {
            if (residuo > 0) {
                sobre_giro = 0;
                saldo = residuo;
            } else {
                sobre_giro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comision_mensual);
        System.out.println("Numero de transacciones = " +
                (numero_consignaciones + numero_retiros));
        System.out.println("Valor sobregiro = $ " +
                (numero_consignaciones + numero_retiros));
        System.out.println();
    }
}
