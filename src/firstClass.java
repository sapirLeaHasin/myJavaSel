import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class firstClass {

    public static void main(String[] args) {

        WebDriver wd;
        System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
        wd= new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp"); //טעינת הטבלה
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tblElement = wd.findElement(By.tagName("table"));
        int colNum;
        String searchTxt;
        call verifyTableCellText(tblElement,colNum,searchTxt,0,"");
        wd.close();
    }




    }
    public String getTableCellTextByXpath ( WebElement colTable, int colNum, String txtSearch, int ReturnCol) throws Exception
    {

        colTable=tblElement.findElement(by.xpath("//td["+colNum+"][text()='"+txtSearch+"']/../td["+returnColumnText+"]"));
        String colText=colTable.getText();
        return colText;


    }

    public boolean verifyTableCellText(WebElement table, int searchColumn, String searchText,
                                       int returnColumnText, String expectedText)
    {
        String returnFromFunc=getTableCellTextByXpath(table,searchColumn,searchText,returnColumnText,expectedText);
        boolean SucceedFunc;
        if (returnFromFunc.equals(searchText))
            SucceedFunc=true;
        else
            SucceedFunc=false;

        return SucceedFunc;
    }
}
