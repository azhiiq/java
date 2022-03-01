
public class Strings {

	public static void main(String[] args) {
		Strdemo obj = new Strdemo();
		obj.comparision();
	
	
		
    String firstname= "Mohammed";
	String secondname="Ashiq";
	String name = firstname + " " + secondname;
	System.out.println(name);
	
	char cha[]= {'M', 'o','h','a','m','m','e','d'};	
	String str1= new String(cha);
	String str2= new String("the name is mohammed");
	String str3="ashi";
	System.out.println(str1 + " " + str2 + " "+str3+ " ");
	System.out.println(str3.charAt(3));
	
int a[]= {10,20,30,40,50};
System.out.println("Array length: " + a.length);
System.out.println((a[1] + a[2]));

}
}

class Strdemo{
	void comparision() {
		String a= "Ashi",b="Akeel",c="arif";
		String aa = new String("ashi");
		String d = aa;
		if(aa == d)
			System.out.println("True");
		else
			System.out.println("False");
		if(aa.equalsIgnoreCase(d))
			System.out.println("True");
		else
			System.out.println("False");

		
		

	}
}
