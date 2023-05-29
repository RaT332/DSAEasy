package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseWordsInString {


    //Approach 1 (Stack Approach)
    // TimeComplexity : O(N)
    // SpaceComplexity : O(N)

    public static String aReverseWordsOf(String S) {

        Stack<String> stack = new Stack<>();
        StringBuilder ans= new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)!='.'){
                ans.append(S.charAt(i));
            } else {
                stack.push(ans.toString());
                ans = new StringBuilder();
            }
        }

        stack.push(ans.toString());
        ans=new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.peek());
            stack.pop();
            if (!stack.isEmpty())
                ans.append('.');
        }

        return ans.toString();
    }

    //Approach 2 (List Approach)
    // TimeComplexity : O(N)
    // SpaceComplexity : O(N)
    public static String bReverseWordsOf(String S){

        List<String> words = new ArrayList<>();
        StringBuilder currentWord= new StringBuilder();

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='.'){
                currentWord.append(S.charAt(i));
            }else{
                words.add(currentWord.toString());
                currentWord = new StringBuilder();
            }
        }

        words.add(currentWord.toString());

        StringBuilder result= new StringBuilder();

        for(int i=words.size()-1;i>=0;i--){
            if(i!=0)
                result.append(words.get(i)).append('.');
            else
                result.append(words.get(i));

        }

        return result.toString();
    }
}
