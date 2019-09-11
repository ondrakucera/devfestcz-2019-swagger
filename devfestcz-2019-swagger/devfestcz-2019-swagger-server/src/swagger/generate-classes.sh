#!/bin/sh

swagger-codegen generate -l spring --api-package ondra.restapi.controller --model-package ondra.restapi.dto --model-name-suffix Dto -DdelegatePattern=true,hideGenerationTimestamp=true,interfaceOnly=true,java8=true -i openapi.yaml -o output
