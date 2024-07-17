package com.foroalurajan.foroalurajan.controller.topic;

import com.foroalurajan.foroalurajan.controller.user.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autorx_id")
    private Usuario autorx;

    private String nombreCurso;

    public Topico(
            String titulo,
            String mensaje,
            Status status,
            Usuario autorx,
            String nombreCurso
    ){
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.status = status;
        this.autorx = autorx;
        this.nombreCurso = nombreCurso;
        this.fecha=LocalDateTime.now();

    }

    public void actualizarDatos(DtoUpdateTopico dtoUpdateTopico) {
        if(dtoUpdateTopico.titulo()!=null){
            this.titulo = dtoUpdateTopico.titulo();
        }
        if(dtoUpdateTopico.mensaje()!=null){
            this.mensaje = dtoUpdateTopico.mensaje();
        }
        if(dtoUpdateTopico.nombreCurso()!=null){
            this.nombreCurso = dtoUpdateTopico.nombreCurso();
        }
    }
}