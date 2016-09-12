package org.jbpm.examples.sonita;

import java.io.Serializable;

public class PedidoDepartamentoCompras implements Serializable{
	
	private static final long serialVersionUID = 7414384760525856742L;

	private String userID;
	private String pedido;
	private Boolean respuesta;
	private String mensaje;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public Boolean getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Boolean respuesta) {
		this.respuesta = respuesta;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public PedidoDepartamentoCompras(String userID, String pedido, Boolean respuesta, String mensaje) {
		super();
		this.userID = userID;
		this.pedido = pedido;
		this.respuesta = respuesta;
		this.mensaje = mensaje;
	}

}
