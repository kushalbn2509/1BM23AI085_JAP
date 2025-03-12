public class Program1b
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=8;i++)
        {
            for(j=i;j<=(8+(i-1));j++)
            {
                if(j%2==0)
                {
                    System.out.print("W ");
                }
                else
                {
                    System.out.print("B ");
                }

            }
            System.out.println();
        }
    }
}