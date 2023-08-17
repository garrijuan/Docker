package org.springframework.boot.autoconfigure.data.mongo;

import com.mongodb.reactivestreams.client.MongoClient;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.SimpleReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.gridfs.ReactiveGridFsTemplate;

/**
 * Bean definitions for {@link MongoReactiveDataAutoConfiguration}
 */
public class MongoReactiveDataAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoReactiveDataAutoConfiguration'
   */
  public static BeanDefinition getMongoReactiveDataAutoConfigurationBeanDefinition() {
    Class<?> beanType = MongoReactiveDataAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MongoReactiveDataAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'reactiveMongoDatabaseFactory'.
   */
  private static BeanInstanceSupplier<SimpleReactiveMongoDatabaseFactory> getReactiveMongoDatabaseFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SimpleReactiveMongoDatabaseFactory>forFactoryMethod(MongoReactiveDataAutoConfiguration.class, "reactiveMongoDatabaseFactory", MongoProperties.class, MongoClient.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveDataAutoConfiguration.class).reactiveMongoDatabaseFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'reactiveMongoDatabaseFactory'
   */
  public static BeanDefinition getReactiveMongoDatabaseFactoryBeanDefinition() {
    Class<?> beanType = SimpleReactiveMongoDatabaseFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getReactiveMongoDatabaseFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'reactiveMongoTemplate'.
   */
  private static BeanInstanceSupplier<ReactiveMongoTemplate> getReactiveMongoTemplateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ReactiveMongoTemplate>forFactoryMethod(MongoReactiveDataAutoConfiguration.class, "reactiveMongoTemplate", ReactiveMongoDatabaseFactory.class, MongoConverter.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveDataAutoConfiguration.class).reactiveMongoTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'reactiveMongoTemplate'
   */
  public static BeanDefinition getReactiveMongoTemplateBeanDefinition() {
    Class<?> beanType = ReactiveMongoTemplate.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getReactiveMongoTemplateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mappingMongoConverter'.
   */
  private static BeanInstanceSupplier<MappingMongoConverter> getMappingMongoConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MappingMongoConverter>forFactoryMethod(MongoReactiveDataAutoConfiguration.class, "mappingMongoConverter", MongoMappingContext.class, MongoCustomConversions.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveDataAutoConfiguration.class).mappingMongoConverter(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'mappingMongoConverter'
   */
  public static BeanDefinition getMappingMongoConverterBeanDefinition() {
    Class<?> beanType = MappingMongoConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMappingMongoConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataBufferFactory'.
   */
  private static BeanInstanceSupplier<DefaultDataBufferFactory> getDataBufferFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultDataBufferFactory>forFactoryMethod(MongoReactiveDataAutoConfiguration.class, "dataBufferFactory")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MongoReactiveDataAutoConfiguration.class).dataBufferFactory());
  }

  /**
   * Get the bean definition for 'dataBufferFactory'
   */
  public static BeanDefinition getDataBufferFactoryBeanDefinition() {
    Class<?> beanType = DefaultDataBufferFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDataBufferFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'reactiveGridFsTemplate'.
   */
  private static BeanInstanceSupplier<ReactiveGridFsTemplate> getReactiveGridFsTemplateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ReactiveGridFsTemplate>forFactoryMethod(MongoReactiveDataAutoConfiguration.class, "reactiveGridFsTemplate", ReactiveMongoDatabaseFactory.class, MappingMongoConverter.class, DataBufferFactory.class, MongoProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MongoReactiveDataAutoConfiguration.class).reactiveGridFsTemplate(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'reactiveGridFsTemplate'
   */
  public static BeanDefinition getReactiveGridFsTemplateBeanDefinition() {
    Class<?> beanType = ReactiveGridFsTemplate.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getReactiveGridFsTemplateInstanceSupplier());
    return beanDefinition;
  }
}
