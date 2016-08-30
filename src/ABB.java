/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HoLeX
 */
public class ABB
{   
    private Nodo raiz;
        
    public boolean estaVacio()
    {
        return (this.raiz == null);
    }
    
    public void insertar(int x)
    {
        if(estaVacio())
        {
            Nodo nuevo = new Nodo();
            nuevo.setNum(x);
            nuevo.setHijoDer(new ABB());
            nuevo.setHijoIzq(new ABB());
            this.raiz = nuevo;
        }
        else if(x > this.raiz.getNum())
        {
            this.raiz.getHijoDer().insertar(x);
        }
        else if(x < this.raiz.getNum())
        {
            this.raiz.getHijoIzq().insertar(x);
        }        
    }
    
    public ABB buscar(int x)
    {
        ABB arbol = null;
        
        if (!estaVacio()) 
        {
            if (x == this.raiz.getNum()) 
            {
                return this;
            }
            else if (x < this.raiz.getNum()) 
            {
                arbol = this.raiz.getHijoIzq().buscar(x);
            }
            else if (x > this.raiz.getNum())
            {
                arbol = this.raiz.getHijoDer().buscar(x);
            }		
        }
        return arbol;
    }
    
    public int altura() 
    {
        if (estaVacio()) 
        {
            return 0;
        }
        else 
        {
            return (1 + Math.max(((raiz.getHijoIzq()).altura()), ((raiz.getHijoDer()).altura())));
        }
    }     
    
    public boolean esHoja() 
    { 
        boolean hoja = false; 
        if((raiz.getHijoIzq()).estaVacio() && (raiz.getHijoDer()).estaVacio()) 
        { 
            hoja = true; 
        } 
        return hoja; 
    }    
    
    public int buscarMin() 
    {
        ABB arbolActual = this; 
        while(!arbolActual.raiz.getHijoIzq().estaVacio()) 
        { 
            arbolActual = arbolActual.raiz.getHijoIzq(); 
        } 
        int devuelvo= arbolActual.raiz.getNum();
        arbolActual.raiz = null;
        return devuelvo; 
    }    
    
    public void eliminar(int x) 
    {
        ABB paraEliminar = buscar(x);
        if (paraEliminar != null && !paraEliminar.estaVacio()) 
        {
            if (paraEliminar.esHoja()) 
            {
                paraEliminar.raiz = null;
            }	
            else 
            {
                if (!paraEliminar.raiz.getHijoIzq().estaVacio() && !paraEliminar.raiz.getHijoDer().estaVacio()) 
                {
                    paraEliminar.raiz.setNum(paraEliminar.raiz.getHijoDer().buscarMin());
                }
                else if (paraEliminar.raiz.getHijoIzq().estaVacio()) 
                {
                    paraEliminar.raiz = paraEliminar.raiz.getHijoDer().raiz;
                }
                else
                {
                    paraEliminar.raiz = paraEliminar.raiz.getHijoIzq().raiz;
                }
            }
        }
    }    
    
    public void preOrder()
    {
        if (!estaVacio()) 
		{
            System.out.print( raiz.getNum() + ", "  );
            raiz.getHijoIzq().preOrder();
            raiz.getHijoDer().preOrder();
        }
    }
    
    public void inOrder()
	{
        if (!estaVacio()) 
		{
            raiz.getHijoIzq().inOrder();
            System.out.print( raiz.getNum() + ", "  );
            raiz.getHijoDer().inOrder();
        }
    }

    public void posOrder()
	{
        if (!estaVacio()) 
		{
            raiz.getHijoDer().posOrder();
            raiz.getHijoIzq().posOrder();
            System.out.print( raiz.getNum() + ", "  );
        }
    }    
    
    public Nodo getRaiz()
    {
        return this.raiz;
    }
}
