package tlang;
import java.util.HashMap;

public class BasicEnv implements Environment {
	protected HashMap<String, Object> values;
	public BasicEnv() { values = new HashMap<String,Object>(); }
	public void put(String name, Object object) { values.put(name, object); }
	public Object get(String name) { return values.get(name); }
}
