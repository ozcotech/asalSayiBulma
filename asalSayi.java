/**
 * asalSayi
 */
public class asalSayi {

  public static void main(String[] args) {
    

    System.out.print("1'den 100'e kadar olan asal sayıları bulalım: \n");
    int n = 100;

    System.out.print("Asal Sayılar: ");
    int i;

    for (i = 2; i < n; i++){

      boolean durum = true;

      for (int j = 2; j <= i / 2; j++){

        if (i % j == 0){
          durum = false;
          break;

        }

      }
      if (durum){
        System.out.print(" " + i);
      }


      
    }
    
    
    
    
  }
}