//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book a = new Book( "R18comic" , 2018 , "Kakao" , 100 );
        Magazine b = new Magazine( 119 , "khongbiet" , 2023 ,  "HKT" );
        a.setTitle( "nnnnn") ;
        a.setAuthor("mmmmm") ;
        a.setIsbn(200);
        a.setYearPublished(2008);
        a.getDetails();
        b.setTitle( "nnnnn") ;
        b.setPublisher( "bbbbb ");
        b.setYearPublished( 2005 );
        b.setIssueNumber( 500 );
        b.getDetails();
    }
}