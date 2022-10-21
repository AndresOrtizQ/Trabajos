package com.Softbar.CTElPaisa.clases;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Usuarios")

public class Usuarios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id ;
	
	@Column(name="Nombre", length=50)
	private String nombre;
	
	@Column(name="Apellido", length=50)
	private String apellido;
	
	@Column(name="Correo_Electronico", length=50)
	private String correo_electronico;
	
	@Column(name="Contraseña", length=50)
	private String contraseña;
	
	@Column(name="Identificacion", length=11)
	private String identificacion;
	
	@Column(name="Rol", length=50)
	private String rol;
	
	@Column(name="Telefono", length=10)
	private String telefono;
	
	@Column(name="Edad", length=11)
	private int edad;
	
	@Column(name="Nombre_Rol", length=11)
	private int nombre_rol;
	
	@ManyToOne
	@JoinColumn(name="id_roles_fk",referencedColumnName = "id_Rol")
	private Roles id_roles_fk;
	
	@OneToMany(mappedBy = "id_Usuarios_fk")
	private List<Domicilios> ListDomicilios;
	
}
