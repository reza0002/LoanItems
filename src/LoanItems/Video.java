package LoanItems;

public class Video extends LoanItems{
    public Video (String type, String title ){
        super (type, title);
    }

    @Override
    public String toString(){
        return ( " " + " " + type + " " + title + " ");
    }
}
