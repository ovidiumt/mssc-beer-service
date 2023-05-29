package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID>, PagingAndSortingRepository<Beer,UUID> {
}
