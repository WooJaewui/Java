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
				System.out.println("��ȣ�� �� ó���Ǿ����ϴ�.");	// Stack�� ��������� ����.
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");	// Stack�� '('�� ���� ������ ����.
			}
		} catch (Exception e) {
			
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.22");	//  ')'�� ������ pop������ ���Ƽ� Exception �߻�.
		}
		
		
		
	}

}
