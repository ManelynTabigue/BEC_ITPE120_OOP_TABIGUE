import java.io.*;

	public class StaticMethod{

		static int a= 10;
		int b= 20;

		void simpleDisplay(){

			System.out.println(a);
			System.out.println(b);
			

		}

		static void staticDisplay(){
			System.out.println(a);
		}


		public static void main(String[] args){

			StaticMethod obj= new StaticMethod();
			obj.simpleDisplay();

			staticDisplay();
		}

	}