import io.gatling.app.Gatling;
import io.gatling.core.config.GatlingPropertiesBuilder;

public class Engine {

  public static void main(String[] args) {
    GatlingPropertiesBuilder props = new GatlingPropertiesBuilder()
      .resourcesDirectory(IDEPathHelper.gradleResourcesDirectory.toString())
      .resultsDirectory(IDEPathHelper.resultsDirectory.toString())
      .binariesDirectory(IDEPathHelper.gradleBinariesDirectory.toString());

    Gatling.fromMap(props.build());
  }
}
//./gradlew gatlingRun
//If it is mandatory to execute only one script and u have a lot of scripts execute the followibg script in the console
//./gradlew gatlingRun-(packageName).(className)
