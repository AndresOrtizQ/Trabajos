package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Inventarios")

public class Inventarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_inventario;
	
	@Column(name="Cantidad", length=11)
	private int cantidad;
	
	@Column(name="Fecha_Ingreso")
	private Date fecha_ingreso;
	
	@Column(name="Fecha_Vencimiento")
	private Date fecha_vencimiento;
	
	@Column(name="Nota", length=200)
	private String nota;
	
	@Column(name="Id_Producto", length=11)
	private int id_producto;
	
	

}
