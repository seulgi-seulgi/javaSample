package day18.prob1;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
		}
		
		for (int i = 1; i <= 29; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("������ ���� á���ϴ�.");
		}

		System.out.println("�ֻ��� ���� : " + stack.top());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");
		System.out.println("== ���� ����Ʈ ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	int[] stack;
	int top = 0;

	public MyStack() {
		stack = new int[10];
	}

	public MyStack(int size) {
		if (size < 0) {
			stack = new int[10];
		} else {
			stack = new int[size];
		}
	}

	public boolean isFull() {
		/*
		 * if(top==stack.length){ return true; }else{ return false;
		 */
		return top == stack.length ? true : false;
	}

	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	public void push(int data) {
		if(isFull()){
			int[] temp = new int[stack.length+10];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			stack[top] = data;
			top++;
			
		}else {
		stack[top] = data;
		top++;
		}
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			return stack[--top];
		}
	}

	public int top() {
		if (isEmpty()) {
			return -1;
		} else {
			return stack[top - 1];
		}
	}
}
