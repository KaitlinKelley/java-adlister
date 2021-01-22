import Models.Album;
import Models.Author;
import Models.Quote;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album al1 = new Album();
        al1.setId(1L);
        al1.setArtist("Katzenjammer");
        al1.setName("Le Pop");
        al1.setReleaseDate(2008);
        al1.setSales(1.2F);
        al1.setGenre("Alternative");

        Album al2 = new Album();
        al2.setId(2L);
        al2.setArtist("Porcupine Tree");
        al2.setName("In Absentia");
        al2.setReleaseDate(2002);
        al2.setSales(1.1F);
        al2.setGenre("Prog");

        Album al3 = new Album();
        al3.setId(3L);
        al3.setArtist("Queen");
        al3.setName("Night at the Opera");
        al3.setReleaseDate(1975);
        al3.setSales(3.3F);
        al3.setGenre("Rock");

//        System.out.println(al1.getArtist() + ", " + al1.getName());
//        System.out.println();

        Author auth1 = new Author();
        auth1.setId(1L);
        auth1.setFirstName("Eleanor");
        auth1.setLastName("Roosevelt");

        Author auth2 = new Author();
        auth2.setId(2L);
        auth2.setFirstName("Helen");
        auth2.setLastName("Keller");

        Author auth3 = new Author();
        auth3.setId(3L);
        auth3.setFirstName("Dr.");
        auth3.setLastName("Seuss");

        Quote q1 = new Quote();
        q1.setId(1L);
        q1.setContent("The future belongs to those who believe in the beauty of their dreams.");
        q1.setAuthor(auth1);

        Quote q2 = new Quote();
        q2.setId(2L);
        q2.setContent("Life is either a daring adventure or nothing at all.");
        q2.setAuthor(auth2);

        Quote q3 = new Quote();
        q3.setId(3L);
        q3.setContent("You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose.");
        q3.setAuthor(auth3);

        ArrayList<Quote> QuoteList = new ArrayList<>();
        QuoteList.add(q1);
        QuoteList.add(q2);
        QuoteList.add(q3);

        for(Quote quote: QuoteList){
            System.out.println(quote.getContent() + "\n --" + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
            System.out.println();
        }



    }
}
