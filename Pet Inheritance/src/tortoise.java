public class tortoise extends reptile
	{
	protected tortoise(String n, String f, String i, String m, String s)
		{
		name = n;
		food = f;
		noise = i;
		movement = m;
		sleepingPatterns = s;
		}

	@Override
	protected void makesNoise()
		{
		System.out.println();
		}
	protected void eat()
	{
	System.out.println();
	}
	protected void drink()
	{
	System.out.println();
	}protected void move()
	{
	System.out.println();
	}
	}