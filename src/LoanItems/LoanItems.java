package LoanItems;

//superclass
public class LoanItems {
    protected String type;
    protected String title;
    protected int id;

    //Constructor
    public LoanItems(int id, String type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public String getTitle(){
        return title;
    }


    //Setters
    public void setID(int id ) {
        this.id = id;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return id + "\t" + type + "\t" + title + "\n";
    }

}
