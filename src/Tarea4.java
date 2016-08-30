/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoLeX
 */
public class Tarea4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {       
		long tiempoIni, tiempoFin;
		
		ABB arbol = new ABB();//arbol binario normal
		ABBM3 arbolM3 = new ABBM3();//arbol binario con mediana de 3
			
		int num = Integer.parseInt(args[0]);//cantidad de numeros a leer
		int n = (int)num*(int)Math.pow(10, 6);
			
		int[] llavesNoPertenecientes = new int[5000000];
		
        BufferedReader bf = null;
        try
        {
            bf = new BufferedReader(new FileReader(args[1]));
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Tarea4.class.getName()).log(Level.SEVERE, null, ex);
        }

        int k = 0;
        String llave;
        while ((llave = bf.readLine()) != null) 
        {
            llavesNoPertenecientes[k] = Integer.parseInt(llave);
            k++;
        }		

        int[] entrada = new int[n];//guardamos los numeros en un arreglo
		
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)//llenamos el arreglo con la entrada
        {
            entrada[i] = sc.nextInt();
        }
        
        System.out.println("\n>>> Tiempo de insercion de "+n+ " llaves");

        tiempoIni = System.currentTimeMillis();
        for(int i = 0; i < n; i++)
        {
            arbol.insertar(entrada[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB Normal: "+(tiempoFin-tiempoIni)+ "ms");

        tiempoIni = System.currentTimeMillis();
        for(int i = 0; i < n; i++)
        {
            arbolM3.insertar(entrada[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB M3: "+(tiempoFin-tiempoIni)+ "ms");
        
        //System.out.println("\n>>> In-Order");

        //System.out.println("ABB Normal: ");
        //arbol.inOrder();
		//System.out.println("\nABB M3: ");
		//arbolM3.inOrder();
		
        System.out.println("\n>>> Altura del arbol");

        System.out.println("ABB Normal: "+arbol.altura());
        System.out.println("ABB M3: "+arbolM3.altura());

        System.out.println("\n>>> Tiempo de busqueda de 500000 llaves que pertenecen al arbol");

        tiempoIni = System.currentTimeMillis();
        for(int i = (n-1); i > 500000; i--)
        {
            arbol.buscar(entrada[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB Normal: "+(tiempoFin-tiempoIni)+ "ms");

        tiempoIni = System.currentTimeMillis();
        for(int i = (n-1); i > 500000; i--)
        {
            arbolM3.buscar(entrada[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB M3: "+(tiempoFin-tiempoIni)+ "ms");			

        System.out.println("\n>>> Tiempo de busqueda de 500000 llaves que no pertenecen al arbol");

        tiempoIni = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            arbol.buscar(llavesNoPertenecientes[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB Normal: "+(tiempoFin-tiempoIni)+ "ms");

        tiempoIni = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            arbolM3.buscar(llavesNoPertenecientes[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB M3: "+(tiempoFin-tiempoIni)+ "ms");	
		
        System.out.println("\n>>> Tiempo de eliminacion de 500000 llaves que pertenecen al arbol");

        tiempoIni = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            arbol.eliminar(entrada[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB Normal: "+(tiempoFin-tiempoIni)+ "ms");

        tiempoIni = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            arbolM3.eliminar(entrada[i]);
        }
        tiempoFin = System.currentTimeMillis();

        System.out.println("ABB M3: "+(tiempoFin-tiempoIni)+ "ms");			
		
    }
}
