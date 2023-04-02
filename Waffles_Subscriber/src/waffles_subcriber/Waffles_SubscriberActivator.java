package waffles_subcriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import waffles_publisher.Waffles_PublisherInterface;

public class Waffles_SubscriberActivator implements BundleActivator {

	ServiceReference serviceReferance;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Waffles_SubscriberActivator.context = bundleContext;
		System.out.println("Waffle Consumer bundle started.");
		this.MainMethod();
		System.out.println("Waffle service started.");
	}
	
	private void MainMethod(){
		String user_option="no";
	
				ServiceReference serviceReference = context.getServiceReference(Waffles_PublisherInterface.class.getName());
				Waffles_PublisherInterface Milkshake_ProducerInterface =(Waffles_PublisherInterface)context.getService(serviceReference);
				SubmethodSubscriber.milkshake_producer(Milkshake_ProducerInterface);
				context.ungetService(serviceReference);
			
		
		while(user_option.equals("no"));	
		//submethodConsumer.PrintBill();
	}


	public void stop(BundleContext bundleContext) throws Exception {
		Waffles_SubscriberActivator.context = null;
		System.out.println("Waffle Consumer service stopped.");
	}

}
