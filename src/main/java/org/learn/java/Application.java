package org.learn.java;

import java.lang.annotation.Annotation;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;

public class Application {

	public static void main(String[] args) {
		/*
		 * ClassB b = new ClassB(); ClassA a = new ClassA(); b.setA(a);
		 * System.out.println(b.getA().doSomething());
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		BeanFactory beanFactory = new ListableBeanFactory() {
			
			public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getBean(String name, Object... args) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T getBean(Class<T> requiredType) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getBean(String name) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getAliases(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean containsBean(String name) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType)
					throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons, boolean allowEagerInit)
					throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType, boolean allowEagerInit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType, boolean allowEagerInit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getBeanNamesForType(Class<?> type, boolean includeNonSingletons, boolean allowEagerInit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getBeanNamesForType(Class<?> type) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getBeanNamesForType(ResolvableType type) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getBeanDefinitionNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int getBeanDefinitionCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType)
					throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean containsBeanDefinition(String beanName) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
//		ClassB b1 = (ClassB) context.getBean("OurBetterBean");
		System.out.println("Application context loaded");
		/*
		 * ClassB b1 = context.getBean(ClassB.class); System.out.println(b1.getId());
		 * 
		 * ClassB b2 = context.getBean(ClassB.class); b2.setId(2020);
		 * System.out.println(b2.getId());
		 * 
		 * 
		 * System.out.println(b1.getId());
		 */
		((AnnotationConfigApplicationContext) context).close();
	}
}
