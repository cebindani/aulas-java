package br.com.dxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class TesteJDBC {

	public static Connection getConexao() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/treinamento", "walter",
					"walter");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}

	public static String getValue(String info) {
		return JOptionPane.showInputDialog(info);
	}

	public static void main(String[] args) throws SQLException {
		Connection con = null;

		PreparedStatement ps = null;
		try {
			con = getConexao();

			try {
				ps = con.prepareStatement("INSERT INTO PESSOA (NOME, CPF) VALUES(?, ?)");
				ps.setString(1, getValue("Digite o nome:"));
				ps.setString(2, getValue("Digite o cpf:"));
				ps.execute();
			} catch (SQLException e) {
				if (con != null) {
					try {
						con.rollback();
					} catch (SQLException e1) {
						throw new RuntimeException(
								"Erro no rollback após erro no insert", e1);
					}
				}
				throw new RuntimeException("Erro no insert", e);
			} finally {
				if (ps != null) {
					try {
						ps.close();
					} catch (SQLException e) {
						throw new RuntimeException(
								"Erro no close do statement", e);
					}
				}
			}

			Statement stm = null;
			ResultSet rs = null;
			try {
				stm = con.createStatement();
				rs = stm.executeQuery("SELECT * FROM PESSOA");
				while (rs.next()) {
					System.out.println(String.format("Nome: %s = CPF: %s",
							rs.getString("nome"), rs.getString("cpf")));
				}
			} catch (SQLException e) {
				throw new RuntimeException("Erro no insert", e);
			} finally {
				if (stm != null) {
					try {
						stm.close();
					} catch (SQLException e) {
						throw new RuntimeException(
								"Erro no close do statement", e);
					}
				}
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						throw new RuntimeException(
								"Erro no close do resultset", e);
					}
				}
			}
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException ex) {
				throw new RuntimeException("Erro no close da conexao", ex);
			}
		}
	}
}
