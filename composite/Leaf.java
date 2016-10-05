package composite;

public class Leaf extends Component{

      protected String name;

      public Leaf(String name){
            this.name = name;
      }

      @Override
      public String toString(){
            String str = "";
            for(int i = level; i>0; i--){
                  str+="\t";
            }
            str += this.getClass().toString() +" "+ name + "\n";
            return str;
      }
}
