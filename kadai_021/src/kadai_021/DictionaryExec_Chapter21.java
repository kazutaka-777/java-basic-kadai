package kadai_021;

public class DictionaryExec_Chapter21 {
	
	 public static void main(String[] args) {
		 Dictionary_Chapter21 Dictionary = new Dictionary_Chapter21();
		 
		 String[] wordArray = {"apple" , "banana" , "grape" , "orange"};
		 
		 for(String word : wordArray) {
			 Dictionary.search(word);
		 }
	 }

}