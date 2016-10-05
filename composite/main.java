package composite;

public class main{

      public static void main(String args[]){

             Leaf a = new Leaf("A");
             Leaf b = new Leaf("B");
             Leaf c = new Leaf("C");
             Leaf d = new Leaf("D");
            Leaf e = new Leaf("E");

            ArrayComposite ac = new ArrayComposite(a, b);
            ArrayComposite acChild = new ArrayComposite(c);
            ArrayComposite acGrandChild = new ArrayComposite();
            ac.add(acChild);
            System.out.println(ac.toString());

            System.out.println("\nRemoving Leaf A...");
            ac.remove(a);
            System.out.println("\n\n"+ac.toString());

            System.out.println("\nAdding another ArrayComposite and Leaf E...");
            acChild.add(acGrandChild);
            acGrandChild.add(d);
            ac.add(e);
            System.out.println("\n"+ac.toString());

            System.out.println("\nRemoving ArrayComposite...");
            ac.remove(acChild);
            System.out.println("\n\n"+ac.toString()+"\n\n");

            System.out.println("\nAdding LinkedComposite...");
            LinkedComposite lc = new LinkedComposite(a,c);
            ac.add(lc);
            System.out.println("\n"+ac.toString());

            System.out.println("\nRemoving Leaf A...");
            lc.remove(a);
            System.out.println("\n"+ac.toString());

      }
}
