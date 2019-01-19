import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		MusicalNotes notes = new MusicalNotes();
		
		List<Note> song = Arrays.asList(
			notes.of("do"), 
			notes.of("re"),
			notes.of("mi"), 
			notes.of("fa"), 
			notes.of("fa"), 
			notes.of("fa")
		);
		
		Piano piano = new Piano();
		piano.play(song);
	}

}

