class ArraySortExample
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String[] myArray = new String[] {"2a","5b","3c","6d"};
		java.util.Arrays.sort(myArray, java.text.Collator.getInstance());
		for(int i=0;i<myArray.length;i++)
		System.out.println(myArray[i]);
	}
}
