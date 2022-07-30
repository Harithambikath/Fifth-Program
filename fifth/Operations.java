class Operations
{
    public void addition(int x, int y)
	{
		System.out.println(x+y);
	}
    public static void main(String args[])
    {
        int x=1;
        System.out.println("The Multiplication table of 5 is");
        do
        {
            System.out.println(x*5);
            x++;
        }
        while(x<=20);
    }
}
