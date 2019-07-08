#!/usr/bin/bash
mvn archetype:generate -B \
 -DarchetypeGroupId=science.atlarge.graphalytics \
 -DarchetypeArtifactId=graphalytics-platforms-default-archetype \
 -DarchetypeVersion=1.0.0 \
 -DgroupId=science.atlarge.graphalytics \
 -Dpackage=science.atlarge \
 -DartifactId="graphalytics-platforms-Graphengine" -Dversion=0.1-SNAPSHOT \
 -Dplatform-name="Graphengine" \
 -Dplatform-acronym="Graphengine" \
 -Dplatform-version="2.0.9842" \
 -Ddeveloper-name="Julius Kliss"
