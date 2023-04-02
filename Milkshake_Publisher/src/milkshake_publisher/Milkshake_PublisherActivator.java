package milkshake_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Milkshake_PublisherActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Milkshake_PublisherActivator.context = bundleContext;
		System.out.println("Milkshake bundle started.");
		this.milkshake_producer();
		System.out.println("Milkshake service started.");
	}
	
	private void milkshake_producer (){
		Milkshake_PublisherInterface milkshake_producer = new Milkshake_PublisherImplementation();
		context.registerService(Milkshake_PublisherInterface.class, milkshake_producer,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Milkshake_PublisherActivator.context = null;
		System.out.println("Milkshake service stopped.");
	}

}
