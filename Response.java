package com.demo.Survey;

	import java.util.List;

	public class Response {
	    private int responseId;
	    private int surveyId;
	    private int userId;
	    private List<String> answers;
		public Response(int responseId, int surveyId, int userId, List<String> answers) {
			super();
			this.responseId = responseId;
			this.surveyId = surveyId;
			this.userId = userId;
			this.answers = answers;
		}
		public int getResponseId() {
			return responseId;
		}
		public void setResponseId(int responseId) {
			this.responseId = responseId;
		}
		public int getSurveyId() {
			return surveyId;
		}
		public void setSurveyId(int surveyId) {
			this.surveyId = surveyId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public List<String> getAnswers() {
			return answers;
		}
		public void setAnswers(List<String> answers) {
			this.answers = answers;
		}
	    
	    

	}



