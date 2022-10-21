package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="Pagos")

public class Pagos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_Pagos;
	
	@OneToOne 
	@JoinColumn(name = "id_Ventas_fk", nullable = false)
	private Ventas Ventas;
	
	@OneToOne 
	@JoinColumn(name = "id_Formas_Pago_fk", nullable = false)
	private Formas_Pago Formas_Pago;
	
}
