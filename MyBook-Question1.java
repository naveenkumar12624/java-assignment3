
abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

public class MyBook extends Book{
    void setTitle(String s) {
        this.title = s;
    }

    
Main Function:
    
public class Mainn {
    public static void main(String[] args) {
        MyBook b=new MyBook();
        b.setTitle("The tale of a fairy.");
        System.out.println("The title is : "+b.getTitle());
    }
}

    
    
OUTPUT:
    
C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=1824:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Abstraction\out\production\Abstraction Mainn
The title is : The tale of a fairy.

Process finished with exit code 0
