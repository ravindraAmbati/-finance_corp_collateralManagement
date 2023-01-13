package corp.finance.CollateralManagement.service;

import corp.finance.CollateralManagement.model.Collateral;

import java.util.List;

public interface CollateralService {

    List<Collateral> getAllCollaterals();

    List<Collateral> getCollaterals(List<String> collateralIds);

    Collateral getCollateral(String collateralId);
}
