/*Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']*/
import java.util.ArrayList;
public class StringSplit {
    public static String[] solution(String s) {
     
     String newstr[];
      int len;
      if (s.length()%2!=0){
        len=s.length()/2+1;
        s=s+"_";
      }
      else{
        len=s.length()/2;
      }
      newstr=new String[len];
    String str1[]=s.split("");
    int j=0;
    for(int i=0;i<s.length()-1;i+=2){
      newstr[j++]=str1[i]+str1[i+1];
    }
    return newstr;
    
  }}
