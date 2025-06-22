package array;

import java.time.Duration;

public class SearchProductAcrossPages {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        String productName = "Smartphone";
        String productPrice = "$10.99";

        int totalPages = 4;
        int currentPage = 1;

        while (currentPage <= totalPages) {
            System.out.println(" Checking Page " + currentPage + "...");

            String rowXPath = "//table//tr[td[2][text()='" + productName + "'] and td[3][text()='" + productPrice + "']]";
            List<WebElement> rows = driver.findElements(By.xpath(rowXPath));

            if (rows.size() > 0) {
                WebElement row = rows.get(0);

                row.findElement(By.xpath("./td[4]/input")).click();

                String name = row.findElement(By.xpath("./td[2]")).getText();
                String price = row.findElement(By.xpath("./td[3]")).getText();

                System.out.println(" Product Found!");
                System.out.println("Name  : " + name);
                System.out.println("Price : " + price);

                break; // Exit the while loop immediately since product is found
            }

            // Only click to next page if currentPage < totalPages and the next page link exists
            if (currentPage < totalPages) {
                List<WebElement> nextPageLinks = driver.findElements(By.xpath("//a[.='" + (currentPage + 1) + "']"));

                if (nextPageLinks.size() == 0) {
                    System.out.println("Couldn't go to page " + (currentPage + 1));
                    break;
                } else {
                    nextPageLinks.get(0).click();
                    Thread.sleep(1000); // Wait for page to load
                }
            }

            currentPage++;
        }

        // Check if product was found by verifying presence on current page
        String checkFoundXPath = "//table//tr[td[2][text()='" + productName + "'] and td[3][text()='" + productPrice + "']]";
        if (driver.findElements(By.xpath(checkFoundXPath)).size() == 0) {
            System.out.println(" Product '" + productName + "' with price '" + productPrice + "' not found on any page.");
        }

        driver.quit();
    }
}
		