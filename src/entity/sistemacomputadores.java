package entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class sistemacomputadores {
	
	private int idsistemacomputadores;
	private String nombre;
	private String codigo;
	private String marca;
	private String modelo;
	private String procesador;
	private String ram;
	private String discoDuro;
	private String precio;
	private String estado;
	private tipocomputador tipocomputador;

}
