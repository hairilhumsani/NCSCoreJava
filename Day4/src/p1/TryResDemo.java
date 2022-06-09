package p1;

class ApplicationProcessException extends Exception{}
class ApplicationCloseException extends Exception{}


class MobileApplication implements AutoCloseable
{
	public void doAppThings()throws ApplicationProcessException
	{
		System.out.println("application is executing....");
		throw new ApplicationProcessException();
		
	}
	@Override
	public void close()throws ApplicationCloseException
	{
		System.out.println("App closing process executes ...");
		throw new ApplicationCloseException();
	}
}


public class TryResDemo {
	
	public static void main(String[] args) {
		
		try(MobileApplication whatsapp = new MobileApplication())
		{
			whatsapp.doAppThings();
		}
		catch (Exception e) {
			System.out.println("catch block :- "+e);
			//System.out.println(e.getSuppressed()[0]);
			Throwable arr[] = e.getSuppressed();
			if(arr != null)
			{
				for (Throwable t : arr) {
					System.out.println(t);
				}
			}
		}
		
	}

}
















