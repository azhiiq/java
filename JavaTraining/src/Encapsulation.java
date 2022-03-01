
public class Encapsulation {

	public static void main(String[] args) {
		B obj= new B();
		obj.access();

	}

}
class A{
	private String laptop= "Dell";
	private String Mobile= "samsung";
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;

	}
	public String getMobile() {
		return Mobile;
	}

}
class B extends A{
	void access() {
		System.out.println(getLaptop());
		
   setLaptop("Lenova");
System.out.println();

System.out.println(getLaptop());
	}
}

	
	
	
	
	
	
	
	