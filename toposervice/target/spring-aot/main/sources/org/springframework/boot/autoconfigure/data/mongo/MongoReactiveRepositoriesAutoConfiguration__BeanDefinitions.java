package org.springframework.boot.autoconfigure.data.mongo;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MongoReactiveRepositoriesAutoConfiguration}
 */
public class MongoReactiveRepositoriesAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoReactiveRepositoriesAutoConfiguration'
   */
  public static BeanDefinition getMongoReactiveRepositoriesAutoConfigurationBeanDefinition() {
    Class<?> beanType = MongoReactiveRepositoriesAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MongoReactiveRepositoriesAutoConfiguration::new);
    return beanDefinition;
  }
}
