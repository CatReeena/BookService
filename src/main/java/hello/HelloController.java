package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shera on 22.03.2018.
 */

@Controller
public class HelloController {

    private final BookRepository bookRepository;

    public HelloController(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;

    }

//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        Book myBook = new Book();
        bookRepository.save(myBook);
        Book stillMyBook = bookRepository.findById(myBook.getId());
        stillMyBook.setGenre(Genre.SCIFI);
        bookRepository.save(stillMyBook);
        bookRepository.save(new Book());
        return "greeting";
    }

//    @Required
//    @Autowired
//    public void setBookRepository(final BookRepository bookRepository)
//    {
//        this.bookRepository = bookRepository;
//    }

}
