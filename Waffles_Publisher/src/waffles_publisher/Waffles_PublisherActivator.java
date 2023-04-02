package waffles_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Waffles_PublisherActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Waffles_PublisherActivator.context = bundleContext;
		System.out.println("Waffle bundle started.");
		this.milkshake_producer();
		System.out.println("Waffle service started.");
	}
	
	private void milkshake_producer (){
		Waffles_PublisherInterface milkshake_producer = new Waffles_PublisherImplementation();
		context.registerService(Waffles_PublisherInterface.class, milkshake_producer,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Waffles_PublisherActivator.context = null;
		System.out.println("Waffle service stopped.");
	}

}
