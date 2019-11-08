#!/bin/sh

set -e

swagger-codegen generate -l typescript-fetch --api-package client --model-package dto --model-name-suffix Dto -DsupportsES6=true -i swagger.yaml -o output
mkdir -p ../../../devfestcz-2019-swagger-client/src/restapi/
cp -rf output/*.ts ../../../devfestcz-2019-swagger-client/src/restapi
rm -rf output
