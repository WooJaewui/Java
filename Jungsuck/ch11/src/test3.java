import java.util.Stack;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack sta = new Stack();
		
		String expression = "((10+20)*5)";
		
		try {
			
				for (int i =0; i< expression.length(); i++) {
					char value = expression.charAt(i);
					if(value == '(') {
						sta.push(value);
					} else if(value == ')') {
						sta.pop();
					}
			}
			
			if (sta.isEmpty()) {
				System.out.println("괄호가 잘 처리되었습니다.");	// Stack이 비어있을때 실행.
			} else {
				System.out.println("괄호가 일치하지 않습니다.");	// Stack에 '('가 남아 있을때 실행.
			}
		} catch (Exception e) {
			
			System.out.println("괄호가 일치하지 않습니다.22");	//  ')'가 많을때 pop갯수가 많아서 Exception 발생.
		}
		
		
		
	}

}
