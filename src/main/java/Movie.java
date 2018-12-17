import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Movie implements PlayAble {
    String title;


    @Override
    public String toString() {
        return " Movie: " +
                title;
    }

    @Override
    public String play() {
        return toString();
    }
}
