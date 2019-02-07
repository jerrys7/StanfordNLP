
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class countPOS {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        System.setOut(new PrintStream("C:/Users/congs/Documents/NetBeansProjects/taggers/testfile.txt")); 
       
        String currentDirectory = System.getProperty("user.dir");
        String fullFileName = currentDirectory + "/fakeJustPos.txt";
            
        FileReader fr = new FileReader(fullFileName);
        BufferedReader br = new BufferedReader(fr);
        
        ArrayList<String> poslist = new ArrayList<>() ;
        String line = "";
        while ((line = br.readLine()) != null){
            poslist.add(line);
        }
        br.close();
        
//        System.out.println(poslist.size());
        
        Map<String,Integer> map = new HashMap<>();
        int k = 0;
        for (String i : poslist){
            map.put(i,0);
            k++;
        }
//        System.out.println(k);
//        System.out.println(map);
        
        for(String word: poslist){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
        } 
        
        for(String word: map.keySet()){
            System.out.println(map.get(word));
//            System.out.println(word + " " + map.get(word));
        }
        
//        System.out.println(map);
    }
}
