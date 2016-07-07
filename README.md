# Sample program showing SLF4J working

This is a very simple Junit test which describes SLF4j behaviour. This Junit can be set to run against JUL logging or log4j dependeing what maven profile you enable.

### Enable JUL logging
'mvn clean package -P jdklog'

### Enable log4j logging
'mvn clean package -P log4j'

