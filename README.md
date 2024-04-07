# Why add optional to proto scalars?

This took me a while to understand so here is an example project.

## Build

```shell
./gradlew build
```

Then run the project, e.g. in IntelliJ.

## Explanation

Given a proto.proto:

```protobuf
syntax = "proto3";

message Foo {
    optional int32 bar = 1;
}
```

The `optional` enables checking "presence" of the field `bar`.

This gives the consumer the functions `hasBar()` 
which can be used to check whether `bar` was actually set or not.

This is important because if `bar` is not set by the producer, 
it still evaluates to the default value (`0` for `int32`) 
for the consumer.

Now, if `optional` is not set, the `hasBar()` function doesn't exist.
There is no way for the consumer to differentiate 
if the default value was set or 
if it was not set when evaluating `bar`.

Run the project for further clarification :) 

Note: For messages (within messages) this is not an issue as `hazzers` are provided.