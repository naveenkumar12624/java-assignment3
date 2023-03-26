
import java.util.InputMismatchException;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        try {
            int num1, num2;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the divident: ");
            num1=sc.nextInt();
            System.out.println("Enter the divisor: ");
            num2=sc.nextInt();
            int divi = num1 % num2;
            System.out.println("Quotient: " + divi);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }catch (ArithmeticException  e)
        {
            System.out.print(e);
        }
    }
    }

OUTPUT:

*ARITHMETIC EXCEPTION*

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=7750:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Exceptions\out\production\Exceptions Numbers

Enter the divident: 
10
Enter the divisor: 
0
java.lang.ArithmeticException: / by zero
Process finished with exit code 0
    
    
*INPUT MISSMATCH EXCEPTION*

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=7994:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Exceptions\out\production\Exceptions Numbers

Enter the divident: 
hello
java.util.InputMismatchException

Process finished with exit code 0

