import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.util.ArrayList;

public class BeatBox {
    JPanel mainPanel ;
    ArrayList<JCheckBox> checkboxList ;
    Sequencer sequencer ;
    Sequence secuence ;
    Track track ;
    JFrame theFrame ;

    String[] instrumentNames = {"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare","Crash Cymbal","Hand Clap","High Tom",
            "Hi Bongo","Maracas","Whistle","Low Conga","Cowbell","Vibraslap","Low-mid Tom","High Agogo","Open Hi Conga"} ;
    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63} ;

    public static void main(String[] args) {
        new BeatBox().buildGUI() ;
    }

    public void buildGUI(){
        
    }

}
