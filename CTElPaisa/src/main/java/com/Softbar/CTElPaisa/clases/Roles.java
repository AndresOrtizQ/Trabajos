package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Roles")

public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_Rol;
	
	@Column(name="Nombre_Rol", length=255)
	private String nombres_rol;
	
	@OneToMany(mappedBy = "id_roles_fk")
	private List<Usuarios> ListUsuarios;
}
