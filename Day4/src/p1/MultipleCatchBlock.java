package p1;

class Exc1 extends Exception{}
class Exc2 extends Exc1{}
class Exc3 extends Exc2{}


class SomeWork
{
	public void doSomeWork()throws Exc1
	{
		
	}
}
 // Employee e = new Account();
// Employee e = new SubAccount()
public class MultipleCatchBlock {

	public static void main(String[] args) {
		SomeWork obj = new SomeWork();
		try {
			obj.doSomeWork();
		}
			
		catch(Exc3 e)
		{
			System.out.println(e);
		}
		catch(Exc2 e)
		{
			System.out.println(e);
		}
		catch (Exc1 e) {
			// TODO: handle exception
		}
		catch(Exception e)
		{
			
		}
		
				
	}
}
