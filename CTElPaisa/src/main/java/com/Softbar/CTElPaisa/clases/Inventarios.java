package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	
	@OneToMany(mappedBy = "id_Inventarios_fk")
	private List<Productos> ListProductos;

}
