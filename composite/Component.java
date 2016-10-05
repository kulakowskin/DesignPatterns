package composite;

public abstract class Component{

      protected Component parent = null;
      protected boolean isComposite = false;
      protected int noOfChildren = 0;
      protected int level = 0;

      //    to be overriden based on type of component
      public void add(Component c){}

      //    to be overriden based on type of component
      public void remove(Component c){}

      // default implementation to be overriden by Composite
      public Component getChild(int i){
            return null;
      }

      // used for recursively updating level of components after adds and removes
      public void updateLevel(){
            level = parent.level+1;
            if(noOfChildren != 0){
                  for (int i = 0; i<noOfChildren; i++) {
                        getChild(i).updateLevel();
                  }
            }
      }

      // to be overriden by Leaf class
      public String toString(){
            String str = "";
            for(int i = level; i>0; i--){
                  str+="\t";
            }
            str += getClass().toString();
            if(noOfChildren != 0){
                  str+=" containing\n";
                  for (int i = 0; i<this.noOfChildren; i++)
                        str += getChild(i).toString();
            }
            else{
                  str+="\n";
            }
            return str;
      }
}
