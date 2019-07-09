package LibraryApp;

public class Books {

    private String typeBook;
    public String nameBook;
    public int nrOfPagesBook;


    public Books() {
        this.typeBook = "";
        this.nameBook = "";
        this.nrOfPagesBook = 0;
    }

    public Books(String nameBook, int nrOfPagesBook) {
        this.nameBook = nameBook;
        this.nrOfPagesBook = nrOfPagesBook;
    }

    public String getNameBook() {
        return "Name of book";
    }

    public int getNrOfPagesBook() {
        return 0;
    }

    public String getTypeNovel() {return "Novel type";}

    public String getQualityOfPages() {return "QualityOfPages";}

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setNrOfPagesBook(int nrOfPagesBook) {
        this.nrOfPagesBook = nrOfPagesBook;
    }


    public static void missingField() {
        System.out.println("The field cannot remain empty!");
    }

    @Override
    public String toString() {
        return ("Title: "+getNameBook()+"| nr. of pages: "+getNrOfPagesBook()+"| type of novel: "+getTypeNovel()+"| quality of pages: "+getQualityOfPages());
    }


}
