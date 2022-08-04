package StringPrbs;

import java.util.Stack;

public class StackPractice {

	//tc =O(n) and sc= o(n)
	public static boolean validate(String exp){
		
		Stack<Character> stk= new Stack<Character>();
		for(int i=0; i<exp.length();i++)
		{
			if(exp.charAt(i)=='('||
			 exp.charAt(i)=='{'||
			 exp.charAt(i)=='[') 
			{
				stk.push(exp.charAt(i));
			}
			else
			{
			  if(!stk.empty()) 
			  {
				  char t= stk.peek();
					if((t=='{'&& exp.charAt(i)=='}')||
						(t=='('&& exp.charAt(i)==')')||
					    (t=='['&& exp.charAt(i)==']')) {
						stk.pop();
					}
					else {
						return false;
					}
				  
			  }
			  else{
				 return false; 
			  }
			}
			
		}
		
		if(stk.empty()) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
	public static String toPostfix(String str) {
		Stack <Character> stack= new Stack<Character>();
		char[] ip=str.toCharArray();
		String postFix=new String("");
		for(int i=0;i<ip.length;i++) {
			
			char value=ip[i];
			if(Character.isLetterOrDigit(value)) {
				postFix+=value;
			}
			else if(value=='(') {
				stack.push(value);
			}			
			else if(value==')') {
				while(!stack.isEmpty()&&stack.peek()!='(')
				{
					postFix+=stack.pop();
				
				}
				if(stack.peek()=='(') {
					stack.pop();
				}
			}
			else {
				while(!stack.isEmpty()&&Prec(value)<=Prec(stack.peek())) {
					postFix+=stack.pop();
				}
				stack.push(value);
			}
		}
		while(!stack.isEmpty()) {
			if(stack.peek()=='(') {
				return "Invalid expression";
			}
			postFix+=stack.pop();
		}
		return postFix;
	}
	public static int evaluatePostFix(String exp) {
		
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<exp.length();i++) {
			char value=exp.charAt(i);
			if(Character.isDigit(value)) {
				stack.push(Character.getNumericValue(value));
				
			}
			else {
				int v1=stack.pop();
				int v2=stack.pop();
				switch(value) {
				case '+':
					stack.push(v2+v1);
					break;
				case '-':
					stack.push(v2-v1);
					break;
				case '*':
					stack.push(v2*v1);
					break;
				case '/':
					stack.push(v2/v1);
					break;
				}
			}
		}
		
		return stack.pop();
	}
	public static Stack<Integer> pushBottom(Stack <Integer> stk, int ele){
		if(stk.empty()) 
		{
			stk.push(ele);
			return stk;
		}
		int t=stk.peek();
		stk.pop();
		pushBottom(stk,ele);
		stk.push(t);
		return stk;
	}
	
	public static Stack<Integer> sortStack(Stack <Integer> stk){
		if(stk.empty()) {
			return stk;
		}
		int t= stk.peek();
		stk.pop();
		sortStack(stk);
		insertSortedly(stk,t);
		
		return stk;
	}
	public static void  insertSortedly(Stack <Integer> stk,int n){
		if((stk.empty())||(!stk.empty()&&stk.peek()<n)) {
			stk.push(n);
			return ;
		}
		int t= stk.peek();
		stk.pop();
		insertSortedly(stk,n);
		stk.push(t);
	}
	
   public static Stack <Integer>  reverseStatck(Stack <Integer> stk){
		if(stk.empty()) {
			return stk;
		}
		
		int t= stk.peek();
		stk.pop();
		reverseStatck(stk);
		pushBottom(stk,t);
		
		return stk;
	}
	
}
