package com.example.manualdependencyinjection

import java.util.*

class NumberRepositoryImpl(private val random: Random) : NumberRepository {

    override fun generateNextNumber(): Int {

        return random.nextInt()

    }

}