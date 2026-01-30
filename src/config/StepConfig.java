package config;

import config.core.Param;
import config.core.StepConfigName;

import java.util.Map;

public interface StepConfig {

    StepConfigName getStepName();

    Map<String, Param> getParams();

}
