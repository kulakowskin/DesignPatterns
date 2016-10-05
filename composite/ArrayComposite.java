package composite;

public class ArrayComposite extends Component{

      protected Component[] array = new Component[10];

      public ArrayComposite(Component... inputs){
            isComposite = true;
            for(Component in:inputs){
                  add(in);
            }
      }

      @Override
      public void add(Component c){
            if(noOfChildren < array.length){
                  array[noOfChildren] = c;
                  c.parent = this;
                  noOfChildren++;
                  c.updateLevel();
            }
            else{
                  System.out.println("Error: Not enough space in ArrayComposite");
            }
      }

      @Override
      public void remove(Component c){
            for(int i=0;i<noOfChildren;i++){
                  if(array[i] == c){
                        //   if component is found, shift array over it to remove
                        for(int j=i;j<noOfChildren;j++){
                              array[j] = array[j+1];
                        }
                        array[noOfChildren-1] = null;
                        noOfChildren--;
                        return;
                  }
            }
            System.out.println("Error: Component to remove not found!");
      }

      @Override
      public Component getChild(int i){
            return array[i];
      }
}
