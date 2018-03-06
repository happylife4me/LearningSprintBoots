package com.demo.test;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new TestInterface();
		d.print("Test Interface");
		//d.Exprint("Test Interface");
		
		
		demo d1 = new demo(){
			@Override
			public void print(String msg){
				System.out.println(msg);
			}
			
			//public String testing()
			//{
			//	return "hello";
			//}
		};
			
		
		d1.print("Im unknow class");
		
		
		demo d2 = (msg) -> {
			System.out.println(msg);
			System.out.println(msg + "2");
		};
		
		d2.print("Lamda");
	}

}
