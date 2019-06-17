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

    

    public static void main(String[] args) {
        new BeatBox2().buildGUI() ;
    }

}
