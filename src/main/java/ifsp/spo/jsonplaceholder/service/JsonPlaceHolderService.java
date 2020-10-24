package ifsp.spo.jsonplaceholder.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class JsonPlaceHolderService {
    private final String url = "https://jsonplaceholder.typicode.com/posts";
    private final URI uri = URI.create(url);
    private RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getPosts() {
        return restTemplate.getForEntity(uri, String.class);
    }

    public ResponseEntity<String> getPost(Integer id) {
        return restTemplate.getForEntity(url.concat("/{id}"), String.class, id);
    }
}