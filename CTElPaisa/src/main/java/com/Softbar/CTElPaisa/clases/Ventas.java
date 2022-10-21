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
	
	@OneToOne 
	@JoinColumn(name = "id_Domicilios_fk", nullable = false)
	private Domicilios Domicilios;
	
	@OneToOne 
	@JoinColumn(name = "id_Reservas_fk", nullable = false)
	private Reservas Reservas;
	
	@OneToOne(mappedBy = "Ventas", cascade = CascadeType.ALL)
	private Pagos Pagos;
}
