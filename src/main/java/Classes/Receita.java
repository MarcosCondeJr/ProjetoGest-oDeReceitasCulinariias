package Classes;

public class Receita
{
    protected static int geradorId = 01;
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

    @Override
    public String toString() {
        return "Receita{" + "id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", descricao=" + descricao + '}';
    }
    
    public void exibirReceita() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descrição: " + descricao);
    }
}
