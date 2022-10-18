package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Formas_Pago")

public class Formas_Pago implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_formas;
	
	@Column(name="Forma_De_Pago", length=250)
	private String nombre_forma;

}
