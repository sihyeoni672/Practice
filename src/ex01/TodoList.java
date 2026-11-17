package ex01;

public class TodoList {
	public static void main(String[] args) {
		// 1. 변수 빛 배열 선언
		String Todo = "<오늘의 할일(To-Do) 3가지>";
		String[] doit = {"9시: 기상", "15시: 운동하기", "18시: 맛있는 저녁밥 먹기"};
		
		System.out.println(Todo);
		
		// 2. 반복문,조건문
		for(int i=0; i<doit.length; i++) {
			if(i<3) {
				System.out.println(i+1 +"번째 할 일: "+doit[i]);
			}else {
				break;
			}
		}
	}

}
