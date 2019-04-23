#!/bin/bash

PROTO_FILE=scmmessages.proto

protoc --proto_path=src/main/protobuf/ --java_out=src/main/java/ $PROTO_FILE
protoc --plugin=protoc-gen-grpc-java=/usr/local/bin/protoc-gen-grpc-java \
    --proto_path=src/main/protobuf/ --grpc-java_out=src/main/java/ $PROTO_FILE
