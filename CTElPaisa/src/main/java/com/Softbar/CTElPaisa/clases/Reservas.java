package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Reservas")

public class Reservas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_reserva;
	
	@Column(name="Cantidad_Personas", length=11)
	private int cantida_personas;
	
	@Column(name="Fecha_Reserva")
	private Date fecha_reserva;
	
	@Column(name="Horas", length=11)
	private Time hora;
	
	@OneToOne(mappedBy = "Reservas", cascade = CascadeType.ALL)
	private Ventas Ventas;
	
	@OneToOne 
	@JoinColumn(name = "id_Canchas_fk", nullable = false)
	private Canchas Canchas;
}
