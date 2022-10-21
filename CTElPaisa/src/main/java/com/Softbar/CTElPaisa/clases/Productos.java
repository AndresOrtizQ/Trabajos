package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.List;

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
	
	@Column(name="Nombre_Productos", length=50)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_Pedidos_fk",referencedColumnName = "id_pedido")
	private Pedidos id_Pedidos_fk; 
	
	@ManyToOne
	@JoinColumn(name="id_Categorias_fk",referencedColumnName = "id_categoria")
	private Categorias id_Categorias_fk;
	
	@ManyToOne
	@JoinColumn(name="id_Inventarios_fk",referencedColumnName = "id_inventario")
	private Inventarios id_Inventarios_fk;

	@ManyToMany(mappedBy = "ListProductos" )
	private List<Compras> ListCompras;
}
