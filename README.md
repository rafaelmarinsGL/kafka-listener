# kafka-listener

This project is a listener for a Kafka Topic, that sends FormStack submission data to a Database:  

## This project depends on the configuration, of the following project:  
https://github.com/rafaelmarinsGL/formstack-kafka  

## Install Kafka  
brew install kafka  

## Clone and run project:  
gradle bootRun  

## Check Database populated with a FormStack submission:  
http://localhost:8081/h2  
jdbc:h2:~/l&c  
user:sa  
