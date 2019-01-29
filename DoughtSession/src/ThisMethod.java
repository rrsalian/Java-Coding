class Demo{
	Demo(){
		this(10,20,40);
		System.out.println("Default Constructor");
	} 
	Demo(int a){
		this(10,20);
		System.out.println("1 parameterised constructor");
	}
	Demo(int a,int b){
		this();
		System.out.println("2 parameterised constructor");
	}
	Demo(int a,int b,int c){
		System.out.println("3 parameterised constructor");
	}
}

public class ThisMethod {
public static void main(String[] args) {
	Demo d=new Demo(10);
}
}
