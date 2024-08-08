class Solution {
    public boolean isValid(String str) {
        if(str.length()%2!=0) return false;
	Stack<Character> stck=new Stack<>();
	for(char chr:str.toCharArray()){
		if(chr=='(' || chr=='[' || chr=='{') stck.push(chr);
		else if(chr==')' && !stck.isEmpty() && stck.peek()=='(') stck.pop();
		else if(chr==']' && !stck.isEmpty() && stck.peek()=='[') stck.pop();
		else if(chr=='}' && !stck.isEmpty() && stck.peek()=='{') stck.pop();
            	else return false;
	}
	return stck.isEmpty();
    }
}
