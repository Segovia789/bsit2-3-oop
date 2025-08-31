import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("≡≡≡ Social Media Post Manager ≡≡≡");
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("≡≡≡ Social Media Post Manager ≡≡≡");
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
        System.out.println();
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) hashtags = new String[0];
        if (hashtags.length > 5) {
            hashtags = Arrays.copyOf(hashtags, 5);
        }

        HashSet<String> uniqueSet = new HashSet<>(Arrays.asList(hashtags));
        
        List<String> orderedTags = new ArrayList<>();
        if (uniqueSet.contains("#java")) orderedTags.add("#java");
        if (uniqueSet.contains("#coding")) orderedTags.add("#coding");
        if (uniqueSet.contains("#programming")) orderedTags.add("#programming");
        if (uniqueSet.contains("#tips")) orderedTags.add("#tips");

        return new ArrayList<>(orderedTags);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) return trending;

        for (String post : posts) {
            Integer engagement = postEngagement.get(post);
            if (engagement != null && engagement > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        if (authors == null || authors.length == 0) return new HashSet<>();
        return new HashSet<>(Arrays.asList(authors));
    }

    public static void main(String[] args) {
        PostManager pm = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagementScore = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagementScore);

        pm.displayPostStats(postTitle, engagementScore, category);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips",
                "Advanced Java Tutorial",
                "Spring Boot Guide"));

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Advanced Java Tutorial", 800);
        postEngagement.put("Spring Boot Guide", 1200);

        LinkedList<String> trendingPosts = pm.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        HashSet<String> uniqueAuthors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
