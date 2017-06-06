import java.util.Random;

public class MemeText
{
	private String text;
	private int odds = 3;

	public MemeText(String s)
	{
		String temp = "";
		char tempChar;
		Random rand = new Random();

		for (int i = 0; i < s.length(); i++)
		{
			if (rand.nextInt(odds) == 0)
			{
				tempChar = s.charAt(i);
				tempChar = Character.toUpperCase(tempChar);
			}
			else
			{
				tempChar = s.charAt(i);
				tempChar = Character.toLowerCase(tempChar);
			}

			temp += tempChar;
		}

		text = temp;
	}

	public MemeText(String s, int o)
	{
		odds = o;
		String temp = "";
		char tempChar;
		Random rand = new Random();

		for (int i = 0; i < s.length(); i++)
		{
			if (rand.nextInt(odds) == 0)
			{
				tempChar = s.charAt(i);
				tempChar = Character.toUpperCase(tempChar);
			}
			else
			{
				tempChar = s.charAt(i);
				tempChar = Character.toLowerCase(tempChar);
			}

			temp += tempChar;
		}

		text = temp;
	}

	public String getText()
	{
		return text;
	}

	public static void main(String[] args)
	{
		try
		{
			MemeText mt = new MemeText(args[0], Integer.parseInt(args[1]));
			System.out.println(mt.getText());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You're missing a parameter!");
		}
	}
}