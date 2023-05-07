class variabel {
    int bil1;
    int bil2;
        variabel (int bil1, int bil2){
            this.bil1= bil1;
            this.bil2 = bil2;
            
    }

    void print(){
        System.out.println("Bilangan 1          : "+bil1);
        System.out.println("Bilangan 2          : "+bil2);
        System.out.println("Hasil Penjumlahan   : "+(bil1+bil2));
    
    }
}

public class Matematika {
     public static void main (String[]orgs){
         
     variabel hasil1 = new variabel (12, 30);
     hasil1.print();
    
     
     }
 }
