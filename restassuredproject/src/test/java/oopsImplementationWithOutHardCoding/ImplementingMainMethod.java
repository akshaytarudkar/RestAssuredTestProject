package oopsImplementationWithOutHardCoding;

public class ImplementingMainMethod {

	public static void main(String[] args) {
        // Define variables for request bodies and URLs
        String postRequestBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";
        String putRequestBody = "{\"id\": 1, \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";
        String getURL = "https://jsonplaceholder.typicode.com/posts/1";
        String postURL = "https://jsonplaceholder.typicode.com/posts";
        String putURL = "https://jsonplaceholder.typicode.com/posts/1";

        // Creating instances of each request class and calling the respective methods
        GetRequest getRequest = new GetRequest();
        getRequest.sendGetRequest(getURL);

        PostRequest postRequest = new PostRequest();
        postRequest.sendPostRequest(postURL, postRequestBody);

        PutRequest putRequest = new PutRequest();
        putRequest.sendPutRequest(putURL, putRequestBody);
    }
}
