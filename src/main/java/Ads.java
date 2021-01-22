import java.util.List;

//We create an interface that describes what the DAO does. The DAO will then implement this interface
public interface Ads {
    //find all the ads records
    List<Ad> all();
}
