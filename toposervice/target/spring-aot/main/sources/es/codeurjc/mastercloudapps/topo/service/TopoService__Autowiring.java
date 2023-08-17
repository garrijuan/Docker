package es.codeurjc.mastercloudapps.topo.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TopoService}.
 */
public class TopoService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TopoService apply(RegisteredBean registeredBean, TopoService instance) {
    AutowiredFieldValueResolver.forRequiredField("cityRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
