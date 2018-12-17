import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PlayList implements PlayAble {

    private List<PlayAble> playAbles = new ArrayList<>();

    @Setter
    private PlayMode playMode;

    @Override
    public String play() {

        StringBuilder stringBuilder = new StringBuilder();
        if (playMode == PlayMode.SEQUENTIAL) {
//            for (PlayAble playAble : playAbles) {
//                stringBuilder.append(playAble.play());
//            }
            String temp = playAbles.stream().map(a->a.play()).collect(Collectors.joining(", "));
            stringBuilder.append(temp);
        }

        if (playMode == PlayMode.SHUFFLE) {
            Collections.shuffle(playAbles);
            for (PlayAble playAble : playAbles) {
                stringBuilder.append(playAble.play());
            }
        }
        if (playMode == PlayMode.REPEAT) {
            for (int i = 0; i < playAbles.size() + 1; i++) {
                if (i == playAbles.size()) {
                    i = 0;
                }
                stringBuilder.append(playAbles.get(i).play());
            }
        }
        return stringBuilder.toString();
    }

    public void addPlayAble(PlayAble playAble) {
        playAbles.add(playAble);
    }
}
