class Sum_of_n_arg
{
    int sum(int... number)
    {
        int sum=0;
        for(int n:number)
        {
            sum=sum+n;
        }
        return sum;
    }
    double sum(double... numbers)
    {
        double sum=0.0;
        for(double i:numbers)
        {
            sum=sum+i;

        }
        return sum;

    }
}

class Test
{
    public static void main(String args[])
    {
        Sum_of_n_arg f1=new Sum_of_n_arg();
        System.out.println("the sum is "+f1.sum(2+5+8+9+5+6));
        System.out.println("the sum is "+f1.sum(2.1+5.5+8.2+9.5+5.2+6.2));
        System.out.println("the sum is "+f1.sum(2+5+8+9+5+6));
    }
}
