package Day_14;

public class Sports_04 {
    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports_04{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName());
    }

}

class Solution2{

    public static void main(String []args){
        Sports_04 c1 = new Sports_04();

        Soccer c2 = new Soccer();
        System.out.println(c1.getName());

        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());

        c2.getNumberOfTeamMembers();
    }
}
