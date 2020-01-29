package net.javaguides.springboot.tutorial.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Entrada {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@NotBlank(message = "El Título es obligatorio")
    @Column(name = "titulo")
    private String titulo;
    
    @NotBlank(message = "Coloca algún Contenido")
    @Column(name = "contenido")
    private String contenido;

    @Column(name = "phone_no")
    private long phoneNo;
    
    @OneToMany(
    		cascade = CascadeType.ALL,
            orphanRemoval = true
    		)
    private List<Comentario> comentarios = new ArrayList<>();
    
}
