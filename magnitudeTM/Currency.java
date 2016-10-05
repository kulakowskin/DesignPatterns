package magnitudeTM;

public class Currency extends Magnitude{

      private double value;

      public Currency(double val){
            value = val;
      }

      // Opportunity for error if a value other than a double is entered for comparison.
      @Override
      public boolean lessThan(Magnitude m){
            Currency c = (Currency) m;
            return value < c.getValue();
      }

      private double getValue(){
            return value;
      }
}
