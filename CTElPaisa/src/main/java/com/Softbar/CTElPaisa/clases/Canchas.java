package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Canchas")

public class Canchas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_cancha;
	
	@Column(name="Nombre_Cancha", length=250)
	private String nombre_cancha;
	
}
