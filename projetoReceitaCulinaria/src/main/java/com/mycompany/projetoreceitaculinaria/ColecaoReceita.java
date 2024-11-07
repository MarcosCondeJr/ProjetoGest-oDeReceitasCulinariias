package com.mycompany.projetoreceitaculinaria;

import java.util.ArrayList;

public class ColecaoReceita
{
    ArrayList<Receita> receitas = new ArrayList<>();

    public void adicionarReceita(Receita receita)
    {
        if(receita != null)
        {
            receitas.add(receita);
        } 
        else 
        {
            System.out.println("Erro, valor não pode ser nulo");
        }
        
        
    }

    public void listarReceita()
    {

    }

    public void removerReceita(String titulo)
    {
        if(titulo != null)
        {
            receitas.remove(titulo);
        }
        else 
        {
            System.out.println("Não possivel apagar");
        }
    }

    public void editarReceita(String titulo, Receita novaReceita)
    {

    }
}
