package magnitudeTM;

public class main{

      public static void main(String args[]){
            if(currencyTester()){
                  System.out.println("Currency test passsed :)");
            }
            else{
                  System.out.println("Currency test failed :(");
            }

            if(cartPointTester()){
                  System.out.println("CartPoint test passed :)");
            }
            else{
                  System.out.println("CartPoint test failed :(");
            }

      }

      public static boolean currencyTester(){
            Currency c1 = new Currency(0);
            Currency c2 = new Currency(100.32);
            Currency c3 = new Currency(100.32);
            Currency c4 = new Currency(5);
            Currency c5 = new Currency(-7.93);

            return (
                  c1.lessThan(c2) &&
                  c1.notEqual(c2) &&
                  c2.equalTo(c3) &&
                  c3.greaterThanEqualTo(c2) &&
                  c4.greaterThan(c5) &&
                  c5.lessThanEqualTo(c4)
            );
      }

      public static boolean cartPointTester(){
            CartPoint cp1 = new CartPoint(1,0);
            CartPoint cp2 = new CartPoint(-6,10.3);
            CartPoint cp3 = new CartPoint(0,0);
            CartPoint cp4 = new CartPoint(9,-2);
            CartPoint cp5 = new CartPoint(0,1);
            CartPoint cp6 = new CartPoint(2.2, 100);

            return (
                  cp1.lessThan(cp2) &&
                  cp1.lessThanEqualTo(cp5) &&
                  !cp5.equalTo(cp3) &&
                  cp1.equalTo(cp5) &&
                  cp6.greaterThanEqualTo(cp2) &&
                  cp2.greaterThan(cp4) &&
                  !cp5.notEqual(cp1)
            );
      }
}
