package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Curso_aluno;


public class Curso_alunoDAO {
    protected EntityManager entityManager;
    
     public Curso_alunoDAO(){
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola"); 
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    
    public Curso_aluno inserir(int aluno, int curso) {
        try {
            Curso_aluno cursoaluno = new Curso_aluno();
            cursoaluno.setCodigo_aluno(aluno);
            cursoaluno.setCodigo_curso(curso);
            entityManager.getTransaction().begin();
            entityManager.persist(cursoaluno);
            entityManager.getTransaction().commit();
            entityManager.close();
            return cursoaluno;
        } catch (Exception erro) {
            entityManager.getTransaction().rollback();
            return null;
        }
    }
}
