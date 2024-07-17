package com.foroalurajan.foroalurajan.controller.topic;

import jakarta.*;
import org.antlr.v4.runtime.misc.NotNull;

public record DtoCreateTopic(
    @NotNull("Usuario es obligatorio")
    Long idUsuario,
    @NotNull("Título es obligatorio")
    String titulo,
    @NotNull( "Mensaje es obligatorio")
    String mensaje,
    @NotNull("Nombre de curso es obligatorio")
    String nombreCurso,
    @NotNull("Estado de tópico es obligatorio")
    Status status) {

}

