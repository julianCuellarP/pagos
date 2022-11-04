package co.edu.unisabana.pagos.service;

import co.edu.unisabana.pagos.controller.Pago;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "sabana.arquitectura2")
    public void receive(@Payload Pago pago) {
        log.info("sabana.arquitectura2: {}", pago.getMonto());
    }

    @RabbitListener(queues = "unisabana.pagos.procesar")
    public void receiv2e(@Payload Pago pago) {
        log.info("Escuche de la cola unisabana.pagos.procesar {}", pago.getMonto());
    }


}
