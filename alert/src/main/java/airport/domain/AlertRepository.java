package airport.domain;

import airport.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "alerts", path = "alerts")
public interface AlertRepository
    extends PagingAndSortingRepository<Alert, Long> {}
