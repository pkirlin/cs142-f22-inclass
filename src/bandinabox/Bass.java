package bandinabox;

import java.util.ArrayList;

public class Bass extends Guitar {
    public Bass() {
        setName("Bass");
    }

    public int getInstrumentNumber() {
        return 33;
    }

    public int getVolume() {
        return 127;
    }

    public ArrayList<Note> play(ArrayList<Note> song) {
        ArrayList<Note> bassnotes = new ArrayList<Note>();
        for (int i = 0; i < song.size(); i++) {
            if (i % 4 == 0) {
                Note note = song.get(i);
                Note newNote = new Note(note.getPitch(), note.getOctave() - 1);
                bassnotes.add(newNote);
            }
            else {
                bassnotes.add(null);
            }
        }
        return bassnotes;
    }

}
