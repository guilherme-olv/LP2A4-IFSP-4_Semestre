package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Veiculo;

public class SituacaoErro {

	public static void main(String[] args) {
		
		//Para utilizar o persistence, é necessário criar um EntityManagerFactory no qual 
		//o parâmetro passado é o nome colocado no arquivo persistence.xml. 
		//Neste caso utilizei “persistence” como nome.
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("teste persistence");
		
		//Após criada a fábrica, podemos utilizá-la para criar um EntityManager, o qual 
		//será utilizado para manipular nossas queries.
		EntityManager em = emFactory.createEntityManager();

		//Retornar uma query do banco de dados.
		List<Veiculo> listaVeic = em.createQuery("FROM Veiculo", Veiculo.class).getResultList();
		System.out.println(listaVeic);
		
	}
}