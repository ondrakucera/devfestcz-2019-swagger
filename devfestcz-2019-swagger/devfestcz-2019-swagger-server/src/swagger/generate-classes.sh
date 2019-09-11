#!/bin/sh

set -e

swagger-codegen generate -l spring --api-package ondra.restapi.controller --model-package ondra.restapi.dto --model-name-suffix Dto -DdelegatePattern=true,hideGenerationTimestamp=true,interfaceOnly=true,java8=true -i swagger.yaml -o output
cp -rf output/src/main ..
rm -rf output

swagger-codegen generate -l javascript --api-package client --model-package dto --model-name-suffix Dto -DusePromises=true,hideGenerationTimestamp=true,useES6=true -i swagger.yaml -o output
mkdir -p ../../../devfestcz-2019-swagger-client/src/restapi/
cp -rf output/src/* ../../../devfestcz-2019-swagger-client/src/restapi
rm -rf output
