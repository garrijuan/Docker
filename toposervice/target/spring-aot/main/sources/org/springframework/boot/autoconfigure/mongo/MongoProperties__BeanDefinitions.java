package org.springframework.boot.autoconfigure.mongo;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MongoProperties}
 */
public class MongoProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoProperties'
   */
  public static BeanDefinition getMongoPropertiesBeanDefinition() {
    Class<?> beanType = MongoProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MongoProperties::new);
    return beanDefinition;
  }
}
