package applicationWeb.jurgenvrapi.services;

import applicationWeb.jurgenvrapi.entities.BlogPost;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BlogPostService {
    private List<BlogPost> blogPosts = new ArrayList<>();

    public BlogPostService() {
        BlogPost initialBlogPost = new BlogPost();
        initialBlogPost.setId(1L);
        initialBlogPost.setCategoria("test");
        initialBlogPost.setTitolo("Funziona");
        initialBlogPost.setCover("https://picsum.photos/200/300");
        initialBlogPost.setContenuto("credo di sì");
        initialBlogPost.setTempoDiLettura(5);

        blogPosts.add(initialBlogPost);
    }


    public List<BlogPost> getAllBlogPosts() {
        return new ArrayList<>(blogPosts);
    }

    public BlogPost getBlogPost(Long id) {
        Optional<BlogPost> blogPost = blogPosts.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();

        return blogPost.orElse(null);
    }

    public BlogPost createBlogPost(BlogPost blogPost) {
        blogPosts.add(blogPost);
        return blogPost;
    }

    public BlogPost updateBlogPost(Long id, BlogPost updatedBlogPost) {
        for (int i = 0; i < blogPosts.size(); i++) {
            if (blogPosts.get(i).getId().equals(id)) {
                blogPosts.set(i, updatedBlogPost);
                return updatedBlogPost;
            }
        }
        return null;
    }

    public void deleteBlogPost(Long id) {
        blogPosts.removeIf(b -> b.getId().equals(id));
    }
}
