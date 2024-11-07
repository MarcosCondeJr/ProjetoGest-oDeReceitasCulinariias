package com.mycompany.projetoreceitaculinaria;

public class Receita
{
    private String titulo;
    private String categoria;
    private String descricao;

    public Receita(String titulo, String categoria, String descricao)
    {
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
    }
    
    public Receita(){}

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getCategoria()
    {
        return categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public void exibirReceita()
    {
        System.out.println("Titulo: " + this.titulo
                         + "Categoria: " + this.categoria
                         + "Descrição: " + this.descricao);
    }
}
