package builderPattern;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.CoreMatchers.*;

public class RequestSpecBuilderExample {

	private String baseURI;
    private String basePath;
    private String contentType;

    public RequestSpecBuilderExample setBaseURI(String baseURI) {
        this.baseURI = baseURI;
        return this;
    }

    public RequestSpecBuilderExample setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public RequestSpecBuilderExample setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public RequestSpecification build() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        if (baseURI != null) {
            requestSpecBuilder.setBaseUri(baseURI);
        }
        if (basePath != null) {
            requestSpecBuilder.setBasePath(basePath);
        }
        if (contentType != null) {
            requestSpecBuilder.setContentType(contentType);
        }
        return requestSpecBuilder.build();
    }
}
