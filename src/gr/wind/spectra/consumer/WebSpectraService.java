
package gr.wind.spectra.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "WebSpectraService", targetNamespace = "http://web.spectra.wind.gr/", wsdlLocation = "https://10.10.18.121:8181/SpectraWS_TEST/WebSpectraService?wsdl")
public class WebSpectraService extends Service
{

	private final static URL WEBSPECTRASERVICE_WSDL_LOCATION;
	private final static WebServiceException WEBSPECTRASERVICE_EXCEPTION;
	private final static QName WEBSPECTRASERVICE_QNAME = new QName("http://web.spectra.wind.gr/", "WebSpectraService");

	static
	{
		URL url = null;
		WebServiceException e = null;
		try
		{
			url = new URL("https://10.10.18.121:8181/SpectraWS_TEST/WebSpectraService?wsdl");
		} catch (MalformedURLException ex)
		{
			e = new WebServiceException(ex);
		}
		WEBSPECTRASERVICE_WSDL_LOCATION = url;
		WEBSPECTRASERVICE_EXCEPTION = e;
	}

	public WebSpectraService()
	{
		super(__getWsdlLocation(), WEBSPECTRASERVICE_QNAME);
	}

	public WebSpectraService(WebServiceFeature... features)
	{
		super(__getWsdlLocation(), WEBSPECTRASERVICE_QNAME, features);
	}

	public WebSpectraService(URL wsdlLocation)
	{
		super(wsdlLocation, WEBSPECTRASERVICE_QNAME);
	}

	public WebSpectraService(URL wsdlLocation, WebServiceFeature... features)
	{
		super(wsdlLocation, WEBSPECTRASERVICE_QNAME, features);
	}

	public WebSpectraService(URL wsdlLocation, QName serviceName)
	{
		super(wsdlLocation, serviceName);
	}

	public WebSpectraService(URL wsdlLocation, QName serviceName, WebServiceFeature... features)
	{
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return
	 *     returns InterfaceWebSpectra
	 */
	@WebEndpoint(name = "WebSpectraPort")
	public InterfaceWebSpectra getWebSpectraPort()
	{
		return super.getPort(new QName("http://web.spectra.wind.gr/", "WebSpectraPort"), InterfaceWebSpectra.class);
	}

	/**
	 *
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns InterfaceWebSpectra
	 */
	@WebEndpoint(name = "WebSpectraPort")
	public InterfaceWebSpectra getWebSpectraPort(WebServiceFeature... features)
	{
		return super.getPort(new QName("http://web.spectra.wind.gr/", "WebSpectraPort"), InterfaceWebSpectra.class,
				features);
	}

	private static URL __getWsdlLocation()
	{
		if (WEBSPECTRASERVICE_EXCEPTION != null)
		{
			throw WEBSPECTRASERVICE_EXCEPTION;
		}
		return WEBSPECTRASERVICE_WSDL_LOCATION;
	}

}