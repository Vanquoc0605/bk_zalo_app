
package com.cntt.buivanquoc_bkzalo_app.Fragments;
import com.cntt.buivanquoc_bkzalo_app.Notifications.MyResponse;
import com.cntt.buivanquoc_bkzalo_app.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAPOW6uT0:APA91bF0vwqmKYfmOFLFRwEhPURF6_SPQnk3gjbpZhdpam-88MeffSX5H6wtAbv4Hp99L_mzmKksVdLYaeKVfAveZGgMRxobvZ4KL0FBFWNO8IqDKzTl-MmzkX9wtE4sdYEGgWeQB0ry"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}