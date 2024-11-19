package Classes;

public class Receita
{
    protected static int geradorId = 0;
    protected int id;
    protected String titulo;
    protected String categoria;
    protected String descricao;

    public Receita(String titulo, String categoria, String descricao)
    {
        this.id = geradorId++;
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
    }
    
    public Receita(){}

    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
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
