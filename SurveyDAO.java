package com.demo.datamodel;
import com.demo.datamodel.DataManager;

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

	public class SurveyDAO {
	    private static final String INSERT_SURVEY_SQL = "INSERT INTO survey (title, description) VALUES (?, ?)";

	    public void addSurvey(String title, String description) {
	        try (Connection connection = DatabaseManager.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SURVEY_SQL)) {
	            preparedStatement.setString(1, title);
	            preparedStatement.setString(2, description);
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


