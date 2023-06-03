public class Cuenta {
    protected float saldo;
    protected int numero_consignaciones = 0;
    protected int numero_retiros = 0;
    protected float tasa_anual;
    protected float comision_mensual = 0;


    public Cuenta(float saldo, float tasa_anual) {
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        numero_consignaciones = numero_consignaciones + 1;
    }

    public void retirar(float cantidad) {
        float nuevo_saldo = saldo - cantidad;
        if (nuevo_saldo >= 0) {
            saldo -= cantidad;
            numero_retiros = numero_retiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calcular_interes() {
        float tasa_mensual = tasa_anual / 12;
        float interes_mensual = saldo * tasa_mensual;
        saldo += interes_mensual;
    }

    public void extracto_mensual() {
        saldo -= comision_mensual;
        calcular_interes();
    }
}