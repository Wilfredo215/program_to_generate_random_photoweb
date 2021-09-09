import java.util.*;
import java.util.Random;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

/*
 * main
 */
public class main {

    public static void main(String[] args) throws InterruptedException {
      randomChar();  
    }

    public static void randomChar() throws InterruptedException {
        int max = 9999;
        int min = 1000;
        Random r = new Random();
        int randomInts;
        while(true){
        char first = (char)(r.nextInt(26) + 'a');
        char second = (char)(r.nextInt(26) + 'a');
        int randomNum = r.nextInt((max - min) + 1) + min;
        String generator = first+""+second + randomNum;
        System.out.println(generator);
        //return generator;
        Desktop d = Desktop.getDesktop();
          try {
              d.browse(new URI("https://prnt.sc/" + generator));
          } catch (IOException | URISyntaxException e2) {
              e2.printStackTrace();
          } 

          TimeUnit.SECONDS.sleep(5);
        }
            }

}