package GenericClasses;

import java.util.ArrayList;
import java.util.List;

    public class Music <Thing> {
        List<Thing> musics;

        public Music() {
            this.musics = new ArrayList<Thing>();
        }

        public List<Thing> getMusics() {
            return musics;
        }

        public void setMusics(List<Thing> musics) {
            this.musics = musics;
        }

        public void addMusic(Thing music) {
            musics.add(music);
        }

        public List<Thing> filterByGenre(String genre) {

            List<Thing> filtered = new ArrayList<Thing>();

            for (Thing music : musics) {
                if (music instanceof IMusicGenre && ((IMusicGenre) music).getGenre().equals(genre)) {
                    filtered.add(music);
                }
            }
            return filtered;
        }
    }

