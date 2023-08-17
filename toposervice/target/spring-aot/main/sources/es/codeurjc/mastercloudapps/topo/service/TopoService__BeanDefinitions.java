package es.codeurjc.mastercloudapps.topo.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TopoService}
 */
public class TopoService__BeanDefinitions {
  /**
   * Get the bean definition for 'topoService'
   */
  public static BeanDefinition getTopoServiceBeanDefinition() {
    Class<?> beanType = TopoService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<TopoService> instanceSupplier = InstanceSupplier.using(TopoService::new);
    instanceSupplier = instanceSupplier.andThen(TopoService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
