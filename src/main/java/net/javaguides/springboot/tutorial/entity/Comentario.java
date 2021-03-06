package net.javaguides.springboot.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Comentario {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@NotBlank(message = "El comentario no puede estar vacio")
    @Column(name = "contenido")
    private String contenido;
	
	
}
