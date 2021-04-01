package dao;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Aluno;


public class AlunoDAO {
    protected EntityManager entityManager;
    
     public AlunoDAO(){
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola"); 
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    
   
    
    public Aluno inserir(Aluno aluno) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();
            entityManager.close();
            return aluno;
        } catch (Exception erro) {
            entityManager.getTransaction().rollback();
            return null;
        }
    }
    
    public void excluir(int codigo){
        try{
            entityManager.getTransaction().begin();
            Aluno aluno = entityManager.find(Aluno.class, codigo);
            entityManager.remove(aluno);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch(Exception e){
            entityManager.getTransaction().rollback();
        }
    }
    
    public ArrayList<Aluno> listarTodos(){
        return (ArrayList<Aluno>) entityManager.createQuery("FROM " + Aluno.class.getName()).getResultList();
    }

}
