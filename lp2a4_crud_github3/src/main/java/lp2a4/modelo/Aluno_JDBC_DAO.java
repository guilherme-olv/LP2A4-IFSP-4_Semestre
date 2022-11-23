package lp2a4.modelo;

import java.util.jar.*;

import com.mysql.cj.xdevapi.Statement;

import lp2a4.AlunoUtil;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Connection;

public class Aluno_JDBC_DAO implements AlunoDAO {

	public static Connection connectionDB() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aluno_CRUD_DB", "root",
					"1234");
			return connection;
		} catch (SQLException sqlexception) {
			System.out.println("Erro na conexão com o BD!");
			return null;
		}
	}

	// Métodos
	@Override
	public boolean create(AlunoPOJO aluno) {

		String sqlInstruction = "INSERT INTO Aluno (matricula, nome, endereco, data_inicio, data_termino) VALUES (?,?,?,?,?)";
		PreparedStatement prepStatement;

		try {
			prepStatement = Aluno_JDBC_DAO.connectionDB().prepareStatement(sqlInstruction);
			prepStatement = Aluno_JDBC_DAO.connectionDB().prepareStatement(sqlInstruction);
			prepStatement.setString(1, aluno.getMatricula());
			prepStatement.setString(2, aluno.getNome());
			prepStatement.setString(3, aluno.getEndereco());
			prepStatement.setString(4,
					aluno.getDataIngresso().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());
			prepStatement.setString(5,
					aluno.getDataConclusao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());

			prepStatement.execute();

			prepStatement.close();
			Aluno_JDBC_DAO.connectionDB().close();
			return true;
		} catch (SQLException sqlexception) {
			System.out.println("Erro! Não foi possível realizar a inserção do aluno! Erro: " + sqlexception);
			return false;
		}
	}

	@Override
	public AlunoPOJO retrieve(String matricula) {
		try {

			AlunoPOJO aluno = new AlunoPOJO();
			PreparedStatement prepStatement = connectionDB().prepareStatement(
					"SELECT matricula,nome,endereco,data_inicio,data_termino FROM Aluno WHERE matricula = ?;");
			prepStatement.setString(1, matricula);
			ResultSet result_set = prepStatement.executeQuery();
			if (result_set.next()) {
				String nome_aluno = result_set.getString("nome");
				String endereco_aluno = result_set.getString("endereco");
				String dataIngresso = result_set.getString("data_inicio");
				String dataConclusao = result_set.getString("data_termino");
				aluno.setMatricula(matricula);
				aluno.setNome(nome_aluno);
				aluno.setEndereco(endereco_aluno);
				aluno.setDataIngresso(LocalDate.parse(dataIngresso, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				aluno.setDataConclusao(LocalDate.parse(dataConclusao, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}

			prepStatement.close();
			Aluno_JDBC_DAO.connectionDB().close();
			return aluno;
		} catch (SQLException sqlexception) {
			System.out.println("Erro no BD! Não foi possível consultar os dados. Erro: " + sqlexception);
			return null;
		}

	}

	@Override
	public boolean update(AlunoPOJO aluno) {

		String sqlInstruction = "UPDATE Aluno SET matricula = ?, nome = ?, endereco = ?, data_inicio = ?, data_termino = ? WHERE matricula = ?;";

		PreparedStatement prepStatement;

		try {
			prepStatement = Aluno_JDBC_DAO.connectionDB().prepareStatement(sqlInstruction);
			prepStatement = Aluno_JDBC_DAO.connectionDB().prepareStatement(sqlInstruction);
			prepStatement.setString(1, aluno.getMatricula());
			prepStatement.setString(2, aluno.getNome());
			prepStatement.setString(3, aluno.getEndereco());
			prepStatement.setString(4,
					aluno.getDataIngresso().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());
			prepStatement.setString(5,
					aluno.getDataConclusao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());

			prepStatement.execute();

			prepStatement.close();
			Aluno_JDBC_DAO.connectionDB().close();
			return true;
		} catch (SQLException sqlexception) {
			System.out
					.println("Erro! Não foi possível realizar a atualização dos dados do aluno! Erro: " + sqlexception);
			return false;
		}

	}

	@Override
	public boolean delete(String matricula) {

		try {
			PreparedStatement prepStatement = Aluno_JDBC_DAO.connectionDB()
					.prepareStatement("DELETE FROM Aluno WHERE matricula = ?");
			prepStatement.setString(1, matricula);
			prepStatement.execute();

			prepStatement.close();
			Aluno_JDBC_DAO.connectionDB().close();

			return true;
		} catch (SQLException sqlexception) {
			System.out.println("Erro! Não foi possível deletar os registros do aluno! Erro: " + sqlexception);
			return false;
		}

	}

}
