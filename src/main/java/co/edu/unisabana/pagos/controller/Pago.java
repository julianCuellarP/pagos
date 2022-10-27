package co.edu.unisabana.pagos.controller;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Pago {
    public Pago(String pago) {
        this.pago = pago;
    }

    public Pago() {

    }

    String pago;

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getPago() {
        return pago;
    }

}
