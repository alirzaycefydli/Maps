package com.example.maps.Remote;

import com.example.maps.Models.MyResponse;
import com.example.maps.Models.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
"Content-Type:application/json",
            "Authorization:key=AAAAEg2QgpI:APA91bGjqkojVby73H9LTmZqbuqZ8dFYlMUiySKAzCSwjHhZDVejEZ-kdm-bIIbw7YqVPyuDLfFdqt7DrdJsPcakogCcQlYylX3d8f05OBPkfApJvS6cy7XHnNxT64cZCx-WCwojHriU"
    })
    @POST("fcm/send")
    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);
}
