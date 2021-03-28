import java.io.*;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;

public class test {

    private final String USER__AGENT = "Mozilla/5.0";

    public static void main(String[]args) throws Exception {

        test http = new test();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGetUrl();

     //   System.out.println("\nTesting 2 - Send Http POST request");
     //   http.sendPost();

    }
    private void sendGetUrl() throws Exception{
        String url = "https://rapidapi.p.rapidapi.com/exchange?from=EUR&to=TRY&q=1.0";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

       //optional default is GET
        con.setRequestMethod("GET");

       //add request header
        con.setRequestProperty("User-Agent", USER__AGENT);
        con.setRequestProperty("x-rapidapi-host", "currency-exchange.p.rapidapi.com");
        con.setRequestProperty("x-rapidapi-key", "e65ff606d3msha29e85a3e04664cp133d4ajsnbf7e40ad75c4");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.json")))) {
        writer.write(response.toString());
        }
      
       //print result
        System.out.println(response.toString());
        }
     /*   HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://rapidapi.p.rapidapi.com/v1/links/new?destination=https%3A%2F%2Frapidapi.com%2F"))
		.header("x-rapidapi-host", "url-link-shortener.p.rapidapi.com")
		.header("x-rapidapi-key", "e65ff606d3msha29e85a3e04664cp133d4ajsnbf7e40ad75c4")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
    }*/



   //HTTP GET request
    private void sendGet() throws Exception {

        String url = "http://www.google.com/search?q=mkyong";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

       //optional default is GET
        con.setRequestMethod("GET");

       //add request header
        con.setRequestProperty("User-Agent", USER__AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G:/Users/Sefa/Desktop/test.html")))) {
        writer.write(response.toString());
        }
      
       //print result
        System.out.println(response.toString());

    }



    

   //HTTP POST request
    private void sendPost() throws Exception {

        String url = "https://selfsolve.apple.com/wcResults.do";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

       //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER__AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

       //Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

       //print result
        System.out.println(response.toString());

    }

}