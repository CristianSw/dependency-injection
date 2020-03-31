package spring.dependencyinjection.configuration;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import spring.dependencyinjection.examplebean.FakeBeanData;
import spring.dependencyinjection.examplebean.FakeJMS;
import spring.dependencyinjection.examplebean.FakeYMLData;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
    @Value("${admin.username}")
    String username;
    @Value("${admin.passwd}")
    String passwd;
    @Value("${admin.url}")
    String url;

    @Value("${jms.username}")
    String jmsUsername;
    @Value("${jms.passwd}")
    String jmsPasswd;
    @Value("${jms.url}")
    String jmsUrl;

    @Value("${user.username}")
    String ymlUsername;
    @Value("${user.passwd}")
    String ymlPasswd;
    @Value("${user.url}")
    String ymlUrl;

    @Bean
    public FakeBeanData fakeBeanData() {
        FakeBeanData fakeBeanData = new FakeBeanData();
        fakeBeanData.setUsername(username);
        fakeBeanData.setPasswd(passwd);
        fakeBeanData.setUrl(url);
        return fakeBeanData;
    }

    @Bean
    public FakeJMS fakeJMS() {
        FakeJMS fakeJMS = new FakeJMS();
        fakeJMS.setUsername(jmsUsername);
        fakeJMS.setPasswd(jmsPasswd);
        fakeJMS.setUrl(jmsUrl);
        return fakeJMS;
    }

    @Bean
    public FakeYMLData fakeYMLData() {
        FakeYMLData fakeYMLData = new FakeYMLData();
        fakeYMLData.setUsername(ymlUsername);
        fakeYMLData.setPasswd(ymlPasswd);
        fakeYMLData.setUrl(ymlUrl);
        return fakeYMLData;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
