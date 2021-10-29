package com.mehdi.nezamipour.boominotask.data.remote.source

import com.mehdi.nezamipour.boominotask.data.model.Parent
import com.mehdi.nezamipour.boominotask.data.base.Result
import java.io.IOException
import java.util.*

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<Parent> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = Parent(UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}