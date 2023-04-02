package milkshake_subscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import milkshake_publisher.Milkshake_PublisherInterface;

public class MilkshakeSubscriberActivator implements BundleActivator {

	ServiceReference serviceReferance;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		MilkshakeSubscriberActivator.context = bundleContext;
		System.out.println("Milkshake Consumer bundle started.");
		this.MainMethod();
		System.out.println("Milkshake service started.");
	}
	
	private void MainMethod(){
		String user_option="no";
	
				ServiceReference serviceReference = context.getServiceReference(Milkshake_PublisherInterface.class.getName());
				Milkshake_PublisherInterface Milkshake_ProducerInterface =(Milkshake_PublisherInterface)context.getService(serviceReference);
				SubmethodSubscriber.milkshake_producer(Milkshake_ProducerInterface);
				context.ungetService(serviceReference);
			
		
		while(user_option.equals("no"));	
		//submethodConsumer.PrintBill();
	}


	public void stop(BundleContext bundleContext) throws Exception {
		MilkshakeSubscriberActivator.context = null;
		System.out.println("Milkshake Consumer service stopped.");
	}

}
