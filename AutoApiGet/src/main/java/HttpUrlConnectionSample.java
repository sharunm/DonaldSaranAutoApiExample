import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpUrlConnectionSample {

	public void getMethodExample() throws IOException{
	URL url= new URL("https://ultimateqa.com/dummy-automation-websites/#Fake_address_book_app");
	HttpURLConnection connection= (HttpURLConnection)url.openConnection();
	connection.setRequestMethod("GET");
	connection.connect();
	int statusCode=connection.getResponseCode();
	System.out.println("statuscode is "+statusCode);
	String statusMessage=connection.getResponseMessage();
	System.out.println("statusmessage is "+statusMessage);
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		HttpUrlConnectionSample connectionexample = new HttpUrlConnectionSample();
		connectionexample.getMethodExample();
	}

}

