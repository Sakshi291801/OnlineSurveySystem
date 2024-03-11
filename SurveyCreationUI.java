package com.demo.Survey;
	
	import javax.swing.*;

	public class SurveyCreationUI extends JFrame {
	    private JPanel mainPanel;
	    private JLabel titleLabel;
	    private JTextField titleTextField;
	    private JTextArea descriptionTextArea;
	    private JButton addQuestionButton;
	    private JButton saveSurveyButton;

	    public SurveyCreationUI() {
	        setTitle("Survey Creation");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        mainPanel = new JPanel();
	        titleLabel = new JLabel("Survey Title:");
	        titleTextField = new JTextField(20);
	        descriptionTextArea = new JTextArea(10, 30);
	        addQuestionButton = new JButton("Add Question");
	        saveSurveyButton = new JButton("Save Survey");

	        mainPanel.add(titleLabel);
	        mainPanel.add(titleTextField);
	        mainPanel.add(new JScrollPane(descriptionTextArea));
	        mainPanel.add(addQuestionButton);
	        mainPanel.add(saveSurveyButton);

	        add(mainPanel);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(SurveyCreationUI::new);
	    }
	}



