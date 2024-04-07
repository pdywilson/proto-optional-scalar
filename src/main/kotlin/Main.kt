package org.example

fun main() {
    val fooWithBar = Proto.Foo.newBuilder().setBar(0).build()
    val fooWithoutBar = Proto.Foo.newBuilder().build()

    println("fooWithBar value of Bar: ${fooWithBar.bar}")
    println("fooWithoutBar value of Bar: ${fooWithoutBar.bar}")
    println()
    println("fooWithBar has Bar? ${fooWithBar.hasBar()}")
    println("fooWithoutBar has Bar? ${fooWithoutBar.hasBar()}")
}