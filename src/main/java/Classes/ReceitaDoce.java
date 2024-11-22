package Classes;

public class ReceitaDoce extends Receita
{
    public ReceitaDoce(String titulo, String descricao) {
        super(titulo, "Doce", descricao);
    }
    
    public ReceitaDoce(int id, String titulo, String descricao) {
        super(titulo, "Doce", descricao);
        this.id = id;
    }
   
    public void exibirReceita() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descrição: " + descricao);
    }
}
