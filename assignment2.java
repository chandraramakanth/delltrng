class Welcome
{
	public void accept()
	{
		System.out.println("Welcome in accept");
	}
	public void display()
	{
		System.out.println("Welcome to deloitte");
		System.out.println("\nWelcome to ITPL");
	}
	static public void main(String a[])
	{
		System.out.println("\nWelcome to MAIN");
		Welcome w= new Welcome();
		w.display();
		w.accept();
		Bye b=new Bye();
		b.sayBye();
	}
}
class Bye
{
	public void sayBye()
		{
			System.out.println("BYE C U TOMORROW");
		}
}

	