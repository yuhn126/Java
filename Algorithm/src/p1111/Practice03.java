package p1111;

public class Practice03 {
	String[] bucket;
	int top;
	public int solution(String s){
        int answer = 0;
        String[] splits = s.split("");
        bucket = new String[splits.length];
        
        for(int i=0; i<splits.length; i++) {
        	push(splits[i]);
        	if(top>=2 && splits[top].equals(splits[top-1])) {
        		pop();
        		pop();
        	}
        }
        
        if(top>0) answer=0;
        else answer=1;
        
        System.out.println("top : " + top);
        for(int i=0; i<bucket.length; i++) {
        	System.out.println(bucket[i]);
        }
		return answer;
    }

	public void push(String str) {
		bucket[++top] = str;
	}
	
	public String pop() {
		return bucket[top--];
	}

	public static void main(String[] args) {
		Practice03 p2 = new Practice03();
		System.out.println(p2.solution("baabaa"));
	}
}
