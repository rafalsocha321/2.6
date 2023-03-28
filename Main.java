import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
    int tablica[]= new int[5];
    System.out.println("Podaj 5 liczb :");
    for(int i=0; i<5; i++){
      tablica[i]= scanner.nextInt();
    }

    int suma=0;
    for(int i=0; i<5; i++){
      if(tablica[i]%3==0){
        suma+=tablica[i];
      }
    }
    
    
    System.out.println("Suma wpisanych liczb podzielnych przez 3 wynosi " + suma);
  }
}