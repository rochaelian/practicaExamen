package com.cenfotec.crud.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Workshop {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;	
	
	private String name;
	private String autor;
	private String objetivo;
	private String categoria;
	private String tiempoDuracion;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="workshop")
	private Set<Tarea> tareas;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTiempoDuracion() {
		return tiempoDuracion;
	}
	public void setTiempoDuracion(String tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}
	
	public Set<Tarea> getTareas() {
		return tareas;
	}
	public void setTareas(Set<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	
}
