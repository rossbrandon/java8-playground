import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

    public static void main(String[] args) {

        // anonymous class
        FileFilter filter = new FileFilter() {

            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        File dir = new File("data/java");
        File[] files = dir.listFiles(filter);

        System.out.println("\nWith an Anonymous Class");
        for (File file : files) {
            System.out.println(file);
        }

        // same logic done with lambdas
        FileFilter filterLambda = (File file) -> file.getName().endsWith(".java");

        files = dir.listFiles(filterLambda);

        System.out.println("\nWith a Lambda");
        for (File file : files) {
            System.out.println(file);
        }
    }
}
