
Question 02:


interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class Mycalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n)
    {
        int i;
        int sum=0;
        for (i = 1; i <= n; i++)
        {
            if (n<=1000 && n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n>1000)
        {
                System.out.println("Enter a number within the range of 1000.");
        }
        return sum;
    }
}


Main funtion:

public class Main1 {
    public static void main(String[] args) {
        Mycalculator m=new Mycalculator();
        System.out.println("I implemented:AdvancedArithmetic");
        System.out.println("The sum divisors is : "+m.divisor_sum(20));
    }
}


OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=2323:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Abstraction\out\production\Abstraction Main1

I implemented:AdvancedArithmetic
The sum divisors is : 42

Process finished with exit code 0

