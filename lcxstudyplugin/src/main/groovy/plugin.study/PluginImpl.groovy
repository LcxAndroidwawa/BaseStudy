package plugin.study

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");
        project.task('testTask') << {
            println "Hello LCX gradle plugin"
        }
    }
}