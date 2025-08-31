import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagement) {
        if (engagement >= 1000) {
            return "Viral";
        } else if (engagement >= 500) {
            return "Popular";
        } else if (engagement >= 100) {
            return "Good";
        } else if (engagement >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String title, int engagement) {
        System.out.println("Post: " + title);
        System.out.println("Engagement Score: " + engagement);
    }

    public void displayPostStats(String title, int engagement, String category) {
        displayPostStats(title, engagement);
        System.out.println("Category: " + category);
    }

    public Set<String> manageHashtags(String[] hashtags) {
        return new HashSet<>(Arrays.asList(hashtags));
    }

    public List<String> findTrendingPosts(List<String> posts, Map<String, Integer> engagements) {
        List<String> trending = new ArrayList<>();
        for (String post : posts) {
            int score = engagements.getOrDefault(post, 0); 
            if (score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public Set<String> getUniqueAuthors(String... authors) {
        return new HashSet<>(Arrays.asList(authors));
    }

    public static void main(String[] args) {
        PostManager pm = new PostManager();

        System.out.println("= Social Media Post Manager =\n");

        int engagement = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagement);
        pm.displayPostStats("Java Programming Tips", engagement, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        System.out.println("Unique Hashtags: " + pm.manageHashtags(hashtags));
        System.out.println();

        List<String> posts = Arrays.asList("Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide");
        Map<String, Integer> engagementMap = new HashMap<>();
        engagementMap.put("Java Programming Tips", 250);
        engagementMap.put("Advanced Java Tutorial", 850);
        engagementMap.put("Spring Boot Guide", 1200);

        System.out.println("Trending Posts: " + pm.findTrendingPosts(posts, engagementMap));
        System.out.println();

        Set<String> authors = pm.getUniqueAuthors("Dodoy", "Bebot", "Bembem", "Laloy", "Lolong");
        System.out.println("Unique Authors: " + authors);
    }
}
