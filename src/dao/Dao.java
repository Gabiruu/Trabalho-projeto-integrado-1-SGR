package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Dao genérico Hibernate
 * @author 
 * @param <T>
 */
public class Dao<T> {

    private EntityManagerFactory factory = null;
    private EntityManager manager = null;
    private static Dao instance = null;

    protected Dao() {
        factory = Persistence.createEntityManagerFactory("ExemploPU");
        manager = factory.createEntityManager();
    }
    
    public static Dao getIntance() {
        if (instance == null) {
            instance = new Dao();
        }
        return instance;
    }

    public void fechar() {
        manager.close();
        factory.close();
    }

    public boolean salvar(T t) {
        try {
            manager.getTransaction().begin();
            manager.persist(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean excluir(T t) {
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public List<T> listar(Class c, String campo, String valor) {
        List<T> lista = null;
        try {
            manager.getTransaction().begin();
            CriteriaBuilder builder = manager.getCriteriaBuilder();
            CriteriaQuery<T> criteria = builder.createQuery(c);
            Root<T> root = criteria.from(c);
            criteria.select(root);
            criteria.where(builder.like(root.get(campo), "%"+valor+"%"));
            lista = manager.createQuery(criteria).getResultList();            
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return lista;
    }
    
    public T get(Class c, int id){
        manager.getTransaction().begin();
        T t = (T)manager.find(c, id);
        manager.getTransaction().commit();
        return t;
    }
}
