public class main {
  public static void main(String[] args){
    int nombre = Integer.parseInt(args[0]);
    int nombre1 = Integer.parseInt(args[0]);

    System.out.print(nombre + nombre1);
    System.out.print(abs(nombre - nombre1));
    System.out.print(nombre * nombre1);
    if(nombre1==0)
    {
        System.out.print("erreur !!!");
    }
    else
    {
        System.out.print(nombre / nombre1);
    }
  }
}