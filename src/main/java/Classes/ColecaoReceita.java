package Classes;

import java.util.ArrayList;

public class ColecaoReceita
{
    private ArrayList<Receita> receitas = new ArrayList<>();

    public boolean adicionarReceita(Receita receita)
    {
        if(receita != null)
        {
            receitas.add(receita);
            return true;
        } 
        else 
        {
            return false;
        }  
    }

    public ArrayList<Receita> listarReceita()
    {
        return receitas;
    }

    public void removerReceita(int titulo)
    {
        if(titulo != -1)
        {
            receitas.remove(titulo);
        }
        else 
        {
            System.out.println("Não possivel apagar");
        }
    }

    public boolean editarReceita(Receita novaReceita)
    {
        for (int i = 0; i < receitas.size(); i++) {
            if (receitas.get(i).getId() == novaReceita.getId()) {
                receitas.set(i, novaReceita); // Atualiza a receita na lista
                break;
            }
        }
    }
}
