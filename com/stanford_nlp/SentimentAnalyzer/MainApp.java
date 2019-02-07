
package com.stanford_nlp.SentimentAnalyzer;
import java.io.IOException;

import com.stanford_nlp.model.SentimentResult;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class MainApp {
    
        public static String toSString(Double s){
            if(s == null){
                return ("null");
            }else{
                return(Double.toString(s));
            }
        }   

	public static void main(String[] args) throws IOException {
            
//            String currentDirectory = System.getProperty("user.dir");
//            String fullFileName = currentDirectory + "/437fake90.txt";
//
//            FileReader fr = new FileReader(fullFileName);
//            BufferedReader br = new BufferedReader(fr);
//
//            ArrayList<String> stuff = new ArrayList();
//            String line = "";
//            while ((line = br.readLine()) != null){
//                stuff.add(line);
//            }
//            br.close();
////            PrintWriter out = new PrintWriter("sentimentAnalysisFake1.csv");
//            String[][] matrix = new String[stuff.size()][7];
//            for (int k = 0; k < stuff.size(); k++){
//                String text = stuff.get(k);
//                SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
//                sentimentAnalyzer.initialize();
//                SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);
//                matrix[k][0] = toSString(sentimentResult.getSentimentScore());
//                System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
//                matrix[k][1] = sentimentResult.getSentimentType();
//                System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
//                matrix[k][2] = toSString(sentimentResult.getSentimentClass().getVeryPositive())+"%";
//                System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
//                matrix[k][3] = toSString(sentimentResult.getSentimentClass().getPositive()) + "%";
//                System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
//                matrix[k][4] = toSString(sentimentResult.getSentimentClass().getNeutral())+"%";
//                System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
//                matrix[k][5] = toSString(sentimentResult.getSentimentClass().getNegative())+"%";
//                System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
//                matrix[k][6] = toSString(sentimentResult.getSentimentClass().getVeryNegative())+"%";
//                System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");
//                String temp = Arrays.toString(matrix[k]);
//                System.out.println(temp);
//            }
                String text = "I really really hate cabin cruisers.";
		
		SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
		sentimentAnalyzer.initialize();
		SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);

		System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
		System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
		System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
		System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
		System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
		System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
		System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");
            
	}

}