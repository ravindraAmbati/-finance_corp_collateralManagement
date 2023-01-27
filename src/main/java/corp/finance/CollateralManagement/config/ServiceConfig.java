package corp.finance.CollateralManagement.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "collateral.management")
@Data
public class ServiceConfig {

    private String message;
    private String buildVersion;
    private Map<String, String> mailDetails;
}
