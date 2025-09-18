package LoanItems;

public class Video extends LoanItems{
    public Video (int id, String type, String title ){
        super (id, type, title);
    }

    @Override
    public String toString(){
        return (id+ "\t" + type.toUpperCase() + "\t " + title + "\n");
    }
}
