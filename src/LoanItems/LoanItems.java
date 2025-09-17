package LoanItems;

//superclass
public class LoanItems {
    protected String type;
    protected String title;

    //Constructor
    public LoanItems(String type, String title) {
        this.type = type;
        this.title = title;
    }

    //Getters
    public String getType(){
        return type;
    }
    public String getTitle(){
        return title;
    }

    //Setters
    public void setType(String type){
        this.type = type;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return " " + type + "\t" + title + "\n";
    }

}
