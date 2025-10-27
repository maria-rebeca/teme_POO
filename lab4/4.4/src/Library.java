public class Library {

    public static final String location = "Ceahlau 77 Zorilor Cluj";

    private int shelve;
    private Book book;
    private String genreLabel;

    public Library(int shelve, Book book, String genreLabel) {
        this.shelve = shelve;
        this.book = book;
        this.genreLabel = genreLabel;
    }

    public Library(){
        this(0,null,"Unkonwn");
    }

    public void setShelve(int shelve){
        this.shelve = shelve;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public void setGenreLabel(String genreLabel){
        this.genreLabel = genreLabel;
    }

    public int getShelve(){
        return shelve;
    }

    public Book getBook(){
        return book;
    }

    public String getGenreLabel(){
        return genreLabel;
    }

    public void borrowBook(String title, String author){
        boolean titleMatches = this.book.getTitle().equals(title);
        boolean authorMatches = this.book.getAuthor().equals(author);
        if(titleMatches && authorMatches){
            if(this.book.isAvailable()){
                this.book.setAvailable(false);
                System.out.println("Book "+this.book.getTitle()+ " has been borrowed!");
            }
            else{
                System.out.println("Book "+this.book.getTitle()+ " is not available!");
            }
        }
        else{
            System.out.println("We do not have the book "+this.book.getTitle());
        }
    }

}
