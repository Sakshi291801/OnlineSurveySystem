package com.demo.datamodel;
	
	
	import java.util.List;

	public class Survey {
	    private int surveyId;
	    private String title;
	    private String description;
	    private List<Question> questions;
	    
	    
		public Survey(int surveyId, String title, String description, List<Question> questions) {
			super();
			this.surveyId = surveyId;
			this.title = title;
			this.description = description;
			this.questions = questions;
		}


		public int getSurveyId() {
			return surveyId;
		}


		public void setSurveyId(int surveyId) {
			this.surveyId = surveyId;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public List<Question> getQuestions() {
			return questions;
		}


		public void setQuestions(List<Question> questions) {
			this.questions = questions;
		}
		
		 
		public int addQuestion(int Question ) {

			return Question;
		}
		
		public int removeQuestion(int Question) {
			return Question;
		}
		}


