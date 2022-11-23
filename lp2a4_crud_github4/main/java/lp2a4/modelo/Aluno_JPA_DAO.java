package lp2a4.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aluno_JPA_DAO implements AlunoDAO {
	private EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("test");
	private EntityManager eManager = eManagerFactory.createEntityManager();

	@Override
	public boolean create(AlunoPOJO aluno_pojo) {
		eManager.getTransaction().begin();
		eManager.persist(aluno_pojo);
		eManager.getTransaction().commit();
		return true;

	}

	@Override
	public boolean update(AlunoPOJO aluno_pojo) {
		eManager.getTransaction().begin();
		eManager.merge(aluno_pojo);
		eManager.getTransaction().commit();
		return true;

	}

	public boolean delete(String matricula) {

		AlunoPOJO aluno_pojo = new AlunoPOJO();
		aluno_pojo.setMatricula(matricula);
		eManager.getTransaction().begin();
		eManager.remove(eManager.merge(aluno_pojo));
		eManager.getTransaction().commit();
		return true;

	}

	@Override
	public AlunoPOJO retrieve(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

}
