#Makefile
.PHONY: run-dist

run-dist:
	gradle clean installDist
	./build/install/app/bin/app