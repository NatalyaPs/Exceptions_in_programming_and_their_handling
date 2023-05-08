import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/* Улучшить код, обработать исключения, используя ресурсный try:
----------------------------------------------------------------
private static void rwLine(Path pathRead, Path pathWrite) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = Files.newBufferedReader(pathRead);
            out = Files.newBufferedWriter(pathWrite);
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/

public class sem_3_0 {
    private static void rwLine(Path pathRead, Path pathWrite) {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
