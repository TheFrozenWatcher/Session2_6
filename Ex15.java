package BaiTap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex15 {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            // Remove all new lines
            content = content.replaceAll("\\n+", "");

            // Updated regex pattern (removed extra backslashes)
            Pattern p = Pattern.compile("<h3 class=\"article-title\"><a\\s+href=\"([^\"]+)\">([^<]+)</a></h3>");
            Matcher m = p.matcher(content);


            while (m.find()) {
                String link = m.group(1);
                String headline = m.group(2).replaceAll("&quot;", ""); // Exclude &quot;
                System.out.println("Headline: " + headline);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


