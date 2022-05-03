
public class Echo {
    public static void main(String[] args) {
        System.out.println("Num of command-line args : " + args.length + ", which are:");        
        for (String s: args) {
            System.out.println(s);
        }
    }
}