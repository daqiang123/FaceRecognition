package com.arcsoft.arcfacedemo.faceserver;

import com.arcsoft.arcfacedemo.activity.Contributor;
import com.arcsoft.arcfacedemo.model.FaceRegisterInfo;
import com.arcsoft.arcfacedemo.model.FaceSearchResDto;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;
import rx.Observable;

public interface InterfaceServer {

    @GET("/server")
    Call<Contributor> server();

    @Multipart
    @POST("/faceAdd")
    Call<ResponseBody> register(@Part MultipartBody.Part file,
                                @Part("groupId") RequestBody groupId,
                                @Part("name") RequestBody name);

    @POST("getTopOfFaceLibFromServer/{faceRegisterInfo}")
    Call<FaceSearchResDto> getTopOfFaceLibFromServer(@Body FaceRegisterInfo faceRegisterInfo);

}
