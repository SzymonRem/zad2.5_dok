import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    double pole=0;
    System.out.println("1.Pole prostokąta\n 2.Pole trójkąta prostokątnego");
    System.out.println("3.Srednia\n 4. Mediana");
    Scanner scan = new Scanner(System.in);
    int wybor=scan.nextInt();
    switch(wybor){
      case 1:
        { System.out.println("Podaj a");
    double a =scan.nextDouble();
     System.out.println("Podaj b");
    int b =scan.nextInt();
        pole= a*b;
       System.out.println("Pole prostokąta\n" + pole);
         break;
        }
      
      case 2:
        {
         System.out.println("Podaj a");
    double c =scan.nextDouble();
        System.out.println("Podaj h");
    double h =scan.nextDouble();
        pole =(c*h)/2;
         System.out.println("Pole trojkata prostokatnego\n" + pole);
          break;
        }
     
      case 3:
        {
          double[] tab = new double[10];
        Random rand = new Random();
        double n=0;
          for(int i=0;i<10;i++)
        {
           tab[i]=rand.nextDouble(101);
         n+=tab[i];
        }
          for(int i=0;i<10;i++)
        {
            System.out.println(tab[i]);
        }
          double srednia=n/10;
        System.out.println("Srednia wynosi\n"+ srednia);
          break;
        }
      case 4:
        {
        double[] tab = new double[10];
       Random r = new Random();
        for(int i=0;i<10;i++)
        {
           tab[i]=r.nextDouble(101);
         
        }
          Arrays.sort(tab);
       for(int i=0;i<10;i++)
        {
            System.out.println(tab[i]);
        }
        double Mediana=(tab[4]+tab[5])/2;
        System.out.println("Mediana\n"+Mediana);
          break;
        }
    }
   
      
    
  }
}