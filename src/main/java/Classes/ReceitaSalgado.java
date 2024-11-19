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
}
