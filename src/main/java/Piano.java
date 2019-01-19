import java.util.List;

//Add jfugue jar
import org.jfugue.Player;

public class Piano {

	public void play(List<Note> song) {
		Player player = new Player();
		
		StringBuilder songNotes = new StringBuilder();
		song.forEach(n -> {
			songNotes.append(n.symbol()+" ");
		});
		player.play(songNotes.toString());
	}
	
}
