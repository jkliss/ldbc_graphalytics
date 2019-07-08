# Graphalytics Graphengine platform driver

Graphengine... (TODO: provide a short description on Graphengine). To execute Graphalytics benchmark on Graphengine, follow the steps in the Graphalytics tutorial on [Running Benchmark](https://github.com/ldbc/ldbc_graphalytics/wiki/Manual%3A-Running-Benchmark) with the Graphengine-specific instructions listed below.

### Obtain the platform driver
There are two possible ways to obtain the Graphengine platform driver:

 1. **Download the (prebuilt) [Graphengine platform driver](http://graphalytics.site/dist/stable/) distribution from our website.

 2. **Build the platform drivers**: 
  - Download the source code from this repository.
  - Execute `mvn clean package` in the root directory (See details in [Software Build](https://github.com/ldbc/ldbc_graphalytics/wiki/Documentation:-Software-Build)).
  - Extract the distribution from  `graphalytics-{graphalytics-version}-Graphengine-{platform-version}.tar.gz`.

### Verify the necessary prerequisites
The softwares listed below are required by the Graphengine platform driver, which should be properly configured in the cluster environment....

### Adjust the benchmark configurations
Adjust the Graphengine configurations in `config/platform.properties`...

