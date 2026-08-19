package Day_14;

public class SolutionAnon_09 {
    static class Inner{
        class Private{

            String powerof2(int num){
                if(num > 0 &&  num % 2 == 0){
                    return "power of 2";
                }

                else{
                    return "not a power of 2";
                }
            }
        }
    }

    public static void main(String[] args) {
        int num = 8;

        Inner in = new Inner();
        Inner.Private p = in.new Private();

        System.out.println(num + " is " + p.powerof2(num));

        System.out.println("An instance of class: "
                        + p.getClass().getCanonicalName().replace("Day_14.", "") + " has been created"
                         );
    }
}
