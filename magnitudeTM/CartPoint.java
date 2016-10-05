package magnitudeTM;

public class CartPoint extends Magnitude{

      private double x;
      private double y;
      private double dist;

      public CartPoint(double x, double y){
            this.x = x;
            this.y = y;
            dist = Math.sqrt(x*x + y*y);
      }

      @Override
      public boolean lessThan(Magnitude m){
            CartPoint cp = (CartPoint) m;
            return dist < cp.getDist();
      }

      private double getDist(){
            return dist;
      }
}
