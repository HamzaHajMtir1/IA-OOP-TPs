public class Main {
    public static void main(String[] args) {
        if(Integer.parseInt(args[0]) > Integer.parseInt(args[1]))
        {
            System.out.print(Integer.parseInt(args[0]+"superieur a "+args[1] );
        }
        else if(Integer.parseInt(args[0]) < Integer.parseInt(args[1]))
        {
            System.out.print(args[0]+"inferieur a "+args[1] );
        }
        else
            System.out.print("egau");
    }
}