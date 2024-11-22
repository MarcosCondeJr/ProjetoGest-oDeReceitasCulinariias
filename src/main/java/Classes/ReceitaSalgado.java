package Classes;

public class ReceitaSalgado extends Receita
{
    public ReceitaSalgado(String titulo, String descricao) {
        super(titulo, "Salgada", descricao);
    }
    
    public ReceitaSalgado(int id, String titulo, String descricao) {
        super(titulo, "Salgada", descricao);
        this.id = id;
    }
    
    public void exibirReceita() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descrição: " + descricao);
    }
}
