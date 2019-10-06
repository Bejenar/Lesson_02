package bean;

import java.util.Comparator;

public class SortDigits implements Comparator<Digit>
{
	public int compare(Digit a, Digit b)
	{
		return a.getLength() - b.getLength();
	}
}