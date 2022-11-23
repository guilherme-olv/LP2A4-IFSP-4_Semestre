package app;

import java.util.List;
import javax.persistence.*;

import entities.AlunoDisciplinaEntidade;

public class Aplicacao {
public static void main (String[] args) {
	EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("ManyToManyGithub5");
	EntityManager eManager = eManagerFactory.createEntityManager();
	
	List<AlunoDisciplinaEntidade> alunoDisciplina = eManager.createQuery("FROM AlunoDisciplinaEntidadea", AlunoDisciplinaEntidade.class).getResultList();
	System.out.println(alunoDisciplina);

}
}
