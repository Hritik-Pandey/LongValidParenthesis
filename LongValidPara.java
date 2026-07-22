import java.util.Scanner;
import java.util.Stack;

public class LongValidPara {

    public static int ValidPara(String s){
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int maxLength=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s= sc.nextLine();

        int result= ValidPara(s);

        System.out.println("Longest Valid Parenthesis Length: "+ result);

        sc.close();
    }

}