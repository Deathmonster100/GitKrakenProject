//Pranav Sudheer - I learned how to use how to use GitKraken and work with others to merge code without being in person. 

public class proj
{
    interface PerfectSquare
    {
        boolean isPerfectSquare(double n);
    }
    interface PQuotient
    {
        void printQuotient(float x, float y);
    }

    public proj()
    {
        PerfectSquare ps = (double x)->
        {
            double num = Math.sqrt(x);
            if(num%1==0)
                return true;
            return false;
        };
        System.out.println(ps.isPerfectSquare(64));
        System.out.println(ps.isPerfectSquare(5));
        PQuotient run = (x,y)-> System.out.printf("The quotient of %.3f and %.3f is : %.3f.",x,y,x/y);
        run.printQuotient(4.0f,6.0f);
        System.out.println();
    }
    public static void main(String[]args)
    {
        proj app = new proj();
    }
}

