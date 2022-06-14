import by.incubator.task2.Main;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JarTask {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        URL [] classLoaderUrls = {new URL("file:///H:\\IdeaProjects\\DevIncJavaTasks\\out\\example.jar")};
        URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);
        Class uploaded = urlClassLoader.loadClass("by.incubator.task2.Main");
        try {
            Main instance = (Main) uploaded.newInstance();
            instance.main(new String[]{});
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
