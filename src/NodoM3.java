/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HoLeX
 */
public class NodoM3
{
    private int valorIzq;
    private int valorMed;
    private int valorDer;
    
    private ABBM3 hijoIzq;
    private ABBM3 hijoDer;
    
    private int cantidad;
    private boolean esHoja;
    
    public NodoM3()
    {
        this.valorIzq = -1;
        this.valorMed = -1;
        this.valorDer = -1;
        
        this.hijoDer = null;
        this.hijoIzq = null;
        
        this.cantidad = 0;
        this.esHoja = true;
    }

    public int getValorIzq()
    {
        return valorIzq;
    }

    public void setValorIzq(int valorIzq)
    {
        this.valorIzq = valorIzq;
    }

    public int getValorMed()
    {
        return valorMed;
    }

    public void setValorMed(int valorMed)
    {
        this.valorMed = valorMed;
    }

    public int getValorDer()
    {
        return valorDer;
    }

    public void setValorDer(int valorDer)
    {
        this.valorDer = valorDer;
    }

    public ABBM3 getHijoIzq()
    {
        return hijoIzq;
    }

    public void setHijoIzq(ABBM3 hijoIzq)
    {
        this.hijoIzq = hijoIzq;
    }

    public ABBM3 getHijoDer()
    {
        return hijoDer;
    }

    public void setHijoDer(ABBM3 hijoDer)
    {
        this.hijoDer = hijoDer;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }    

    public boolean esHoja()
    {
        return esHoja;
    }

    public void setEsHoja(boolean esHoja)
    {
        this.esHoja = esHoja;
    }
    
}
