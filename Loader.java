import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Loader {

	public static void main(String[] args) throws IOException {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		Runtime.getRuntime().exec(s+"\\ak.exe", null, new File(s));

	}

}
