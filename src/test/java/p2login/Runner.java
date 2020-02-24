package p2login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports1.json"})
@RunWith(Cucumber.class)

public class Runner {

	
}