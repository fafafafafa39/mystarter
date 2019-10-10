package com.skyblue.mystarter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties({MyStarterProperties.class})
@Import(MyStarterServiceImpl.class)
public class MyStarterAutoConfiguration {
//	@Bean
//    @ConditionalOnMissingBean(MyStartService.class)
//    public MyStartService demoService() {
//        return new MyStartServiceImpl();
//    }
}
