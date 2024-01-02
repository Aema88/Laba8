
package doroshenko.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import doroshenko.objects.Grade;
import doroshenko.objects.Student;

@Repository
public interface Repo_Content extends JpaRepository<Student, Integer>{
    @Query("from disciplines where student_id= :id")
    List<Grade> getMarksByStId(@Param("id") int id);
}