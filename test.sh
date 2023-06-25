#!/bin/bash

while true
do
  curl -X POST -H "Content-Type: application/json" localhost:8080/shops
done
