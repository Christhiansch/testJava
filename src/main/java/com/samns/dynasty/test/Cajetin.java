package com.samns.dynasty.test;

public class Cajetin {

	public String id;
	public String moneda;
	public String actual;
	public String retract;	
	public static String BILL_PEN = "";
	public static String BILL_USD = "";
	public static final String DEN_PEN = "PEN";
	public static final String DEN_USD = "USD";
	
	public Cajetin(String id, String moneda, String actual, String retract) {
		super();
		this.id = id;
		this.moneda = moneda;
		this.actual = actual;
		this.retract = retract;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getActual() {
		return actual;
	}

	public void setActual(String actual) {
		this.actual = actual;
	}

	public String getRetract() {
		return retract;
	}

	public void setRetract(String retract) {
		this.retract = retract;
	}


	@Override
	public String toString() {
		return "Cajetin [id=" + id + ", moneda=" + moneda + ", denominacion=" + actual + ", retract=" + retract + "]";
	}
	
	public String getTrama()
	{
		return id + moneda + actual + retract;
	}
	
	public String formatoLineaJournal()
	{
		if(moneda.equalsIgnoreCase(DEN_PEN))
		{
			BILL_PEN = BILL_PEN + actual + "-" + retract + ";" ;
	    }
	    
	    if(moneda.equalsIgnoreCase(DEN_USD))
	    {
	    	BILL_USD = BILL_USD + actual + "-" + retract + ";" ;
	    }
	    
	    
	    return DEN_PEN + ": " + BILL_PEN + DEN_USD + ": " + BILL_USD;
	}
	
}
