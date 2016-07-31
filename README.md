# selenium-example-bdd-selenide
A simple example of browser automation test with Gauge and Selenide

## Set up
You need to install Gauge and a Gauge Java plugin. 
See http://getgauge.io/documentation/user/current/getting_started/download_and_install.html.

After you successfully install Gauge, run:
```
$ gauge --install java
$ gauge --version                                                                                                                                                                                                         jdk1.8.0_65 ruby-2.1.8
Gauge version: 0.6.0

Plugins
-------
java (0.5.0)
```

## Usage
`mvn test`
This test has some procedures as follows.
* start Firefox and access Bing.com.
* input "selenide" in the textbox.
* click the search button.
* verify whether the "Selenide: concise UI tests in Java" link exists
