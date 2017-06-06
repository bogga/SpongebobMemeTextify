import java.util.Random;

public class MemeText
{
	private String text;

	public MemeText(String s)
	{
		String temp = "";
		char tempChar;
		Random rand = new Random();

		for (int i = 0; i < s.length(); i++)
		{
			if (rand.nextInt(3) == 0)
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
		MemeText mt = new MemeText(args[0]);
		System.out.println(mt.getText());
	}
}