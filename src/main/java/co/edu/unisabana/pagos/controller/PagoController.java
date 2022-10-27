package co.edu.unisabana.pagos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@RefreshScope
public class PagoController {

    @Value("${propiedad1}")
    private String valor;

    @Autowired
    private Data pago;

    @PostMapping("/pay")
    public String pagar() {

        return pago.getPago() + " Hola Mundo VOLVI MAS FUERTE " + valor;
    }
}
