package Gun09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filee2_forFrameworks {
    public static void main(String[] args) throws IOException {

        String m=my_method("username");
        System.out.println("m = " + m);



    }
    public static String my_method(String text) throws IOException {
        File f1 = new File("src/Gun09/info.txt");
        if (!f1.exists()) {
            f1.createNewFile();

        }

        FileReader fr1 = new FileReader(f1);
        BufferedReader bfr1 = new BufferedReader(fr1);
        String atanan;
        String sechim = null;
        while ((atanan = bfr1.readLine()) != null) {

            if (atanan.contains(text)) {
                for (int i = 1; i < atanan.length(); i++) {
                    if (atanan.substring(i - 1, i).contains(":")) {
                        sechim = atanan.substring(i);

                    }

                }
            }


        }
        return sechim;
        }
    }

