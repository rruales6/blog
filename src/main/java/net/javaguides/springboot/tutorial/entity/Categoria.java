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
public class Categoria {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	 @NotBlank(message = "El Nombre es obligatorio")
	    @Column(name = "nombre")
	    private String name;
	 
	 @OneToMany(
	    		cascade = CascadeType.ALL,
	            orphanRemoval = true
	    		)
	    private List<Entrada> Entradas = new ArrayList<>();
}
