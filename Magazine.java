public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publisher;
    public Magazine(int issueNumber, String title, int yearPublished, String publisher) {
        super(title , yearPublished);
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void getDetails() {
        System.out.println( " INFORMATION OF MAGAZINE : ");
        System.out.println("Title: " + getTitle());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("issueNumber: " + getIssueNumber());
    }
}
