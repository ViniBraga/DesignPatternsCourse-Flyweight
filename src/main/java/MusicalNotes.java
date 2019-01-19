import java.util.HashMap;
import java.util.Map;

public class MusicalNotes {

	private static Map<String, Note> notes = new HashMap<>();
	
	// The static constructor is executed only once, when JVM execute this class
	static {
		notes.put("do", new Do());
		notes.put("re", new Re());
		notes.put("mi", new Mi());
		notes.put("fa", new Fa());
		notes.put("sol", new Sol());
		notes.put("la", new La());
		notes.put("si", new Si());
	}
	
	public Note of(String name) {
		return notes.get(name);
	}
	
}
