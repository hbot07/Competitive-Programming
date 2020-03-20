import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TEST {
public static void main(String args[])
{
    String[] newWords={"one","two","three"};
    ArrayList<String> wordList= new ArrayList<>();
    wordList.add("Mary");
    wordList.add("had");
    wordList.add("a");
    wordList.add("little");
    wordList.add("lamb");
    for(int i=0;i<newWords.length;i++)
    {
        wordList.add(2*i,newWords[i]);
    }
    for(String s:wordList)
        System.out.println(s);
}

}
