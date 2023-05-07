class variabel {
    double mass;
    double height;
    double grvt;
        variabel (double mass, double height, double grvt){
            this.mass= mass;
            this.height = height;
            this.grvt = grvt;
            
    }

    void print(){
        double Ep;
        Ep= mass*grvt*height;
        System.out.println("Energi Potensial = m.g.h ");
        System.out.println("Massa benda : "+mass);
        System.out.println("Tinggi      : "+height);
        System.out.println("Gravitasi   : "+grvt);
        System.out.println();
        System.out.println("Ep          : "+ String.format("%.2f", Ep)+" J");
    }
}

public class Main {
     public static void main (String[]orgs){
         
     variabel hasil1 = new variabel (12, 9.8, 30);
     hasil1.print();
    
     
     }
 }
