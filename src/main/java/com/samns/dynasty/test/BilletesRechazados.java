package com.samns.dynasty.test;

public class BilletesRechazados {
	
	public String fecha;
	public String hora;
	public double importe;
	public String trama;
	public boolean estado;
	
	public BilletesRechazados(String fecha, String hora, double importe, String trama, boolean estado) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.importe = importe;
		this.trama = trama;
		this.estado = estado;
	}
	
	

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getCajetin() {
		return trama;
	}

	public void setCajetin(String trama) {
		this.trama = trama;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "BilletesRechazados [fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + ", trama=" + trama
				+ ", estado=" + estado + "]";
	}
	
	public String getLineaArchivoRechazado()
	{
		return fecha + "|" + hora + "|" + importe + "|" + trama + "|" + estado + "\n";
	}
	

}
