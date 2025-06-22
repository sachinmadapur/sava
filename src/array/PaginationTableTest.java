package array;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationTableTest {

    @Test
    public void SearchpaginationTableTest() {

        // The product name you are searching for in the table
        String expectedName = "Smartphone";

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Set timeouts and maximize browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        // Open the target web page
        driver.get("https://testautomationpractice.blogspot.com/");

        // This flag will become true if the product is found
        boolean found = false;

        // Loop through all pages one by one
        for (int i = 1; ; i++) {
            try {
                // Try to click the page number (like 1, 2, 3, etc.)
                driver.findElement(By.xpath("//a[text()='" + i + "']")).click();
            } catch (Exception e) {
                // If page number doesn't exist, stop the loop
                System.out.println("No more pages or page " + i + " doesn't exist.");
                break;
            }

            // Find the table on the page
            WebElement table = driver.findElement(By.id("productTable"));

            // Get all rows in the table
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            // Loop through each row
            for (WebElement row : rows) {
                // Get all cells (columns) in the current row
                List<WebElement> cells = row.findElements(By.tagName("td"));

                // Check if row is not empty and second column has the expected product name
                if (!cells.isEmpty() && cells.get(1).getText().equalsIgnoreCase(expectedName)) {
                    // Get price from the third column
                    String price = cells.get(2).getText();

                    // Click the button in the fourth column
                    cells.get(3).findElement(By.tagName("input")).click();

                    // Print the product details
                    System.out.println("Product found!");
                    System.out.println("Name  : " + expectedName);
                    System.out.println("Price : " + price);

                    // Set the flag to true and stop searching
                    found = true;
                    break;
                }
            }

            // If product is found, exit the outer loop
            if (found) {
                break;
            }
        }

        // If product not found after checking all pages
        if (!found) {
            System.out.println("Product '" + expectedName + "' not found on any page.");
        }

        // Close the browser
        driver.quit();
    }
}
