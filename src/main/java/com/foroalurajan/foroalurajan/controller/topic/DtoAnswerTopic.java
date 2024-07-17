package com.foroalurajan.foroalurajan.controller.topic;

import java.time.LocalDateTime;

public record DtoAnswerTopic(Long id,
                             String titulo,
                             String mensaje,
                             Status status,
                             String autorx,
                             String nombreCurso,
                             LocalDateTime fecha) {
}
