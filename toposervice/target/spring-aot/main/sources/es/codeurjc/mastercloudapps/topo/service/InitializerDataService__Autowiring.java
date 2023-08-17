package es.codeurjc.mastercloudapps.topo.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link InitializerDataService}.
 */
public class InitializerDataService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static InitializerDataService apply(RegisteredBean registeredBean,
      InitializerDataService instance) {
    AutowiredFieldValueResolver.forRequiredField("cityRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
