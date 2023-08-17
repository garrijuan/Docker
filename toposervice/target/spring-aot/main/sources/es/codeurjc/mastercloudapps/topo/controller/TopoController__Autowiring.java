package es.codeurjc.mastercloudapps.topo.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TopoController}.
 */
public class TopoController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TopoController apply(RegisteredBean registeredBean, TopoController instance) {
    AutowiredFieldValueResolver.forRequiredField("topoService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
