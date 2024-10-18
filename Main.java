import java.util.*;

public class Main {
    public static void main(String[] args) {
       ArrayList<String> listOne = new ArrayList<String>();
       listOne.add("an");
       listOne.add("band");
       listOne.add("band");
       listOne.add("abandon");
    
       WordChecker y = new WordChecker(listOne);

       System.out.println(y.isWordChain());
    }
}

