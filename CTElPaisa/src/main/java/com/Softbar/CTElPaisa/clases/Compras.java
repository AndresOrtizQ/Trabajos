package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.Date;
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
	
	@Column(name="Id_Proveedor", length=11)
	private int id_proveedor;
	
}
