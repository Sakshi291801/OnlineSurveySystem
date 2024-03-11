package com.demo.Survey;

	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class SurveyCreationForm extends JFrame {
	    private JTextField titleField;
	    private JTextArea descriptionArea;
	    private JButton addQuestionButton;
	    private JButton saveSurveyButton;

	    public SurveyCreationForm() {
	        setTitle("Create Survey");
	        setSize(200, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel mainPanel = new JPanel();
	        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

	        JLabel titleLabel = new JLabel("Title:");
	        titleField = new JTextField(10);

	        JLabel descriptionLabel = new JLabel("Description:");
	        descriptionArea = new JTextArea(5, 10);
	        JScrollPane scrollPane = new JScrollPane(descriptionArea);

	        addQuestionButton = new JButton("Add Question");
	        saveSurveyButton = new JButton("Save Survey");

	        mainPanel.add(titleLabel);
	        mainPanel.add(titleField);
	        mainPanel.add(descriptionLabel);
	        mainPanel.add(scrollPane);
	        mainPanel.add(addQuestionButton);
	        mainPanel.add(saveSurveyButton);

	        add(mainPanel);

	        saveSurveyButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Logic to save survey data in the database
	                saveSurveyData();
	            }
	        });

	        setVisible(true);
	    }

	    private void saveSurveyData() {
	        // Implement logic to save survey data in the database using JDBC
	        String title = titleField.getText();
	        String description = descriptionArea.getText();

	        // Insert survey data into the database
	        // Example: INSERT INTO surveys (title, description) VALUES (?, ?)
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(SurveyCreationForm::new);
	    }
	}


