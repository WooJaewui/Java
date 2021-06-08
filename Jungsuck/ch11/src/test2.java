import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack sta = new Stack();
		
		sta.push(5);
		sta.push(6);
		sta.push(7);
		
		System.out.println(sta.pop());
		
		sta.push(80);
		
		System.out.println(sta);
		
		Queue que = new LinkedList();
		
		que.offer(10);
		que.offer(9);
		que.offer(8);
		que.offer(7);
		
		System.out.println(que);
		que.poll();
		
		
		System.out.println(que);
		
		System.out.println(que.isEmpty());
		
		
	}

}
