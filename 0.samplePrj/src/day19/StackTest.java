package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		//Stack<Integer> stack = new Stack<Integer>();
		Stack<String> stack = new Stack<String>();	//모든 데이터 타입 허용
		
		for(int i =1; i<=77; i++){
			//stack.push(i);
			stack.push(""+i);
		}

		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i<=10;i++){
			queue.offer(i);
		}
		System.out.println(queue.poll());
	}

}
