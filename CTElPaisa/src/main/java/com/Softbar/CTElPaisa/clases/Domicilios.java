package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Domicilios")

public class Domicilios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_domicilio;
	
	@Column(name="Fecha_Entrega", length=6)
	private Date fecha_entrega;
	
	@Column(name="Hora")
	private Time hora;
		
	@ManyToOne
	@JoinColumn(name="id_Usuarios_fk",referencedColumnName = "id")
	private Usuarios id_Usuarios_fk;
	
	@OneToOne(mappedBy = "Domicilios", cascade = CascadeType.ALL)
	private Pedidos Pedidos;
	
	@OneToOne(mappedBy = "Domicilios", cascade = CascadeType.ALL)
	private Ventas Ventas;
	
}
