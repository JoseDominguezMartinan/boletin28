/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

/**
 *
 * @author jdominguezmartinan
 */
public class Alumno
{
    String nome;
    int nota;
    Enderezo enderezo;
    
    public Enderezo modificarEnderezo(String Nrua,int Nnumero){
        Enderezo enderezo=new Enderezo();
        enderezo.setNumero(Nnumero);
        enderezo.setRua(Nrua);
        return enderezo;
    }

    public Alumno(String nome,int nota,Enderezo enderezo)
    {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public Alumno()
    {
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getNota()
    {
        return nota;
    }

    public void setNota(int nota)
    {
        this.nota = nota;
    }

    public Enderezo getEnderezo()
    {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo)
    {
        this.enderezo = enderezo;
    }

    @Override
    public String toString()
    {
        return "Alumno{"+"nome="+nome+", nota="+nota+", enderezo="+enderezo+'}';
    }
    public void amosar(){
        System.out.println(nome+" "+nota+" "+enderezo);
    }
    public void cambiarNota(int notas){
      nota=notas;
    }
    
    private  class Enderezo{
        String rua;
        int numero;

        public Enderezo()
        {
        }

        public Enderezo(String rua,int numero)
        {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua()
        {
            return rua;
        }

        public void setRua(String rua)
        {
            this.rua = rua;
        }

        public int getNumero()
        {
            return numero;
        }

        public void setNumero(int numero)
        {
            this.numero = numero;
        }

        @Override
        public String toString()
        {
            return "rua "+rua+", numero "+numero;
        }
        
        
    }
}
