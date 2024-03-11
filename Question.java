package com.demo.datamodel;
	import java.util.List;

	public class Question {
	    private int questionId;
	    private String text;
	    private QuestionType type;
	    private List<String> options;
		public Question(int questionId, String text, QuestionType type, List<String> options) {
			super();
			this.questionId = questionId;
			this.text = text;
			this.type = type;
			this.options = options;
		}
		public int getQuestionId() {
			return questionId;
		}
		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public QuestionType getType() {
			return type;
		}
		public void setType(QuestionType type) {
			this.type = type;
		}
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}

	    
	    
	    // Constructors, getters, setters
	}


