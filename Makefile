PACKAGE = $(notdir $(shell pwd))
JAVASOURCES = $(notdir $(wildcard *.java))
TesterClass = classes/$(PACKAGE)/Tester.class

LIBDIR = ../../../../../../lib
CLASSPATH=$(LIBDIR)/positionList.jar:$(LIBDIR)/fifoaed.jar:$(LIBDIR)/lifoaed.jar

all: classes TesterClass

TesterClass: $(JAVASOURCES)
	javac -Xlint:unchecked -d classes -cp $(CLASSPATH) *.java

classes:
	mkdir -p classes

run: TesterClass
	java -cp classes:$(CLASSPATH) $(PACKAGE)/Tester
