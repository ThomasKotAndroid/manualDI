package com.example.manualdependencyinjection


import java.util.*


class ApplicationContainer {

    val numberRepository: NumberRepository = NumberRepositoryImpl(Random())
}