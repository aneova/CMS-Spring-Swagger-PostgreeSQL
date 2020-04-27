package CMS.cms.resources;

import CMS.cms.models.News;
import CMS.cms.models.Review;
import CMS.cms.vo.NewsRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class NewsResource {

        @GetMapping(value = "/{id}")
        public ResponseEntity<News> findOne(@PathVariable("id") String id){
            return ResponseEntity.ok(new News());
        }

        @GetMapping
        public ResponseEntity<List<News>> findAll(){
            return ResponseEntity.ok(Arrays.asList(new News(),new News()));
        }

        @PostMapping
        public ResponseEntity<News> newNews(NewsRequest NewsRequest){
            return new ResponseEntity<>(new News(), HttpStatus.CREATED);
        }

        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void removeNews(@PathVariable("id") String id){
        }

        @PutMapping("/{id}")
        public ResponseEntity<News> updateNews(@PathVariable("id") String id,News NewsRequest){
            return new ResponseEntity<>(new News(), HttpStatus.OK);
        }

        @GetMapping(value="/{id}/review/{userID}")
        public ResponseEntity<Review> review(@PathVariable("id") String id, @PathVariable("userID") String userID)
        {
            return ResponseEntity.ok(new Review());
        }

        @GetMapping(value = "/revised")
        public ResponseEntity<List<News>> revisedNews() {
            return ResponseEntity.ok(Arrays.asList(new News(), new News()));
        }


    }
