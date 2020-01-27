import java.util.*;

class Parenthesis{

    public boolean isBalanced(String str){
        char[] arr = str.toCharArray();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
                s.push(arr[i]);
            }
            if(arr[i]==')' || arr[i]==']' || arr[i]=='}'){
                if(s.isEmpty()==true){
                    return false;
                }
                if(match(s.pop(),arr[i])==false){
                    return false;
                }
            }
        }

        if(s.isEmpty()==false)
        return false;
        else
        return true;
    }
    boolean match(char a, char b){
        if(a=='(' && b==')'){
            return true;
        }
        else if(a=='[' && b==']'){
            return true;
        }
        else if(a=='{' && b=='}'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Parenthesis obj = new Parenthesis();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(obj.isBalanced(str));
    }
}