jcstress-examples
========================
<nobr>[![Build Status](https://travis-ci.org/jwoschitz/jcstress-examples.svg?branch=master)](https://travis-ci.org/jwoschitz/jcstress-examples)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)</nobr>

The [Java Concurrency Stress tests (jcstress)](https://wiki.openjdk.java.net/display/CodeTools/jcstress) part of the OpenJDK and is an experimental harness and a suite of tests to aid the research in the correctness of concurrency support in the JVM, class libraries, and hardware.

This project provides an outline on how to build and execute jcstress test cases. It uses the [jcstress-gradle-plugin](https://github.com/jerzykrlk/jcstress-gradle-plugin) for gradle integration.

Usage
------------
Simply compile and run the tests via

```
gradle jcstress
```

This will generate a test report in `./build/reports/jcstress`

For further execution options refer to the [jcstress-gradle-plugin](https://github.com/jerzykrlk/jcstress-gradle-plugin) documentation.

Further references
------------
* [Samples provided within the jcstress project](http://hg.openjdk.java.net/code-tools/jcstress/file/tip/jcstress-samples/src/main/java/org/openjdk/jcstress/samples)
* [Slide deck about jcstress from Aleksey Shipilev: "Breaking Concurrency Bad"](https://shipilev.net/talks/jvmls-July2013-jcstress.pdf)