public class BookClass {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;
    private double averageRating;

    public BookClass(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        this.averageRating = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        String ratingLevel = getRatingLevel();
        System.out.println("Book: " + title + " by " + author + ", Average Rating: " + averageRating + ", Level: " + ratingLevel);
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 5) {
            averageRating = rating;
        } else {
            System.out.println("Error: Invalid rating: must be 1-5 stars");
        }
    }

    private String getRatingLevel() {
        if (averageRating >= 4.0) {
            return "Good";
        } else if (averageRating >= 3.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}
