package io.pivotal.data.config;

import io.pivotal.data.domain.Customer;
import io.pivotal.data.repo.CustomerRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableLogging;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.geode.config.annotation.UseMemberName;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemFireHttpSession;

@EnableLogging(logLevel = "info")
@UseMemberName("PccApiClient")
@EnableEntityDefinedRegions(basePackageClasses = Customer.class)
@EnableGemfireRepositories(basePackageClasses = CustomerRepo.class)
@EnableGemFireHttpSession(poolName = "DEFAULT")
@Configuration
public class CloudCacheConfig {

}