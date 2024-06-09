package fromliveweb.fetchingApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service  
public class ApiService {
    @Autowired
    private RestTemplate restTemplate;

    public String fetchPosts() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return restTemplate.getForObject(url, String.class);
    }
}
