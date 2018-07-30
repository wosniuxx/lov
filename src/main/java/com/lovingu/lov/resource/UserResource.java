package com.lovingu.lov.resource;

import com.lovingu.lov.User.UserInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @description: ${description}
 * @author: Niu Haoxuan
 * @create: 2018-07-30 18:04
 **/
@Path("/user")
public class UserResource {

  @GET
  @Path("/userInfo.json")
  public UserInfo getUserInfo() {
    UserInfo  user = UserInfo.builder()
        .id(100L)
        .wxOpenId(100L)
        .NickName("niu")
        .build();
    return user;
  }

}
