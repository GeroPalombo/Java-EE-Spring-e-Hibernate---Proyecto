package com.jee.eagenda.vista.resources.vo;

import java.util.Date;
import lombok.Data;

/**
 * Clase que representa la tabla reserva
 * @author GeroPalombo
 *
 */
@Data
public class ReservaVO {
	private String codigoRes;
	private Date fechaIngresoRes;
	private Date fechaSalidaRes;
	private int cantidadPersonasRes;
	private String descripcionRes;
	private ClienteVO cliente;
}