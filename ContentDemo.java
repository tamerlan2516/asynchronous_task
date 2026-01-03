import java.util.ArrayList;
import java.time.Year;

public class ContentDemo {

    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2022, 120, "4K"));
        items.add(new PodcastEpisode("Tech Weekly", 2023, 45, "Alice"));
        items.add(new PodcastEpisode("Dev Talk", 2021, 60, "Bob"));

        int currentYear = Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item + " | licenseCost=" +
                               item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " +
                                   d.getMaxDownloadsPerDay());
            }

            System.out.println();
        }
    }
          }
