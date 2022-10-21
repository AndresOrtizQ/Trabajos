package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Categorias")

public class Categorias implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_categoria;
	
	@Column(name="Categoria", length=255)
	private String nombre_categoria;
	
	@OneToMany(mappedBy = "id_Categorias_fk")
	private List<Productos> ListProductos;
	
}
