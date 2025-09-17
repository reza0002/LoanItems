package LoanItems;

public class Book extends LoanItems { //udvider til superclassen
    public Book (int id, String type, String title){
        super (id, type, title);
    }

    @Override
 public String toString(){
        return (id + "\t" + type + "\t" +  title + "\n");
    }
}
