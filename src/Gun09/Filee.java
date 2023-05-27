package Gun09;

import java.io.*;

public class Filee {
    public static void main(String[] args) throws IOException {
        File f1= new File("src/Gun09/info.txt");
        if (!f1.exists()){
            f1.createNewFile();

        }

        FileReader fr1=new FileReader(f1);
        BufferedReader bf=new BufferedReader(fr1);

        String usName="";
        String password="";
        String atanan=" ";
        while ((atanan=bf.readLine())!=null) {
            if (atanan.contains("password")){
                for (int i = 1; i < atanan.length(); i++) {
                    if (atanan.substring(i-1,i).contains(":")){
                        password=atanan.substring(i);

                    }

                }

            }else
                if (atanan.contains("username")){
                    for (int i = 1; i < atanan.length(); i++) {
                        if (atanan.substring(i-1,i).contains(":")){
                            usName=atanan.substring(i);

                        }

                    }
                }
        }
        bf.close();
        System.out.println("usName = " + usName);
        System.out.println("password = " + password);





    }
}

