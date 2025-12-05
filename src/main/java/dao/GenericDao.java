/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Raissa
 */
import javax.persistence.*;
import java.util.List;

public class GenericDao <T> {
    protected static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("clinicaPU");

    protected EntityManager em;
    private Class<T> classe;

       public GenericDao(Class<T> classe){
        this.classe = classe;
        this.em = emf.createEntityManager();
    }

    public void salvar(T obj) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(obj);
            tx.commit();
        } catch (RuntimeException ex) {
            if (tx.isActive()) tx.rollback();
            throw ex;
        }
    }

    public T buscar(Integer id) {
        return em.find(classe, id);
    }

    public List<T> listar() {
        return em.createQuery("from " + classe.getSimpleName(), classe).getResultList();
    }

    public void remover(Integer id) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            T obj = em.find(classe, id);
            if (obj != null) em.remove(obj);
            tx.commit();
        } catch (RuntimeException ex) {
            if (tx.isActive()) tx.rollback();
            throw ex;
        }
    }
}
