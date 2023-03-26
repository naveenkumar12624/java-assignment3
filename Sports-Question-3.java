
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer class.";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

Main Function:

public class Solution {
    public static void main(String[] args) {
        Sports s;
        s=new Sports();
        System.out.println(""+s.getName());
        s.getNumberOfTeamMembers();
        s=new Soccer();
        System.out.println(""+s.getName());
        s.getNumberOfTeamMembers();
    }
}


OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=5243:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Inheritence\out\production\Inheritence Solution

Generic Sports
Each team has n players in Generic Sports
Soccer class.
Each team has 11 players in Soccer class.

Process finished with exit code 0
