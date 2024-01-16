package rachman.forniandi.repogithubalbum.networkUtils

import rachman.forniandi.repogithubalbum.models.ResponseSearchRepo
import rachman.forniandi.repogithubalbum.models.ResponseUserFollowersAndFollowing
import rachman.forniandi.repogithubalbum.models.ResponseUserRepoDetails
import rachman.forniandi.repogithubalbum.utils.ConstantsValue
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkService {

    @GET("search/users")
    @Headers("Authorization: token ${ConstantsValue.TOKEN}")
    fun searchUser(
        @Query("q") username: String
    ): Call<ResponseSearchRepo>

    @GET("users/{username}")
    @Headers("Authorization: token ${ConstantsValue.TOKEN}")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<ResponseUserRepoDetails>

    @GET("users/{username}/followers")
    @Headers("Authorization: token ${ConstantsValue.TOKEN}")
    fun getUserFollowers(
        @Path("username") username: String
    ): Call<List<ResponseUserFollowersAndFollowing>>

    @GET("users/{username}/following")
    @Headers("Authorization: token ${ConstantsValue.TOKEN}")
    fun getUserFollowings(
        @Path("username") username: String
    ): Call<List<ResponseUserFollowersAndFollowing>>
}