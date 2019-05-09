public class Response {
    String responseDetails;
    Feed responseData;
    String responseStatus;

    public Response() {
    }

    public Response(String responseDetails, Feed responseData, String responseStatus) {
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

    public Feed getResponseData() {
        return responseData;
    }

    public void setResponseData(Feed responseData) {
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
