package fuck.feign;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 大坑
 * <p>
 * FooConfiguration does not need to be annotated with @Configuration. However,
 * if it is, then take care to exclude it from any @ComponentScan that would otherwise
 * include this configuration as it will become the default source for feign.Decoder,
 * feign.Encoder, feign.Contract, etc.,
 * when specified. This can be avoided by putting it in a separate,
 * non-overlapping package from any @ComponentScan or @SpringBootApplication,
 * or it can be explicitly excluded in @ComponentScan.
 */
@Configuration
public class FeignConfig {

    @Bean
    public Contract feignConfiguration() {
        return new Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}