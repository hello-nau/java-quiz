
public class Quiz {

public static void main(String[] args) {
	Question question5 = new TrueFalseQuestion("Is a cat a bird?", "n");
	question5.check();
	
	Question question6 = new TrueFalseQuestion("Is there only one moon?", "y");
	question6.check();

	Question question7 = new TrueFalseQuestion("2 + 2 = 6?", "f");
	question7.check();

	Question question8 = new TrueFalseQuestion("Is the color of the sea white?", "f");
	question8.check();

	Question question9 = new TrueFalseQuestion("Did you do your homework?", "y");
	question9.check();
	
		Question question = new MultipleChoiceQuestion("What is the capital of "
				+ "Estonia?", "Talinn", "Berlin", "London", "Barcelona", "Prague",
				"a");
		question.check();
		
		Question question1 =  new MultipleChoiceQuestion ("When was Estonia founded?", "1896",
				 "1918", "1960", "1985", "a",
					"a"); 
	    question1.check();
	    
	    Question question2 = new MultipleChoiceQuestion("Where is Estonia located?",
	    		"East Asia", "America", "Notheastern Europe", "Southwest Europe", "Africa",
				"c");
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion("What is Estonian food?",
		    		"spicy sparts", "borsch", "pea soup", "hummus", "kefir",
					"a");
			question3.check();
			
		Question question4 = new MultipleChoiceQuestion("What sea Estonia has borders with?",
			    		"Black Sea", "Baltic Sea", "Carribean Sea", "Bering Sea", "Mediterranean Sea",
						"b");
				question4.check(); 

		
		MultipleChoiceQuestion.showResults();
}
	
}
