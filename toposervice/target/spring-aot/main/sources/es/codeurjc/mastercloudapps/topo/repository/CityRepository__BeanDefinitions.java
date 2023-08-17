package es.codeurjc.mastercloudapps.topo.repository;

import java.lang.Class;
import java.lang.Object;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.data.mongodb.repository.support.ReactiveMongoRepositoryFactoryBean;
import org.springframework.data.repository.query.QueryLookupStrategy;

/**
 * Bean definitions for {@link CityRepository}
 */
public class CityRepository__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'cityRepository'.
   */
  private static BeanInstanceSupplier<ReactiveMongoRepositoryFactoryBean> getCityRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ReactiveMongoRepositoryFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new ReactiveMongoRepositoryFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'cityRepository'
   */
  public static BeanDefinition getCityRepositoryBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(ReactiveMongoRepositoryFactoryBean.class, CityRepository.class, Object.class, Object.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, "es.codeurjc.mastercloudapps.topo.repository.CityRepository");
    beanDefinition.getPropertyValues().addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
    beanDefinition.getPropertyValues().addPropertyValue("lazyInit", false);
    beanDefinition.getPropertyValues().addPropertyValue("namedQueries", new RuntimeBeanReference("mongo.named-queries#0"));
    beanDefinition.getPropertyValues().addPropertyValue("repositoryFragments", new RuntimeBeanReference("reactive mongodb.CityRepository.fragments#0"));
    beanDefinition.getPropertyValues().addPropertyValue("reactiveMongoOperations", new RuntimeBeanReference("reactiveMongoTemplate"));
    beanDefinition.getPropertyValues().addPropertyValue("createIndexesForQueryMethods", false);
    beanDefinition.setInstanceSupplier(getCityRepositoryInstanceSupplier());
    return beanDefinition;
  }
}
