/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Especialidade;
import model.Profissional;

/**
 *
 * @author Raissa
 */
public class ProfissionalDao extends GenericDao<Profissional>{
    public ProfissionalDao() {
        super(Profissional.class);
    } 
    
    // ProfissionalDao.java
public List<Especialidade> listarEspecialidades() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinicaPU");
    EntityManager em = emf.createEntityManager();

    try {
        return em.createQuery("SELECT e FROM Especialidade e", Especialidade.class)
                 .getResultList();
    } finally {
        em.close();
        emf.close();
    }
}


public List<Profissional> listarPorEspecialidade(String especialidade) {
    String jpql = "SELECT p FROM Profissional p WHERE p.especialidade = :esp";
    return em.createQuery(jpql, Profissional.class)
             .setParameter("esp", especialidade)
             .getResultList();
}


}
