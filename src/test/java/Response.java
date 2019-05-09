import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Map;

@JsonRootName("response")
public class Response {
    @JsonProperty
    String responseDetails;
    @JsonProperty
    Map<String,Feed> responseData;
    @JsonProperty
    String responseStatus;

    public Response() {
    }

    public Response(String responseDetails, Map<String, Feed> responseData, String responseStatus) {
        this.responseDetails = responseDetails;
        this.responseData = responseData;
        this.responseStatus = responseStatus;
    }

    public String getResponseDetails() {
        return responseDetails;
    }

    public void setResponseDetails(String responseDetails) {
        this.responseDetails = responseDetails;
    }

    public Map<String, Feed> getResponseData() {
        return responseData;
    }

    public void setResponseData(Map<String, Feed> responseData) {
        this.responseData = responseData;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responseDetails='" + responseDetails + '\'' +
                ", responseData=" + responseData +
                ", responseStatus='" + responseStatus + '\'' +
                '}';
    }
}
