package corp.finance.CollateralManagement.repository;

import corp.finance.CollateralManagement.model.Collateral;

import java.util.List;

public interface CollateralRepository {

    List<Collateral> getAllCollaterals();

    List<Collateral> getCollaterals(List<String> collateralIds);

    Collateral getCollateral(String id);
}
