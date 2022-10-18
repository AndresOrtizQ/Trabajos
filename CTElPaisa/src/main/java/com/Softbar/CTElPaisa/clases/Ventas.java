package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Ventas")

public class Ventas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_venta;
	
	@Column(name="Valor_Total", length=11)
	private int valor_total;
	
	@Column(name="Id_domicilio", length=11)
	private int id_domicilio;
	
	@Column(name="Id_reserva", length=11)
	private int id_reserva;
}
