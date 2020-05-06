package jp.mamori_i.app.data.api.profile

import io.reactivex.Single
import jp.mamori_i.app.data.model.ClearOrganizationCodeRequestBody
import jp.mamori_i.app.data.model.UpdateProfileRequestBody
import retrofit2.http.*

interface ProfileApiService {
    @PATCH("users/me/profile")
    fun updateProfile(@Header("Authorization") authorization: String, @Body body: UpdateProfileRequestBody): Single<Any>

    @HTTP(method = "DELETE", path = "users/me/organization", hasBody = true)
    fun clearOrganizationCode(@Header("Authorization") authorization: String, @Body body: ClearOrganizationCodeRequestBody): Single<Any>
}