package mc.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebUtil {
	public static void main(String[] args) {
		readWebPage();
	}

	private static void readWebPage() {
		URL url;
		String line;
		StringBuilder sb = new StringBuilder();
		
		try {
			url = new URL("http://www.google.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
			}

			System.out.println(sb);
		} catch ( IOException e) {
			e.printStackTrace();
		}

	}

}
