package es.codeurjc.mastercloudapps.topo.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TopoController}
 */
public class TopoController__BeanDefinitions {
  /**
   * Get the bean definition for 'topoController'
   */
  public static BeanDefinition getTopoControllerBeanDefinition() {
    Class<?> beanType = TopoController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<TopoController> instanceSupplier = InstanceSupplier.using(TopoController::new);
    instanceSupplier = instanceSupplier.andThen(TopoController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
