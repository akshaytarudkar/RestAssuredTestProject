package oopsImplememtation;

public class ImplementationMainMethod {

	 public static void main(String[] args) {
	        // Creating instances of each request class and calling the respective methods
	        GetRequest getRequest = new GetRequest();
	        getRequest.sendGetRequest();

	        PostRequest postRequest = new PostRequest();
	        postRequest.sendPostRequest();

	        PutRequest putRequest = new PutRequest();
	        putRequest.sendPutRequest();
	    }
}
