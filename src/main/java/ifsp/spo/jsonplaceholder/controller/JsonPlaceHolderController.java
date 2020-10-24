package ifsp.spo.jsonplaceholder.controller;

import ifsp.spo.jsonplaceholder.service.JsonPlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class JsonPlaceHolderController {
    @Autowired
    private JsonPlaceHolderService jsonPlaceHolderService;

    @GetMapping
    public ResponseEntity<String> getPosts(){
        return jsonPlaceHolderService.getPosts();
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getPost(@PathVariable Integer id){
        return jsonPlaceHolderService.getPost(id);
    }
}