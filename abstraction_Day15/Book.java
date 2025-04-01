package abstraction_Day15;

public abstract class Book {
	String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
