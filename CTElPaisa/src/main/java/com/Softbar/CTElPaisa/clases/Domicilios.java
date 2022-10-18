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
	
	@Column(name="Id_Pedido", length=11)
	private int id_pedido;
	
	@Column(name="Id_Usuario", length=11)
	private int id_usuario;
	
	
	
}
