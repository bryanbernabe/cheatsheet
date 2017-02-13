@WebService(name = "SampleService", serviceName = "SampleService")
public class SampleService {
	@WebMethod(operationName = "SampleMethod")
	@WebResult(name = "SampleResponse")
	public SampleResponse sampleMethod(@WebParam(name = "RequestObject") RequestObject request) {
		return response;
	}

}