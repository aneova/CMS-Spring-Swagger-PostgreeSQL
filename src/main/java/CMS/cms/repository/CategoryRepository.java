package CMS.cms.repository;

import CMS.cms.models.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

    List<Category> findByName(String name);
    List<Category> findByNameIgnoreCaseStartingWith(String name);

}
