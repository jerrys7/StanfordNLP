import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.SentenceUtils;
import edu.stanford.nlp.process.DocumentPreprocessor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class StanfordNLP {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //sentence length
        String currentDirectory = System.getProperty("user.dir");
        String fullFileName = currentDirectory + "/447real90.txt";
        
        FileReader fr = new FileReader(fullFileName);
        BufferedReader br = new BufferedReader(fr);
        
        String line = "";
        double sum = 0;
        double k = 0;
        while ((line = br.readLine()) != null){
            k++;
            String paragraph = line;
            Reader reader = new StringReader(paragraph);
            DocumentPreprocessor dp = new DocumentPreprocessor(reader);
            List<String> sentenceList = new ArrayList<String>();

            for (List<HasWord> sentence : dp) {

               String sentenceString = SentenceUtils.listToString(sentence);
               sentenceList.add(sentenceString);
            } 
            
            System.out.println(sentenceList.size());
            sum = sum + sentenceList.size();
           for (String sentence : sentenceList) {
               System.out.println(sentence);
            }
        }
        System.out.println("Average is " + sum/k);
        br.close();
        

    
    }
    
}
