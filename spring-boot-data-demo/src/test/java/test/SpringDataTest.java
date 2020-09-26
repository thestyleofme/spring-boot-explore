package test;

import java.util.List;
import java.util.Optional;

import com.github.codingdebugallday.SpringDataApplication;
import com.github.codingdebugallday.mapper.ArticleMapper;
import com.github.codingdebugallday.mapper.CommentMapper;
import com.github.codingdebugallday.pojo.Address;
import com.github.codingdebugallday.pojo.Comment;
import com.github.codingdebugallday.pojo.Person;
import com.github.codingdebugallday.repository.CommentRepository;
import com.github.codingdebugallday.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 22:28
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        SpringDataApplication.class
})
public class SpringDataTest {

    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void test() {
        // Comment comment = commentMapper.findById(1L);
        // System.out.println(comment);
        // Assert.assertNotNull(comment);

        // Article article = articleMapper.findById(1L);
        // System.out.println(article);
        // Assert.assertNotNull(article);

        Optional<Comment> optional = commentRepository.findById(1L);
        if(optional.isPresent()){
            Comment comment = optional.get();
            System.out.println(comment);
        }
    }

    @Test
    public void savePerson(){
        Person person = new Person();
        person.setFirstName("san");
        person.setLastName("zhang");
        Address address = new Address();
        address.setCity("北京");
        address.setCountry("中国");
        person.setAddress(address);
        personRepository.save(person);
    }

    @Test
    public void selectPerson(){
        List<Person> all = personRepository.findByAddressCity("北京");
        all.forEach(System.out::println);
    }
}
