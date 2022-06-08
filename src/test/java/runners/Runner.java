package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html"},
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@herokuApp",
        dryRun = false

)
public class Runner {
    /*
    Bir frameworkde bir tek Runner classi yeterli olabilir
    Runner classinda class bodysinde hicbir sey olmaz
    Runner classimizi önemli yapan 2 adet annotaion vardir
    @RunWith(Cucumber.class) notasyonu Runner class´ina calisma özelligi katar
    bu notasyon oldugu icin Cucumber frameworkümüzde JUnit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nerede bulacagini gösterir
    glue : step definitions dosyalarini nerede bulacagimizi gösterir
    tags : o an hangi tag´i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun=true; : testi calistirmadan sadece eksik adimlari bize verir
    dry
     */
}
