package com.samns.dynasty.test;

public class TestSubString {

	public static void main(String[] args) {
		
		
		String denominacionCien = "0005";
		int valorCien = Integer.parseInt(denominacionCien);
		
		System.out.println(valorCien);
		
		String linea = null;
		String lineaRechazados = "1PEN01000001;2PEN01000002;3PEN00500003;4PEN00200004;5USD00200005;";
		String billetesXMaleta[] = lineaRechazados.split(";");
		
		boolean resultLinea = linea == null ? true : false;
		
		for(String maleta: billetesXMaleta)
		{
			String moneda = maleta.substring(1, 4);
			String denominacion = String.valueOf(Integer.parseInt(maleta.substring(4, 8)));
			String valueretract = String.valueOf(Integer.parseInt(maleta.substring(8, 12)));
			
			System.out.println("detalle x maleta[" + maleta.substring(0,1) + "]: " + maleta);
			System.out.println("detalle x maleta[" + maleta.substring(0,1) + "] : " + moneda + " - " + denominacion + " - " + valueretract);
			
		}
		
		boolean result = evaluateLineBillRechazados();
		System.out.println("Resultado de la cadena de Billetes rechazados: " + result);
	}
	

	public static String getDatoFBilletePorMaleta()
	{
		return "1PEN01000001;2PEN01000002;3PEN00500003;4PEN00200004;5USD00200005;";
	}
	
	public static boolean equalsDataNewFBillRechazado()
	{
		return getDatoFBilletePorMaleta().equals("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
	}
	
	public static boolean evaluateLineBillRechazados()
	{
		String lineaFBilletesMaleta = getDatoFBilletePorMaleta();
		
		if(lineaFBilletesMaleta == null)
		{
			System.out.println("Es el caso nro 1");
			return false;
	    }
	    
	    if(lineaFBilletesMaleta != null)
	    {
	    	if(equalsDataNewFBillRechazado())
	    	{
	    		System.out.println("Es el caso nro 2");
	    		return false;
	        }
	        
	        if(!equalsDataNewFBillRechazado() && getDatoFBilletePorMaleta().isEmpty())
	        {
	        	System.out.println("Es el caso nro 3");
	        	return false;
	        }
	        
	        if(!equalsDataNewFBillRechazado() && !getDatoFBilletePorMaleta().isEmpty() && getDatoFBilletePorMaleta().contains(";"))
	        {
	        	System.out.println("Es el caso nro 4");
	        	return true;
	        }
	    }
	    
	    System.out.println("No ingreso a ninguno de los casos");
	    return false;
	}
}
