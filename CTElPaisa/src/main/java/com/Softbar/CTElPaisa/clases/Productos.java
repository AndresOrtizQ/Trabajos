package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Productos")

public class Productos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_producto;
	
	@Column(name="Id_Categoria", length=11)
	private int id_categoria;
	
	@Column(name="Nombre_Productos", length=50)
	private String nombre;
	

}
