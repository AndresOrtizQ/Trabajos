package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Proveedores")

public class Proveedores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_proveedor;
	
	@Column(name="Nombre_Proveedor", length=50)
	private String nombre_proveedor;
	
	@Column(name="Articulo", length=200)
	private String articulo;
	
	@OneToMany(mappedBy = "id_Proveedores_fk")
	private List<Compras> ListCompras;
}
