package dao;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Curso;


public class CursoDAO {
    protected EntityManager entityManager;
    
     public CursoDAO(){
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola"); 
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    
   
    
    public Curso inserir(Curso curso) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(curso);
            entityManager.getTransaction().commit();
            entityManager.close();
            return curso;
        } catch (Exception erro) {
            entityManager.getTransaction().rollback();
            return null;
        }
    }
    
    public void excluir(int codigo){
        try{
            entityManager.getTransaction().begin();
            Curso curso = entityManager.find(Curso.class, codigo);
            entityManager.remove(curso);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch(Exception e){
            entityManager.getTransaction().rollback();
        }
    }
    
    public ArrayList<Curso> listarTodos(){
        return (ArrayList<Curso>) entityManager.createQuery("FROM " + Curso.class.getName()).getResultList();
    }

}
