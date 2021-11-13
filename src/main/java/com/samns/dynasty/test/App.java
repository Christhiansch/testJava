package com.samns.dynasty.test;

public class App 
{
	
    public static void main( String[] args )
    {
    	Cajetin cajetin = null;
    	
    	StringBuilder trama = new StringBuilder();
    	
    	String idCajetines[] = {"1", "2", "3", "4"};
    	String monedas[] = {"PEN", "PEN", "PEN", "USD"};
    	String denominaciones[] = {"100.0", "50.0", "20.0", "20.0"};
    	String retracts[] = {"5", "14", "21", "2"};
    	
    	String formatJAM = formatString(denominaciones[1], '0', 4, 'L');
    	System.out.print(formatJAM+"\n");
    	
    	
    	for(int i=0; i < idCajetines.length; i++)
    	{
    		String denominacion = formatoDenominacion(denominaciones[i]);
    		String retract = agregarCerosAlaIzquierda(retracts[i]);
    		
    		cajetin = new Cajetin(idCajetines[i], monedas[i], denominacion, retract);
    		System.out.println("FORMATO: " + cajetin.formatoLineaJournal());
    		System.out.println(cajetin.toString());
    		trama.append(cajetin.getTrama());
    	}
    	
    	BilletesRechazados billetesRechazados = new BilletesRechazados("11-10-2021", "18:09:50", 2500, trama.toString(), true);
    	System.out.println(billetesRechazados.getLineaArchivoRechazado());
    	System.out.println("LONGITUD : " + trama.toString().length());
    	//String tmp = formatoBilletesRechazadosJournal(cajetin.getTrama());
    	
    }
    
  //Da formato a string, para que tenga una longitud n, padeado con character, por el lado side
    public static String formatString( String string, char character , int n, char side)
    {
        int Index = 0;

        while( string.length() < n){
            if( side == 'L')
                string = character + string
            ;else
                string += character
            ;
            Index++;
        }
        return string;
    }   
    
    public static String formatoDenominacion(String denominacion)
    {    	
    	    	
    	String formato = denominacion.substring(0, denominacion.length()-2);
    	//formato = agregarCerosAlaIzquierda(formato);
    	
    	return formato;
    }
    
    public static String agregarCerosAlaIzquierda(String formato)
    {
    	int cantidadCeros = 4 - formato.length();
    	
    	while(cantidadCeros!=0)
    	{
    		formato = "0" + formato;
    		cantidadCeros--;
    	}
    	
    	return formato;
    }
    
    public static String formatoBilletesRechazadosJournal(String trama)
    {
    	String DEN_PEN = "PEN: ";
    	String DEN_USD = "USD: ";
    	
    	int nroCajetines = trama.toString().length() / 12;
    	
    	while(nroCajetines != 0)
    	{	
    		nroCajetines--;
    	}
    	String literalJournal = "RACT: PEN:100-0005;50-0014;20-0021;USD:20-0002";
    	
    	return literalJournal;
    }
}
