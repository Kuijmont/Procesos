package ejemplos;

import java.io.IOException;
import java.util.Arrays;

public class RunProcess2 {
	public static void main(String[] args) {
		try {
			Runtime runtime = Runtime.getRuntime();
			Process process = runtime.exec("calc");
			// process.destroy();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
