package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.output.Output;
import uz.pdp.warehouse.projection.CustomOutput;

@RepositoryRestResource(path = "output", collectionResourceRel = "list", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}