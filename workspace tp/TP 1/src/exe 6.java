public class main {
  public static void main(String[] args){
    float nombre = float.valueOf(args[0]);
    if(args.length==0)
    {
      System.exit(1);
    }
    else if(nombre >= 10)
    {
      System.out.print("Admis");
    }
    else
    {
      System.out.print("Refuser");
    }
  }
}