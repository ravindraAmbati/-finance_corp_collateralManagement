package corp.finance.CollateralManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class CollateralManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollateralManagementApplication.class, args);
	}

}
