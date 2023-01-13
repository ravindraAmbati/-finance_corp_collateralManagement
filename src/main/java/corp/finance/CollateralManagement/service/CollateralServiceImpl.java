package corp.finance.CollateralManagement.service;

import corp.finance.CollateralManagement.model.Collateral;
import corp.finance.CollateralManagement.repository.CollateralRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class CollateralServiceImpl implements CollateralService {

    private final CollateralRepository collateralRepository;

    @Override
    public List<Collateral> getAllCollaterals() {
        return collateralRepository.getAllCollaterals();
    }

    @Override
    public List<Collateral> getCollaterals(List<String> collateralIds) {
        return collateralRepository.getCollaterals(collateralIds);
    }

    @Override
    public Collateral getCollateral(String collateralId) {
        return collateralRepository.getCollateral(collateralId);
    }
}
