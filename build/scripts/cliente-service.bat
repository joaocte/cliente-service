@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  cliente-service startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and CLIENTE_SERVICE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\cliente-service-0.1.jar;%APP_HOME%\lib\micronaut-data-hibernate-jpa-3.4.1.jar;%APP_HOME%\lib\micronaut-kotlin-runtime-3.2.2.jar;%APP_HOME%\lib\micronaut-http-server-tomcat-3.2.3.jar;%APP_HOME%\lib\micronaut-jdbc-hikari-4.4.0.jar;%APP_HOME%\lib\micronaut-hibernate-jpa-4.4.0.jar;%APP_HOME%\lib\micronaut-data-runtime-3.4.1.jar;%APP_HOME%\lib\micronaut-data-model-3.4.1.jar;%APP_HOME%\lib\micronaut-data-tx-hibernate-3.4.1.jar;%APP_HOME%\lib\micronaut-servlet-engine-3.2.3.jar;%APP_HOME%\lib\micronaut-jdbc-4.4.0.jar;%APP_HOME%\lib\micronaut-data-tx-3.4.1.jar;%APP_HOME%\lib\micronaut-servlet-core-3.2.3.jar;%APP_HOME%\lib\micronaut-validation-3.5.1.jar;%APP_HOME%\lib\micronaut-http-client-3.5.1.jar;%APP_HOME%\lib\micronaut-http-netty-3.5.1.jar;%APP_HOME%\lib\micronaut-http-server-3.5.1.jar;%APP_HOME%\lib\micronaut-websocket-3.5.1.jar;%APP_HOME%\lib\micronaut-http-client-core-3.5.1.jar;%APP_HOME%\lib\micronaut-runtime-3.5.1.jar;%APP_HOME%\lib\micronaut-jackson-databind-3.5.1.jar;%APP_HOME%\lib\micronaut-jackson-core-3.5.1.jar;%APP_HOME%\lib\micronaut-json-core-3.5.1.jar;%APP_HOME%\lib\micronaut-context-3.5.1.jar;%APP_HOME%\lib\micronaut-aop-3.5.1.jar;%APP_HOME%\lib\micronaut-router-3.5.1.jar;%APP_HOME%\lib\micronaut-http-3.5.1.jar;%APP_HOME%\lib\micronaut-buffer-netty-3.5.1.jar;%APP_HOME%\lib\micronaut-inject-3.5.1.jar;%APP_HOME%\lib\jakarta.annotation-api-2.0.0.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.13.2.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.13.2.jar;%APP_HOME%\lib\jackson-databind-2.13.2.2.jar;%APP_HOME%\lib\jackson-annotations-2.13.2.jar;%APP_HOME%\lib\jackson-core-2.13.2.jar;%APP_HOME%\lib\jackson-module-kotlin-2.13.2.jar;%APP_HOME%\lib\kotlin-reflect-1.6.21.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.6.21.jar;%APP_HOME%\lib\mysql-connector-java-8.0.29.jar;%APP_HOME%\lib\logback-classic-1.2.11.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.77.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.77.Final.jar;%APP_HOME%\lib\netty-codec-http2-4.1.77.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.77.Final.jar;%APP_HOME%\lib\netty-handler-4.1.77.Final.jar;%APP_HOME%\lib\netty-codec-4.1.77.Final.jar;%APP_HOME%\lib\netty-transport-4.1.77.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.77.Final.jar;%APP_HOME%\lib\reactor-core-3.4.18.jar;%APP_HOME%\lib\micronaut-core-reactive-3.5.1.jar;%APP_HOME%\lib\reactive-streams-1.0.4.jar;%APP_HOME%\lib\HikariCP-4.0.3.jar;%APP_HOME%\lib\micronaut-core-3.5.1.jar;%APP_HOME%\lib\slf4j-api-1.7.36.jar;%APP_HOME%\lib\snakeyaml-1.30.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.6.21.jar;%APP_HOME%\lib\kotlin-stdlib-1.6.21.jar;%APP_HOME%\lib\protobuf-java-3.20.1.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.6.21.jar;%APP_HOME%\lib\javax.servlet-api-4.0.1.jar;%APP_HOME%\lib\hibernate-core-5.6.9.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.77.Final.jar;%APP_HOME%\lib\netty-common-4.1.77.Final.jar;%APP_HOME%\lib\logback-core-1.2.11.jar;%APP_HOME%\lib\jakarta.inject-api-2.0.1.jar;%APP_HOME%\lib\jakarta.persistence-api-2.2.3.jar;%APP_HOME%\lib\config-1.4.2.jar;%APP_HOME%\lib\tomcat-embed-core-9.0.63.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\jakarta.transaction-api-1.3.3.jar;%APP_HOME%\lib\jaxb-runtime-2.3.1.jar;%APP_HOME%\lib\jaxb-api-2.3.1.jar;%APP_HOME%\lib\hibernate-commons-annotations-5.1.2.Final.jar;%APP_HOME%\lib\jboss-logging-3.4.3.Final.jar;%APP_HOME%\lib\javax.persistence-api-2.2.jar;%APP_HOME%\lib\byte-buddy-1.12.9.jar;%APP_HOME%\lib\antlr-2.7.7.jar;%APP_HOME%\lib\jandex-2.4.2.Final.jar;%APP_HOME%\lib\classmate-1.5.1.jar;%APP_HOME%\lib\javax.activation-api-1.2.0.jar;%APP_HOME%\lib\tomcat-annotations-api-9.0.63.jar;%APP_HOME%\lib\txw2-2.3.1.jar;%APP_HOME%\lib\istack-commons-runtime-3.0.7.jar;%APP_HOME%\lib\stax-ex-1.8.jar;%APP_HOME%\lib\FastInfoset-1.2.15.jar


@rem Execute cliente-service
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %CLIENTE_SERVICE_OPTS%  -classpath "%CLASSPATH%" br.com.curso.ApplicationKt %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable CLIENTE_SERVICE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%CLIENTE_SERVICE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
