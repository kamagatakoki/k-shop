package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import entity.GenreLg;

public class GenreLgDao {

	private DataSource dataSource;

	public GenreLgDao() {
		dataSource = DaoUtil.getSource();
	}

	public List<GenreLg> getGenreLg() throws SQLException {

		Connection connection = dataSource.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM GENRE_LG");

		ResultSet resultSet = preparedStatement.executeQuery();

		List<GenreLg> genreLgList = new ArrayList<>();
		while (resultSet.next()) {
			genreLgList.add(setEntity(resultSet));
		}

		return genreLgList;
	}

	public List<GenreLg> getGenreLgById(String genreLgCd) throws SQLException {

		Connection connection = dataSource.getConnection();

		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT * FROM GENRE_LG WHERE GENRE_LG_CD = ?");

		preparedStatement.setString(1, genreLgCd);
		ResultSet resultSet = preparedStatement.executeQuery();

		List<GenreLg> genreLgList = new ArrayList<>();
		while (resultSet.next()) {
			genreLgList.add(setEntity(resultSet));
		}

		return genreLgList;
	}

	private GenreLg setEntity(ResultSet resultSet) throws SQLException {
		GenreLg genreLg = new GenreLg();

		genreLg.setGenreLgCd(resultSet.getString("GENRE_LG_CD"));
		genreLg.setGenreLgNm(resultSet.getString("GENRE_LG_NM"));
		genreLg.setDisplayOrder(resultSet.getInt("DISPLAY_ORDER"));

		return genreLg;
	}
}
