package composite;

public class LinkedComposite extends Component{

      protected LinkedList<Component> LL = new LinkedList<Component>();

      public LinkedComposite(Component... inputs){
            isComposite = true;
            for(Component in:inputs){
                  add(in);
            }
      }

      @Override
      public void add(Component c){
            LL.add(c);
            c.parent = this;
            noOfChildren++;
            c.updateLevel();
      }

      @Override
      public void remove(Component c){
            if(LL.remove(c)){
                  noOfChildren--;
            }
      }

      @Override
      public Component getChild(int i){
            LinkedList.Node temp = LL.first;
            for (int x = 1; x<=i; x++){
                  if (temp == null){
                        System.out.println("Child not found in LinkedComposite!");
                        return null;
                  }
                  else{
                        temp = temp.next;
                  }
            }
            return (Component)temp.data;
      }
}
