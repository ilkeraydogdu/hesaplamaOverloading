package hesaplamaoverloading;
public class HesaplamaOverloading {
    public static void main(String[] args) {
       hesaplama hesap =new hesaplama(); 
       System.out.println("Toplama(a+b): "+hesap.hesapla(1, 9)); 
       System.out.println("Çıkarma(a-b-c): "+hesap.hesapla(5, 7, 4)); 
       System.out.println("Çarpma(a*b): "+hesap.hesapla(1.2, 10.5)); 
       System.out.println("Bölme(a/b): "+hesap.hesapla(22.5, 5.5)); 
    }
    public static class hesaplama{
        public int hesapla(int a, int b){
            return a+b;
        }
        public int hesapla(int a, int b, int c){
            return a-b-c;
        }
        public double hesapla(double a, double b){
            return a*b;
        }
        public float hesapla(float a, float b){
            return a/b; 
        }
    }
}
