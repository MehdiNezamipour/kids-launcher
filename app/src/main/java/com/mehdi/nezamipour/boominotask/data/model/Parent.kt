package com.mehdi.nezamipour.boominotask.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class Parent(
    val userId: String,
    val displayName: String
)