package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Curso;

public class CursoTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_DESCRICAO = 1;
    public static final int COL_EMENTA = 2;
    
    public ArrayList<Curso> listaCurso;
    Curso curso = new Curso();

    public CursoTableModel(ArrayList<Curso> listarTodos) {
        listaCurso = new ArrayList<Curso>(listarTodos);
    }

    @Override
    public int getRowCount() {
        return listaCurso.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Curso curso = listaCurso.get(linhas);
        if (colunas == COL_CODIGO ) {
            return curso.getCodigo();
        }
        if (colunas == COL_DESCRICAO) {
            return curso.getDescricao();
        }
        if (colunas == COL_EMENTA) {
            return curso.getEmenta();
        }
        return " ";

    }
    
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO){
            return "Código";
        }
        if(colunas == COL_DESCRICAO){
            return "Descrição";
        }
        if(colunas == COL_EMENTA){
            return "Ementa";
        }
        return null;
    }
}
