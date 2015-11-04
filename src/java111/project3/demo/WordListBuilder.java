import java.util.*;

/** This is one possible solution to lab 9.
 *  
 *  @author pwaite
 */
 
public class WordListBuilder {

    private ArrayList<String> inputWords;
    private ArrayList<String> keyWords;
    private InputHelper inputHelper;
    
    public void collectUserEnteredWords() {
        String inputWord = null;
        while (true) {
            inputWord = (inputHelper.getUserInput("Please enter a word, or enter 'n' to quit: "));
            if (inputWord.equals("n")) {
                break;            
            }
            addUniqueWord(inputWord);
        }   
    }
    
    private void createInstanceVariables() {
        inputWords = new ArrayList<String>();
        keyWords = new ArrayList<String>();
        inputHelper = new InputHelper();
    }
    
    private void createKeywords() {
        keyWords.add("fantastic");
        keyWords.add("super");
    }
    
    private void addUniqueWord(String word) {
        if (!inputWords.contains(word)) {
            inputWords.add(word);
        }    
    }
    
    private void runUniqueWordsReport() {
     
        System.out.println();
        System.out.println("******** Your list of unique words *********");
        System.out.println("****** An '*' denotes a keyword match ******");
 
        System.out.println();
        for (String word : inputWords) {
            if (isKeyword(word)) {
                System.out.println(word + "*");
            }
            else {
                System.out.println(word);
            }
        }
        System.out.println();
        System.out.println("********************************************");
     }
     
     private boolean isKeyword(String word) {
     
        return keyWords.contains(word);
     }
    
    public void run() {
        createInstanceVariables();
        createKeywords();
        collectUserEnteredWords();
        runUniqueWordsReport();
    }
 }





