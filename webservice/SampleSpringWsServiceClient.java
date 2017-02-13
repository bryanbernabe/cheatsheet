public class SampleSpringWsServiceClient extends WebServiceGatewaySupport implements
  SampleServiceClient {


  @Override
  public SampleResponseType sampleServiceMethod
    (RequestObject request) {
 
    ObjectFactory objectFactory = new ObjectFactory();
    JAXBElement<SampleResponseType> responseType = null;
    try {
      responseType = (JAXBElement<SampleResponseType>) this
          .getWebServiceTemplate().marshalSendAndReceive(request, new WebServiceMessageCallback() {
            @Override
            public void doWithMessage(WebServiceMessage message) throws IOException,
              TransformerException {
              ((SoapMessage) message).setSoapAction("ServiceMethod");
            }
          });
    } catch (Exception exception) {
 
    }
    return responseType.getValue();
     
  }
}
