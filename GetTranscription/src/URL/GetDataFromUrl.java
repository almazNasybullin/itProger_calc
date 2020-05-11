package URL;
import java.net.*;
import java.io.*;

public class GetDataFromUrl {

    public  GetDataFromUrl(String word) throws Exception {
        URL wordHunt = new URL("https://wooordhunt.ru/word/" + word);
        URLConnection yc = wordHunt.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
