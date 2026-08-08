## Relatório de Execução do Gradle
> Atualizado automaticamente pelo GitHub Actions.

```text

Welcome to Gradle 9.6.1!

Here are the highlights of this release:
 - Improved Configuration Cache hit rates
 - Additional CLI rendering options
 - Important project hierarchy lookup deprecations

For more details see https://docs.gradle.org/9.6.1/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)
> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses
> Task :checkstyleTest FAILED
> Task :checkstyleMain FAILED

FAILURE: Build completed with 2 failures.

1: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':checkstyleMain' (registered by plugin 'org.gradle.checkstyle').
> A failure occurred while executing org.gradle.api.plugins.quality.internal.CheckstyleAction
   > An unexpected error occurred configuring and executing Checkstyle.
      > Unable to create Root Module: config {/home/runner/work/teste-workflow/teste-workflow/config/checkstyle/checkstyle.xml}.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights from a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
==============================================================================

2: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':checkstyleTest' (registered by plugin 'org.gradle.checkstyle').
> A failure occurred while executing org.gradle.api.plugins.quality.internal.CheckstyleAction
   > An unexpected error occurred configuring and executing Checkstyle.
      > Unable to create Root Module: config {/home/runner/work/teste-workflow/teste-workflow/config/checkstyle/checkstyle.xml}.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights from a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
==============================================================================

BUILD FAILED in 17s
4 actionable tasks: 4 executed
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE

> Task :test FAILED

CalculatorTest > testSubtract() FAILED
    org.opentest4j.AssertionFailedError at CalculatorTest.java:16

5 tests completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/runner/work/teste-workflow/teste-workflow/build/reports/tests/test/index.html

* Try:
> Run with --scan to get full insights from a Build Scan (powered by Develocity).

BUILD FAILED in 2s
3 actionable tasks: 1 executed, 2 up-to-date
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE

> Task :test FAILED

CalculatorTest > testSubtract() FAILED
    org.opentest4j.AssertionFailedError at CalculatorTest.java:16

5 tests completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/runner/work/teste-workflow/teste-workflow/build/reports/tests/test/index.html

* Try:
> Run with --scan to get full insights from a Build Scan (powered by Develocity).

BUILD FAILED in 1s
3 actionable tasks: 1 executed, 2 up-to-date
```
