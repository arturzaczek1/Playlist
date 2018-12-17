import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Music implements PlayAble {
    String title;

    @Override
    public String play() {
        return toString();
    }

    @Override
    public String toString() {
        return " Music: " + title;
    }
}
