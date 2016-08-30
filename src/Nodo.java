/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HoLeX
 */
public class Nodo
{
    private int num;
    private ABB hijoIzq;
    private ABB hijoDer;
    
    public Nodo()
    {
        this.num = 0;
        this.hijoDer = null;
        this.hijoIzq = null;
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public ABB getHijoIzq()
    {
        return hijoIzq;
    }

    public void setHijoIzq(ABB hijoIzq)
    {
        this.hijoIzq = hijoIzq;
    }

    public ABB getHijoDer()
    {
        return hijoDer;
    }

    public void setHijoDer(ABB hijoDer)
    {
        this.hijoDer = hijoDer;
    }

}
