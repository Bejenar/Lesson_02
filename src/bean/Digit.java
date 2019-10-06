package bean;


public class Digit {
	private String value;

	public Digit(int value) {
		this.value = Integer.toString(value);
	}
	

	public int getLength()
	{
		return getValue().length();
	}

	public int compareLengthTo(Digit d) {
		if (this.getLength() > d.getLength())
			return 1;
		if (this.getLength() > d.getLength())
			return -1;
		return 0;
	}
	
	private int[] getDigits()
	{
		int digits[] = new int[10];
		for(int i = 0; i < getValue().length(); i++)
		{
			digits[Character.getNumericValue(getValue().charAt(i))]++;
		}
		
		return digits;
	}
	
	public int uniqueDigitsNumber()
	{
		int digits[] = getDigits();
		
		int digitsNumber = 0;
		for (int d : digits)
			if (d > 0) {
				digitsNumber++;
			}
		
		return digitsNumber;
	}
	
	public boolean isAscendingOrder()
	{
		for (int i = 0; i < value.length() - 1; i++)
		{
			if (Character.getNumericValue(getValue().charAt(i)) >= Character.getNumericValue(getValue().charAt(i + 1)))
				return false;
		}
		
		return true;
	}
	
	public boolean isUniqueDigits()
	{
		int digits[] = getDigits();
		
		for(int i : digits)
		{
			if (i > 1)
				return false;
		}
		
		return true;
	}
	
	public boolean isPalindrom()
	{
		char s[] = getValue().toCharArray();
		for (int i = 0; i < s.length/2; i++)
			if (s[i] != s[s.length - 1 - i])
				return false;
		return true;
	}

	public String getValue() {
		return value;
	}

}

