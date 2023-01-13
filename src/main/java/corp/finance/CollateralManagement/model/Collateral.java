package corp.finance.CollateralManagement.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Component
public class Collateral {

    private String collateralId;
    private String collateralName;
    private String collateralType;
    private Valuation valuation;
    private Audit audit;
}