package bandinabox;

import java.util.ArrayList;

public class Violin extends Instrument {

    public int getInstrumentNumber() {
        return 41;
    }

    @Override
    public ArrayList<Note> play(ArrayList<Note> song) {
        ArrayList<Note> violinNotes = new ArrayList<Note>();
        for (int i = 0; i < song.size(); i++) {
            Note note = song.get(i);
            if (note.getPitch() == 'a' || note.getPitch() == 'g' || note.getPitch() == 'e' || note.getPitch() == 'd') {
                //Note note = song.get(i);
                //Note newNote = new Note(note.getPitch(), note.getOctave() - 1);
                violinNotes.add(note);
            }
            else {
                violinNotes.add(null);
            }
        }
        return violinNotes;
    }
}
