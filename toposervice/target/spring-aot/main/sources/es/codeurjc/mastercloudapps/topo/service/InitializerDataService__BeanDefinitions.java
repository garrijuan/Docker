package es.codeurjc.mastercloudapps.topo.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link InitializerDataService}
 */
public class InitializerDataService__BeanDefinitions {
  /**
   * Get the bean definition for 'initializerDataService'
   */
  public static BeanDefinition getInitializerDataServiceBeanDefinition() {
    Class<?> beanType = InitializerDataService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInitMethodNames("init");
    InstanceSupplier<InitializerDataService> instanceSupplier = InstanceSupplier.using(InitializerDataService::new);
    instanceSupplier = instanceSupplier.andThen(InitializerDataService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
