package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Compras")

public class Compras implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_compra;
	
	@Column(name="Cantidad", length=11)
	private int cantidad;
	
	@Column(name="Fecha_Compra", length=6)
	private Date fecha_compra;
	
	@Column(name="Total", length=11)
	private int total;
	
	@ManyToMany
	@JoinTable(name="detalle_compra",
		joinColumns = @JoinColumn(name="id_Compras_fk",nullable = false),
		inverseJoinColumns = @JoinColumn(name="id_Productos_fk",nullable = false))
	private List<Productos> ListProductos; 
	
	@ManyToOne
	@JoinColumn(name="id_Proveedores_fk",referencedColumnName = "id_proveedor")
	private Proveedores id_Proveedores_fk;
}
