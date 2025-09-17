package LoanItems;

public class Book extends LoanItems { //udvider til superclassen
    public Book (String type, String title){
        super (type, title);
    }

    @Override
 public String toString(){
        return ("\t" + type + "\t" +  title + "\n");
    }
}
