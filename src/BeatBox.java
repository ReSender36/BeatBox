import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
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
        theFrame = new JFrame("Cyber BeatBox") ;
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout() ;
        JPanel background = new JPanel(layout) ;
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkboxList = new ArrayList<JCheckBox>() ;
        Box buttonBox = new Box(BoxLayout.Y_AXIS) ;

        JButton start = new JButton("Start") ;
        start.addActionListener(new MyStartListener());
        buttonBox.add(start) ;

        JButton stop = new JButton("Stop") ;
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop) ;

        JButton upTempo = new JButton("Tempo up!") ;
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo) ;

        JButton downTempo = new JButton("Tempo down!") ;
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo) ;

        Box nameBox = new Box(BoxLayout.Y_AXIS) ;
        for (int i = 1; i < 16; i++)
            nameBox.add(new Label(instrumentNames[i])) ;

        background.add(BorderLayout.EAST, buttonBox) ;
        background.add(BorderLayout.WEST, nameBox) ;

        theFrame.getContentPane().add(background) ;

        GridLayout grid = new GridLayout(16,16) ;
    }

}
