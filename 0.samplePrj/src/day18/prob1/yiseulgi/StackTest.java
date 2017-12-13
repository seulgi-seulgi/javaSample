package day18.prob1.yiseulgi;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
		}

		for (int i = 1; i <= 10; i++) {
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

	int size;
	int item;
	List<Integer> stack = new ArrayList<Integer>(size);

	public MyStack() {
		setSize(10);
	}

	public MyStack(int size) {
		if (size < 0) {
			setSize(10);
		} else
			setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void push(int item) {
		stack.add(item);
	}

	public boolean isEmpty() {
		if (stack.size() == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (stack.size() == getSize())
			return true;
		else
			return false;
	}

	public int top() {
		if (stack.isEmpty())
			return -1;
		else {
			return stack.get(stack.size() - 1);
		}

	}

	public int pop() {
		if (stack.isEmpty())
			return -1;
		else {
			int top = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			return top;
		}

	}

	@Override
	public String toString() {
		return "MyStack [item]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (item != other.item)
			return false;
		return true;
	}

}
