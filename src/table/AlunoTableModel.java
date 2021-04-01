package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Aluno;

public class AlunoTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_NOME = 1;
        
    public ArrayList<Aluno> listaAluno;
    Aluno aluno = new Aluno();

    public AlunoTableModel(ArrayList<Aluno> listarTodos) {
        listaAluno = new ArrayList<Aluno>(listarTodos);
    }
            
    @Override
    public int getRowCount() {
       return listaAluno.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Aluno aluno = listaAluno.get(linhas);
        if (colunas == COL_CODIGO) {
            return aluno.getCodigo();
        }
        if (colunas == COL_NOME) {
            return aluno.getNome();
        }
        return " ";
    }
    
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO){
            return "Código";
        }
        if(colunas == COL_NOME){
            return "Nome";
        }
        return null;
    }
}
