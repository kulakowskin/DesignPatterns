package magnitudeTM;


public abstract class Magnitude{

      // this.lessThan(m)
      // Only overridable function
      // Other functions are composed of lessThan()
      public abstract boolean lessThan(Magnitude m);

      // this<=m in form of this.lessThanEqualTo(m)
      public boolean lessThanEqualTo(Magnitude m){
            return (lessThan(m) || equalTo(m));
      }

      // this==m in form of this.equalTo(m)
      public boolean equalTo(Magnitude m){
            return (!m.lessThan(this) && !this.lessThan(m));
      }

      // this>=m in form of this.greaterThanEqualTo(m)
      public boolean greaterThanEqualTo(Magnitude m){
            return (!lessThan(m) || equalTo(m));
      }
      // this>m in form of this.greaterThan(m)
      public boolean greaterThan(Magnitude m){
            return (!lessThan(m) && !equalTo(m));
      }

      // this!=m in form of this.notEqual(m)
      public boolean notEqual(Magnitude m){
            return !equalTo(m);
      }
}
