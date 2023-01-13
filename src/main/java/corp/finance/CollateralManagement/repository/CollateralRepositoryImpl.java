package corp.finance.CollateralManagement.repository;

import corp.finance.CollateralManagement.model.Audit;
import corp.finance.CollateralManagement.model.Collateral;
import corp.finance.CollateralManagement.model.Valuation;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@AllArgsConstructor
@Repository
public class CollateralRepositoryImpl implements CollateralRepository {

    private Collateral collateral;

    @PostConstruct
    void init() {
        log.info("init()");
        Audit audit = Audit
                .builder()
                .createdBy("opr003")
                .createdOn(LocalDateTime.of(2021, Month.DECEMBER, 12, 10, 7))
                .updatedBy("opr004")
                .updatedOn(LocalDateTime.now())
                .build();
        Valuation valuation = Valuation
                .builder()
                .valuationId("vlt001")
                .valuationType("OnSite")
                .valuationName("Land")
                .valuatedOn(LocalDate.of(2021, Month.DECEMBER, 14))
                .audit(audit)
                .build();
        collateral = Collateral
                .builder()
                .collateralId("clt001")
                .collateralType("RealEstate")
                .collateralName("Land")
                .collateralType("OnSite")
                .valuation(valuation)
                .audit(audit)
                .build();
    }

    @Override
    public List<Collateral> getAllCollaterals() {
        return List.of(collateral);
    }

    @Override
    public List<Collateral> getCollaterals(List<String> collateralIds) {
        return getAllCollaterals()
                .stream()
                .filter(collateral -> collateralIds.contains(collateral.getCollateralId()))
                .collect(Collectors.toList());
    }

    @Override
    public Collateral getCollateral(String collateralId) {
        return getAllCollaterals()
                .stream()
                .filter(collateral -> collateralId.equals(collateral.getCollateralId()))
                .findFirst()
                .orElse(Collateral.builder().build());
    }
}
