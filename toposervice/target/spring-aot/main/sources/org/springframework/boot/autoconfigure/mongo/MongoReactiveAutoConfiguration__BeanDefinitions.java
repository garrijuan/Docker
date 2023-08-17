package org.springframework.boot.autoconfigure.mongo;

import com.mongodb.MongoClientSettings;
import com.mongodb.reactivestreams.client.MongoClient;
import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MongoReactiveAutoConfiguration}
 */
public class MongoReactiveAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoReactiveAutoConfiguration'
   */
  public static BeanDefinition getMongoReactiveAutoConfigurationBeanDefinition() {
    Class<?> beanType = MongoReactiveAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MongoReactiveAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'reactiveStreamsMongoClient'.
   */
  private static BeanInstanceSupplier<MongoClient> getReactiveStreamsMongoClientInstanceSupplier() {
    return BeanInstanceSupplier.<MongoClient>forFactoryMethod(MongoReactiveAutoConfiguration.class, "reactiveStreamsMongoClient", ObjectProvider.class, MongoClientSettings.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveAutoConfiguration.class).reactiveStreamsMongoClient(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'reactiveStreamsMongoClient'
   */
  public static BeanDefinition getReactiveStreamsMongoClientBeanDefinition() {
    Class<?> beanType = MongoClient.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getReactiveStreamsMongoClientInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration}
   */
  public static class MongoClientSettingsConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'mongoClientSettingsConfiguration'
     */
    public static BeanDefinition getMongoClientSettingsConfigurationBeanDefinition() {
      Class<?> beanType = MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoClientSettings'.
     */
    private static BeanInstanceSupplier<MongoClientSettings> getMongoClientSettingsInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoClientSettings>forFactoryMethod(MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration.class, "mongoClientSettings")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration.class).mongoClientSettings());
    }

    /**
     * Get the bean definition for 'mongoClientSettings'
     */
    public static BeanDefinition getMongoClientSettingsBeanDefinition() {
      Class<?> beanType = MongoClientSettings.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMongoClientSettingsInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoPropertiesCustomizer'.
     */
    private static BeanInstanceSupplier<MongoPropertiesClientSettingsBuilderCustomizer> getMongoPropertiesCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoPropertiesClientSettingsBuilderCustomizer>forFactoryMethod(MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration.class, "mongoPropertiesCustomizer", MongoProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveAutoConfiguration.MongoClientSettingsConfiguration.class).mongoPropertiesCustomizer(args.get(0)));
    }

    /**
     * Get the bean definition for 'mongoPropertiesCustomizer'
     */
    public static BeanDefinition getMongoPropertiesCustomizerBeanDefinition() {
      Class<?> beanType = MongoPropertiesClientSettingsBuilderCustomizer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMongoPropertiesCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link MongoReactiveAutoConfiguration.NettyDriverConfiguration}
   */
  public static class NettyDriverConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'nettyDriverConfiguration'
     */
    public static BeanDefinition getNettyDriverConfigurationBeanDefinition() {
      Class<?> beanType = MongoReactiveAutoConfiguration.NettyDriverConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(MongoReactiveAutoConfiguration.NettyDriverConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'nettyDriverCustomizer'.
     */
    private static BeanInstanceSupplier<MongoReactiveAutoConfiguration.NettyDriverMongoClientSettingsBuilderCustomizer> getNettyDriverCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoReactiveAutoConfiguration.NettyDriverMongoClientSettingsBuilderCustomizer>forFactoryMethod(MongoReactiveAutoConfiguration.NettyDriverConfiguration.class, "nettyDriverCustomizer", ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveAutoConfiguration.NettyDriverConfiguration.class).nettyDriverCustomizer(args.get(0)));
    }

    /**
     * Get the bean definition for 'nettyDriverCustomizer'
     */
    public static BeanDefinition getNettyDriverCustomizerBeanDefinition() {
      Class<?> beanType = MongoReactiveAutoConfiguration.NettyDriverMongoClientSettingsBuilderCustomizer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getNettyDriverCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
