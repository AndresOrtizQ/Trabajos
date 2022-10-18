package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Pedidos")

public class Pedidos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_pedido;
	
	@Column(name="Cantidad", length=11)
	private int cantidad;
	
	@Column(name="Precio", length=11)
	private int precio;
	
	@Column(name="Total", length=11)
	private int total;
	
	@Column(name="Fecha_Pedido", length=6)
	private Date fecha_pedido;
	
	@Column(name="Id_Producto", length=11)
	private int id_producto;
}
