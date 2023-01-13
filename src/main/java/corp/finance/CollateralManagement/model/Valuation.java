package corp.finance.CollateralManagement.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Component
public class Valuation {

    private String valuationId;
    private String valuationName;
    private String valuationType;
    private LocalDate valuatedOn;
    private LocalDate nextValuationDate;
    private LocalDate expireDate;
    private Audit audit;

    public LocalDate getNextValuationDate() {
        return this.getValuatedOn().plusYears(1);
    }

    public LocalDate getExpireDate(){
        return this.getValuatedOn().plusYears(5);
    }
}
