package spring.dependencyinjection;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.dependencyinjection.controller.*;
import spring.dependencyinjection.examplebean.FakeBeanData;
import spring.dependencyinjection.examplebean.FakeJMS;
import spring.dependencyinjection.examplebean.FakeYMLData;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController") ;
        System.out.println(i18nController.sayGreeting());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("--------------- My own");
        System.out.println(myController.sayHello());

        System.out.println("--------------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayGreeting());

        System.out.println("-------------- PRIMARY Bean");
        PrimaryBeanController primaryBeanController = (PrimaryBeanController) ctx.getBean("primaryBeanController");
        System.out.println(primaryBeanController.sayGreeting());

        System.out.println("------------  Animal Controller with profiles");
        AnimalsController animalsController = (AnimalsController) ctx.getBean("animalsController");
        System.out.println(animalsController.whichAreTheBest());

        System.out.println("-------------------------------------------Bean Configuration examples");
        FakeBeanData fakeBeanData = (FakeBeanData) ctx.getBean(FakeBeanData.class);
        System.out.println(fakeBeanData.getUsername());
        System.out.println(fakeBeanData.getUrl());

        System.out.println("-------------------------------------------Second source file");
        FakeJMS fakeJMS = (FakeJMS) ctx.getBean(FakeJMS.class);
        System.out.println(fakeJMS.getUsername());
        System.out.println(fakeJMS.getPasswd());
        System.out.println("-------------------------------------------YML config file");
        FakeYMLData fakeYMLData = (FakeYMLData) ctx.getBean(FakeYMLData.class);
        System.out.println(fakeYMLData.getUsername());

    }
}
